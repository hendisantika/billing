-- CUSTOMER
INSERT INTO notifier.customer(first_name, last_name, email, mobile)
VALUES ('Itadori', 'Yuji', 'yuji@yopmail.com', '0790469860');
VALUES ('Megumi', 'Fushiguro', 'megumi@yopmail.com', '0790469860');
VALUES ('Gojo', 'Satoru', 'gojo@yopmail.com', '0790469860');

-- BILLING

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (2000, 1, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (4000, 1, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (3000, 1, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (3500, 1, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (1000, 1, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (5000, 1, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

VALUES (2000, 2, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (4000, 2, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (3000, 2, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (3500, 2, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (1000, 2, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (5000, 2, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

VALUES (2000, 3, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (4000, 3, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (3000, 3, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (3500, 3, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (1000, 3, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);

INSERT INTO notifier.billing (amount, customer_id, due_date, billing_notification_status, created_date, changed_date)
VALUES (5000, 3, CURRENT_TIMESTAMP, 'NEW', CURRENT_TIMESTAMP, NULL);
