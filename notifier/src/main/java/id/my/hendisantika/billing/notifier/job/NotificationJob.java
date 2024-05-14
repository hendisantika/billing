package id.my.hendisantika.billing.notifier.job;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:43
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationJob implements Job {


    private final NotificationProcessorService notificationProcessorService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        notificationProcessorService.process();
    }

}
