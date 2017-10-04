package sk.stopangin.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stopangin on 10/3/2017.
 */
@RestController
@RequestMapping("/rest")
public class SomeDummyController {
    @Autowired
    SomeDummyService someDummyService;

    @RequestMapping(value="do",method = RequestMethod.GET)
    public void doSOmething(@RequestParam(value="d1")String d1,@RequestParam(value="d2")String d2){
        Dummy d = Dummy.builder().d1(d1).d2(d2).build();
        someDummyService.doSomething(d);
    }

}
