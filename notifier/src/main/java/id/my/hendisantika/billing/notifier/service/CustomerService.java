package id.my.hendisantika.billing.notifier.service;

import id.my.hendisantika.billing.notifier.dao.CustomerDao;
import id.my.hendisantika.billing.notifier.exception.NotFoundException;
import id.my.hendisantika.billing.notifier.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : billing
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 10:13
 * To change this template use File | Settings | File Templates.
 */
@Transactional
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerDao customerDao;

    public Customer findById(long id) throws NotFoundException {
        return customerDao.findById(id).orElseThrow(() ->
                new NotFoundException("Customer with id " + id + " not found."));
    }
}
