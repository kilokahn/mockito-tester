/*
 * Driver.java
 * 
 * $HeadURL: $
 * $Id: eclipse-codetemplates.xml 413456 2010-08-10 07:03:38Z baigm $
 */

/*
 * Copyright (c) 2012 D. E. Shaw & Co., L.P. All rights reserved.
 *  
 * This software is the confidential and proprietary information
 * of D. E. Shaw & Co., L.P. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with D. E. Shaw & Co., L.P.
 */

package com.kilo.driver;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kilo.DerivedClass1;
import com.kilo.DerivedClass2;
import com.kilo.SpecialClass1;
import com.kilo.service.SpecialService;

//@formatter:off
/**
 * @author baigm
 * @version $Id: eclipse-codetemplates.xml 413456 2010-08-10 07:03:38Z baigm $
 */
//@formatter:on
public class Driver {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:com/kilo/applicationContext.xml");
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
