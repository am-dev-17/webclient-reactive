package com.amarmodi.springwebflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherComponent {

    private final MyUtility myUtility;

    @Autowired
    public AnotherComponent(MyUtility myUtility) {
        this.myUtility = myUtility;
    }
}
