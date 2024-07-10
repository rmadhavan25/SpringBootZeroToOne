package com.codingshuttle.madhavan.week1introduction.springBootIntroduction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "cake.syrup", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup {

    @Override
    public String getSyrupType() {
        return "Strawberry syrup";
    }

}
