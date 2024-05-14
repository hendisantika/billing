package id.my.hendisantika.billing.notifier.dao;

import id.my.hendisantika.billing.notifier.model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class CustomerDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Optional<Customer> findById(long id) {
        return Optional.ofNullable(entityManager.find(Customer.class, id));
    }
}
