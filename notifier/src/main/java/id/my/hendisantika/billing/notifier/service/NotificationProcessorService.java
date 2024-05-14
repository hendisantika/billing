package id.my.hendisantika.billing.notifier.service;

import id.my.hendisantika.billing.notifier.model.Billing;
import id.my.hendisantika.billing.notifier.model.BillingNotificationStatus;
import id.my.hendisantika.billing.notifier.model.Customer;
import id.my.hendisantika.billing.notifier.model.NotificationType;
import id.my.hendisantika.billing.notifier.strategy.NotificationContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

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

    public void process() {
        Instant tomorrow = Instant.now().plus(1, ChronoUnit.DAYS);
        List<Billing> billings = billingService.findByDueDate(tomorrow);

        for (Billing billing : billings) {

            try {
                Customer customer = customerService.findById(billing.getCustomerId());
                for (NotificationType type : NotificationType.values()) {
                    notificationContext.generate(type, billing, customer);
                }

                billing.setBillingNotificationStatus(BillingNotificationStatus.GENERATED);
                billing.setChangedDate(Instant.now());
                billingService.update(billing);

            } catch (Exception e) {
                billing.setBillingNotificationStatus(BillingNotificationStatus.FAILED);
                billing.setChangedDate(Instant.now());
                billingService.update(billing);
            }
        }
    }
}
