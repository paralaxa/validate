package sk.stopangin.validate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Size;

/**
 * Created by stopangin on 10/3/2017.
 */
@Service
public class SomeDummyService {
    private Logger log = LoggerFactory.getLogger(SomeDummyService.class);

    public void doSomething(@Size(min=2) Dummy data){
        log.debug("Doing something with data {}", data);
    }
}
