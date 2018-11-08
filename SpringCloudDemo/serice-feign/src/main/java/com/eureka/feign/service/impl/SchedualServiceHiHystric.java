package com.eureka.feign.service.impl;

import com.eureka.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author: Ethan huang
 * @CreateDate: 2018/10/23 18:21
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

}
