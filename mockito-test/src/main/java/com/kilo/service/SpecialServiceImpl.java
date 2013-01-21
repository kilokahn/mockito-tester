/*
 * ServiceImpl1.java
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

import java.util.List;

import com.kilo.SpecialClass1;
import com.kilo.dao.SpecialDAO;

//@formatter:off
/**
 * @author baigm
 * @version $Id: eclipse-codetemplates.xml 413456 2010-08-10 07:03:38Z baigm $
 */
//@formatter:on
public class SpecialServiceImpl implements SpecialService {

    private SpecialDAO specialDAO;

    /**
     * {@inheritDoc}
     */
    public List<SpecialClass1> getSpecialObjects(String criterion) {
        return specialDAO.getSpecialObjects(criterion);
    }

    public void setSpecialDAO(SpecialDAO specialDAO) {
        this.specialDAO = specialDAO;
    }

}
