/*
 * SpecialServiceTest.java
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

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.kilo.BaseIntegrationTest;
import com.kilo.SpecialClass1;

//@formatter:off
/**
 * @author baigm
 * @version $Id: eclipse-codetemplates.xml 413456 2010-08-10 07:03:38Z baigm $
 */
//@formatter:on
public class SpecialServiceIntegrationTest extends BaseIntegrationTest {

    @Resource(name = "specialService")
    private SpecialService specialService;

    @Test
    public void testGetSpecialObjects() {
        List<SpecialClass1> specialObjects = specialService
                .getSpecialObjects("someSpecialCriterion");
        assertNotNull(specialObjects);
    }
}
