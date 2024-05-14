package id.my.hendisantika.billing.notifier.strategy.impl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import id.my.hendisantika.billing.notifier.strategy.NotificationStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:55
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Component
public class SmsStrategy implements NotificationStrategy {
    private SmsNotificationService smsNotificationService;
    private Template template;
    private Configuration freeMarkerConfiguration;

}
