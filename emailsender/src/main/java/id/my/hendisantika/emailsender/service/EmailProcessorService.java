package id.my.hendisantika.emailsender.service;

import id.my.hendisantika.emailsender.model.EmailNotification;
import id.my.hendisantika.emailsender.model.NotificationStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:20
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class EmailProcessorService {
    private final EmailNotificationService emailNotificationService;
    private final EmailService emailService;

    public void process() {
        List<EmailNotification> emailNotifications = emailNotificationService.find();
        for (EmailNotification emailNotification : emailNotifications) {
            try {
                emailService.send(emailNotification);
                emailNotification.setStatus(NotificationStatus.SENT);
                emailNotification.setChangedDate(Instant.now());
                emailNotificationService.update(emailNotification);
            } catch (Exception e) {
                emailNotification.setStatus(NotificationStatus.FAILED);
                emailNotification.setChangedDate(Instant.now());
                emailNotificationService.update(emailNotification);
            }
        }
    }
}
