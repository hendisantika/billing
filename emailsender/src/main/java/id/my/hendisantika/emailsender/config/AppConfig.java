package id.my.hendisantika.emailsender.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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
}
