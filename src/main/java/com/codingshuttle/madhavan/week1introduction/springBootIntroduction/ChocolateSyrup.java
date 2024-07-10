package com.codingshuttle.madhavan.week1introduction.springBootIntroduction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "cake.syrup", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Chocolate syrup";
    }
}
