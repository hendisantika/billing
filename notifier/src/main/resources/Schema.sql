DROP SCHEMA notifier CASCADE;
CREATE SCHEMA notifier;

-- CUSTOMER
CREATE SEQUENCE notifier.s_customer START WITH 1 INCREMENT BY 1;
CREATE TABLE notifier.customer
(
    id         INTEGER DEFAULT nextval('NOTIFIER.S_CUSTOMER') PRIMARY KEY,
    first_name text,
    last_name  text,
    email      text,
    mobile     text
);

-- BILLING
CREATE SEQUENCE notifier.s_billing START WITH 1 INCREMENT BY 1;
CREATE TABLE notifier.billing
(
    id                          INTEGER DEFAULT nextval('NOTIFIER.S_BILLING') PRIMARY KEY,
    amount                      NUMERIC,
    customer_id                 INTEGER REFERENCES notifier.customer (id),
    due_date                    TIMESTAMP,
    billing_notification_status text,
    created_date                TIMESTAMP,
    changed_date                TIMESTAMP
);

-- EMAIL_NOTIFICATION
CREATE SEQUENCE notifier.s_email_notification START WITH 1 INCREMENT BY 1;
CREATE TABLE notifier.email_notification
(
    id           INTEGER DEFAULT nextval('NOTIFIER.S_EMAIL_NOTIFICATION') PRIMARY KEY,
    content      text,
    address      text,
    status       text,
    created_date TIMESTAMP,
    changed_date TIMESTAMP
);

-- SMS_NOTIFICATION
CREATE SEQUENCE notifier.s_sms_notification START WITH 1 INCREMENT BY 1;
CREATE TABLE notifier.sms_notification
(
    id           INTEGER DEFAULT nextval('NOTIFIER.S_SMS_NOTIFICATION') PRIMARY KEY,
    content      text,
    mobile       text,
    status       text,
    created_date TIMESTAMP,
    changed_date TIMESTAMP
);
