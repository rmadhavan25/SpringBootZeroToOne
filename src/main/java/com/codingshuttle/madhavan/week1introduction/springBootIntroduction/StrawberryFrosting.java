package com.codingshuttle.madhavan.week1introduction.springBootIntroduction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "cake.frosting", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry frosting";
    }
}
