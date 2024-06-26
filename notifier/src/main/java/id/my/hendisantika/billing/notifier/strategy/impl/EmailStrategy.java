package id.my.hendisantika.billing.notifier.strategy.impl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import id.my.hendisantika.billing.notifier.model.Billing;
import id.my.hendisantika.billing.notifier.model.Customer;
import id.my.hendisantika.billing.notifier.model.EmailNotification;
import id.my.hendisantika.billing.notifier.model.NotificationStatus;
import id.my.hendisantika.billing.notifier.model.NotificationType;
import id.my.hendisantika.billing.notifier.service.EmailNotificationService;
import id.my.hendisantika.billing.notifier.strategy.NotificationStrategy;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

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
@Slf4j
@Component
public class EmailStrategy implements NotificationStrategy {

    private EmailNotificationService emailNotificationService;
    private Template template;
    private Configuration freeMarkerConfiguration;

    @Override
    public boolean match(NotificationType type) {
        return type == NotificationType.EMAIL;
    }

    @Override
    public void generate(Billing billing, Customer customer) throws Exception {

        Map<String, Object> model = new HashMap<>();
        model.put("billing", billing);
        model.put("customer", customer);

        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

        EmailNotification emailNotification = new EmailNotification();
        emailNotification.setContent(content);
        emailNotification.setAddress(customer.getEmail());
        emailNotification.setStatus(NotificationStatus.NEW);
        emailNotification.setCreatedDate(Instant.now());
        emailNotificationService.add(emailNotification);
    }

    @Autowired
    public void setEmailNotificationService(EmailNotificationService emailNotificationService) {
        this.emailNotificationService = emailNotificationService;
    }

    @PostConstruct
    public void init() throws IOException {
        template = freeMarkerConfiguration.getTemplate("email.ftl");
    }

    @Autowired
    public void setFreeMarkerConfiguration(Configuration freeMarkerConfiguration) {
        this.freeMarkerConfiguration = freeMarkerConfiguration;
    }
}
