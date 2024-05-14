package id.my.hendisantika.billing.emailsender.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:01
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("id.my.hendisantika.emailsender")
@PropertySource("classpath:email.properties")
@RequiredArgsConstructor
public class AppConfig {
    private final Environment environment;

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(environment.getProperty("db.driver"));
        dataSource.setJdbcUrl(environment.getProperty("db.url"));
        dataSource.setUsername(environment.getProperty("db.username"));
        dataSource.setPassword(environment.getProperty("db.password"));
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource());
        factory.setPackagesToScan("id.my.hendisantika.emailsender.model");
        factory.setJpaVendorAdapter(jpaVendorAdapter());
        factory.setJpaProperties(jpaProperties());
        return factory;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    @Bean
    public Properties jpaProperties() {
        Properties properties = new Properties();
        properties.put(AvailableSettings.DIALECT, environment.getRequiredProperty("hibernate.dialect"));
        properties.put(AvailableSettings.SHOW_SQL, environment.getRequiredProperty("hibernate.show_sql"));
        properties.put(AvailableSettings.FORMAT_SQL, environment.getRequiredProperty("hibernate.format_sql"));
        properties.put(AvailableSettings.DEFAULT_SCHEMA, environment.getRequiredProperty("hibernate.default_schema"));
        return properties;
    }

    @Bean
    public JpaTransactionManager geJpaTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
        return transactionManager;
    }


    @Bean
    public JavaMailSender getMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(environment.getProperty("mail.host"));
        mailSender.setPort(Integer.parseInt(environment.getProperty("mail.port")));
        mailSender.setUsername(environment.getProperty("mail.username"));
        mailSender.setPassword(environment.getProperty("mail.password"));

        Properties javaMailProperties = new Properties();
        javaMailProperties.put("mail.smtp.starttls.enable", environment.getProperty("mail.tls"));
        javaMailProperties.put("mail.smtp.auth", environment.getProperty("mail.smtp.auth"));
        javaMailProperties.put("mail.transport.protocol", environment.getProperty("mail.transport.protocol"));
        javaMailProperties.put("mail.debug", environment.getProperty("mail.debug"));

        mailSender.setJavaMailProperties(javaMailProperties);
        return mailSender;
    }
}
