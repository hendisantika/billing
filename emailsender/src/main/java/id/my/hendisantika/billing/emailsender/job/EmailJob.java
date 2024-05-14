package id.my.hendisantika.billing.emailsender.job;

import id.my.hendisantika.billing.emailsender.service.EmailProcessorService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:13
 * To change this template use File | Settings | File Templates.
 */
@Component
public class EmailJob implements Job {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailJob.class);

    private EmailProcessorService emailProcessorService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        emailProcessorService.process();
    }

    @Autowired
    public void setEmailProcessorService(EmailProcessorService emailProcessorService) {
        this.emailProcessorService = emailProcessorService;
    }
}
