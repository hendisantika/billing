package id.my.hendisantika.emailsender.service;

import id.my.hendisantika.emailsender.model.EmailNotification;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:13
 * To change this template use File | Settings | File Templates.
 */
@Transactional
@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    @Value("${mail.subject}")
    private String subject;

    @Value("${mail.from}")
    private String from;

    public void send(EmailNotification emailNotification) {
        try {
            mailSender.send(getMessagePreparation(emailNotification));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private MimeMessagePreparator getMessagePreparation(EmailNotification emailNotification) {
        MimeMessagePreparator preparation = new MimeMessagePreparator() {
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
                helper.setSubject(subject);
                helper.setFrom(from);
                helper.setTo(emailNotification.getAddress());
                helper.setText(emailNotification.getContent(), true);
            }
        };
        return preparation;
    }
}
