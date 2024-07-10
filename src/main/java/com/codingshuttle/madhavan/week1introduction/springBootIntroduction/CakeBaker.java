package com.codingshuttle.madhavan.week1introduction.springBootIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Frosting frosting;

    @Autowired
    Syrup syrup;

    String bakeCake(){
        return "cake is baked with " + frosting.getFrostingType() + " and " + syrup.getSyrupType();
    }
}
