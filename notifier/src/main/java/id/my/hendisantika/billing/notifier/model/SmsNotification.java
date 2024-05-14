package id.my.hendisantika.billing.notifier.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:50
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "SMS_NOTIFICATION")
@SequenceGenerator(name = "NOTIFIER.S_SMS_NOTIFICATION", sequenceName = "NOTIFIER.S_SMS_NOTIFICATION", allocationSize = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NOTIFIER.S_SMS_NOTIFICATION")
    @Column(name = "ID")
    private long id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private NotificationStatus status;

    @Column(name = "CREATED_DATE")
    private Instant createdDate;

    @Column(name = "CHANGED_DATE")
    private Instant changedDate;
}
