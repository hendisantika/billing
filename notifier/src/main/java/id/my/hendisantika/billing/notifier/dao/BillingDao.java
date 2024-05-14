package id.my.hendisantika.billing.notifier.dao;

import id.my.hendisantika.billing.notifier.model.Billing;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 10:07
 * To change this template use File | Settings | File Templates.
 */
@Repository
@RequiredArgsConstructor
public class BillingDao {
    @PersistenceContext
    private final EntityManager entityManager;

    public List<Billing> findByDueDate(Instant instant) {
        Query query = entityManager.createQuery("from Billing where dueDate <= :instant and billingNotificationStatus='NEW'");
        query.setParameter("instant", instant);
        return query.getResultList();
    }

    public void update(Billing entity) {
        entityManager.merge(entity);
    }
}
