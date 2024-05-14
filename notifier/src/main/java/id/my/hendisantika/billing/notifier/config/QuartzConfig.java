package id.my.hendisantika.billing.notifier.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:41
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@RequiredArgsConstructor
public class QuartzConfig {
    private final ApplicationContext applicationContext;

    @Bean
    public JobDetailFactoryBean jobDetail() {
        JobDetailFactoryBean jobDetailFactory = new JobDetailFactoryBean();
        jobDetailFactory.setJobClass(NotificationJob.class);
        jobDetailFactory.setDescription("Invoke Notification Job...");
        jobDetailFactory.setDurability(true);
        return jobDetailFactory;
    }
}
