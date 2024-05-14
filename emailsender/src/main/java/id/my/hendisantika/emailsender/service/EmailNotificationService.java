package id.my.hendisantika.emailsender.service;

import id.my.hendisantika.emailsender.dao.EmailNotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:16
 * To change this template use File | Settings | File Templates.
 */
@Transactional
@Service
@RequiredArgsConstructor
public class EmailNotificationService {
    private final EmailNotificationRepository emailNotificationRepository;
}
