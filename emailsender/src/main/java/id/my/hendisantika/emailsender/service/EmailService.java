package id.my.hendisantika.emailsender.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
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
public class EmailService {
    private JavaMailSender mailSender;

    @Value("${mail.subject}")
    private String subject;

    @Value("${mail.from}")
    private String from;
}
