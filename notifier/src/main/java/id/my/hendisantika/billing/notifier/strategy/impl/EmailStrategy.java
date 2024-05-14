package id.my.hendisantika.billing.notifier.strategy.impl;

import freemarker.template.Template;
import id.my.hendisantika.billing.notifier.model.NotificationType;
import id.my.hendisantika.billing.notifier.strategy.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:53
 * To change this template use File | Settings | File Templates.
 */
@Component
public class EmailStrategy implements NotificationStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationProcessorServiceImpl.class);

    private EmailNotificationService emailNotificationService;
    private Template template;
    private Configuration freeMarkerConfiguration;

    @Override
    public boolean match(NotificationType type) {
        return type == NotificationType.EMAIL;
    }
}
