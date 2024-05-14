package id.my.hendisantika.billing.notifier.strategy;

import id.my.hendisantika.billing.notifier.model.Billing;
import id.my.hendisantika.billing.notifier.model.Customer;
import id.my.hendisantika.billing.notifier.model.NotificationType;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:52
 * To change this template use File | Settings | File Templates.
 */
public interface NotificationStrategy {
    boolean match(NotificationType type);

    void generate(Billing billing, Customer customer) throws Exception;
}
