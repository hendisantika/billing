package id.my.hendisantika.billing.notifier.service;

import id.my.hendisantika.billing.notifier.dao.EmailNotificationDao;
import id.my.hendisantika.billing.notifier.model.EmailNotification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 10:05
 * To change this template use File | Settings | File Templates.
 */
@Transactional
@Service
public class EmailNotificationService {
    private EmailNotificationDao emailNotificationDao;

    public long add(EmailNotification emailNotification) {
        return emailNotificationDao.add(emailNotification);
    }
}
