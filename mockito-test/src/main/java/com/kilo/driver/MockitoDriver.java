
package com.kilo.driver;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kilo.DerivedClass1;
import com.kilo.DerivedClass2;
import com.kilo.SpecialClass1;
import com.kilo.service.SpecialService;

public class MockitoDriver {

    public static void main(String[] args) {

        try (ConfigurableApplicationContext applicationContext = new GenericXmlApplicationContext(
                "classpath:com/kilo/applicationContext.xml")) {
            SpecialService specialService = applicationContext
                    .getBean(SpecialService.class);
            List<SpecialClass1> specialObjects = specialService
                    .getSpecialObjects("foobarbaz");
            System.out.println(specialObjects);

            DerivedClass1 d1 = new DerivedClass1();
            d1.foo();
            DerivedClass2 d2 = new DerivedClass2();
            d2.foo();
        }
    }

}
