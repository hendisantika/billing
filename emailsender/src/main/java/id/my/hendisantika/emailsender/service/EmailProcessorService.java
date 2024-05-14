package id.my.hendisantika.emailsender.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
