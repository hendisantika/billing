package id.my.hendisantika.billing.notifier.dao;

import id.my.hendisantika.billing.notifier.model.EmailNotification;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

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
@Repository
public class EmailNotificationDao {
    @PersistenceContext
    private EntityManager entityManager;

    public long add(EmailNotification emailNotification) {
        entityManager.persist(emailNotification);
        return emailNotification.getId();
    }
}
