package id.my.hendisantika.billing.notifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:35
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("id.my.hendisantika.billing.notifier")
@PropertySource("classpath:notifier.properties")
public class AppConfig {
}
