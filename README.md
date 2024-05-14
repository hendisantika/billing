# billing
Spring Boot App about Billing App

# Notification System

notifying customers who their payment due date is the next day by sending email and sms. I developed this system to be
asynchronous; to do this I used shared database and also I developed three applications: notifier, emilsender and
smssender

Notifier is responsible for running the scheduler every night and find billings should be paid until tomorrow, for each
billing generate the content of email and sms, then insert a record of (generated content, email address, status,...) in
email_notification table and a record of (generated content, mobile, status,...) in sms_notification table. In this
application I used postgresql, hibernate, spring(java config), quartz scheduler, freemarker as a template engine, java 8
and maven.

Email-sender application is responsible for sending email; query data from email_notification table and use java mail to
connect to the mail server and send emails.

It is also possible to replace shared database with MOM which in this case can be ActiveMQ.
