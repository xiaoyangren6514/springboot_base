package com.happy;

import com.happy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhonglq on 2018/6/24.
 */
@RestController
public class HelloController {

    @Value("${welcome}")
    private String welcome;

    @Autowired
    private User user;

    @RequestMapping(name = "/index", method = RequestMethod.GET)
    public String sayHi() {
        System.out.println(user.toString());
        return user.toString();
    }

//    @RequestMapping(name = "/a", method = RequestMethod.GET)
    public String testA() {
        return user.toString();
    }


}
