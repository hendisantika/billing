package id.my.hendisantika.billing.notifier.service;

import id.my.hendisantika.billing.notifier.dao.SmsNotificationDao;
import id.my.hendisantika.billing.notifier.model.SmsNotification;
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
 * Time: 10:16
 * To change this template use File | Settings | File Templates.
 */
@Transactional
@Service
@RequiredArgsConstructor
public class SmsNotificationService {
    private final SmsNotificationDao smsNotificationDao;

    public long add(SmsNotification smsNotification) {
        return smsNotificationDao.add(smsNotification);
    }
}
