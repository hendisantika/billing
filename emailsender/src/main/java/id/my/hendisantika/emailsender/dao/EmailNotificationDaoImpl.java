package id.my.hendisantika.emailsender.dao;

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
 * Time: 09:18
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class EmailNotificationDaoImpl implements EmailNotificationRepository {

    @PersistenceContext
    private EntityManager entityManager;

}
