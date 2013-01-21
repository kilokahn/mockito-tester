/*
 * SpecialDAO.java
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

package com.kilo.dao;

import java.util.ArrayList;
import java.util.List;

import com.kilo.SpecialClass1;
import com.kilo.SpecialClass2;
import com.kilo.SpecialClass3;

//@formatter:off
/**
 * @author baigm
 * @version $Id: eclipse-codetemplates.xml 413456 2010-08-10 07:03:38Z baigm $
 */
//@formatter:on
public class SpecialDAO {

    /**
     * @param criterion
     * @return
     */
    public List<SpecialClass1> getSpecialObjects(String criterion) {
        List<SpecialClass1> specialObjects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            SpecialClass3 specialClass3 = new SpecialClass3(i, criterion
                    + String.valueOf(i), Boolean.valueOf(String.valueOf(i)));
            SpecialClass2 specialClass2 = new SpecialClass2(specialClass3);
            SpecialClass1 specialClass1 = new SpecialClass1(specialClass2);

            specialObjects.add(specialClass1);
        }
        return specialObjects;
    }

}
