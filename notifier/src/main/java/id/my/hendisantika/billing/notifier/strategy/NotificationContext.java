package id.my.hendisantika.billing.notifier.strategy;

import id.my.hendisantika.billing.notifier.model.NotificationType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:51
 * To change this template use File | Settings | File Templates.
 */
@Component
public class NotificationContext {

    private final Map<NotificationType, NotificationStrategy> strategies = new HashMap<>();
}
