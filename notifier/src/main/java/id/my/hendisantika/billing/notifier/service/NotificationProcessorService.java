package id.my.hendisantika.billing.notifier.service;

import id.my.hendisantika.billing.notifier.strategy.NotificationContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class NotificationProcessorService {
    private final CustomerService customerService;
    private final BillingService billingService;
    private final NotificationContext notificationContext;
}
