package id.my.hendisantika.emailsender.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 09:07
 * To change this template use File | Settings | File Templates.
 */
public class Bootstrap {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AppConfig.class, QuartzConfig.class);
    }
}
