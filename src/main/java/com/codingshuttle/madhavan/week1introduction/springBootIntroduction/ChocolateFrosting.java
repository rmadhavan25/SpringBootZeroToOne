package com.codingshuttle.madhavan.week1introduction.springBootIntroduction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "cake.frosting", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType(){
        return "Chocolate frosting";
    }
}
