/*
 * SpecialServiceUnitTest.java
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

package com.kilo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.kilo.SpecialClass1;
import com.kilo.SpecialClass2;
import com.kilo.SpecialClass3;
import com.kilo.dao.SpecialDAO;

//@formatter:off
/**
 * @author baigm
 * @version $Id: eclipse-codetemplates.xml 413456 2010-08-10 07:03:38Z baigm $
 */
//@formatter:on
@RunWith(MockitoJUnitRunner.class)
public class SpecialServiceUnitTest {

    @Mock
    private SpecialDAO mockSpecialDAO;

    @InjectMocks
    private SpecialService specialService = new SpecialServiceImpl();

    @Test
    public void testGetSpecialObjects() {
        List<SpecialClass1> testSpecialObjects = getTestSpecialObjects();
        Mockito.when(mockSpecialDAO.getSpecialObjects(Mockito.anyString()))
                .thenReturn(testSpecialObjects);

        String criterion = "mySpecialCriteria";
        List<SpecialClass1> obtainedSpecialObjects = specialService
                .getSpecialObjects(criterion);
        assertNotNull(obtainedSpecialObjects);
        assertEquals(obtainedSpecialObjects.size(), testSpecialObjects.size());
    }

    private List<SpecialClass1> getTestSpecialObjects() {
        List<SpecialClass1> specialObjects = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            specialObjects.add(new SpecialClass1(new SpecialClass2(
                    new SpecialClass3(i, String.valueOf(i), Boolean
                            .valueOf(String.valueOf(i))))));
        }
        return specialObjects;
    }
}
