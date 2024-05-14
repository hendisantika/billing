package id.my.hendisantika.billing.emailsender.dao;

import id.my.hendisantika.billing.emailsender.model.EmailNotification;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:18
 * To change this template use File | Settings | File Templates.
 */
public interface EmailNotificationRepository {
    List<EmailNotification> find();

    void update(EmailNotification emailNotification);
}
