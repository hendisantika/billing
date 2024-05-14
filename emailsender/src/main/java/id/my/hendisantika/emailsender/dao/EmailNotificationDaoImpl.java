package id.my.hendisantika.emailsender.dao;

import id.my.hendisantika.emailsender.model.EmailNotification;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

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
@Repository
public class EmailNotificationDaoImpl implements EmailNotificationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<EmailNotification> find() {
        Query query = entityManager.createQuery("from EmailNotification e where e.status='NEW'");
        return query.getResultList();
    }
}
