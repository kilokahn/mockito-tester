/*
 * SpecialObject.java
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

package com.kilo;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

//@formatter:off
/**
 * @author baigm
 * @version $Id: eclipse-codetemplates.xml 413456 2010-08-10 07:03:38Z baigm $
 */
//@formatter:on
public class SpecialClass1 {

    /**
     * @param specialClass2
     */
    public SpecialClass1(SpecialClass2 specialClass2) {
        this.specialClass2 = specialClass2;
    }

    private SpecialClass2 specialClass2;

    public SpecialClass2 getSpecialClass2() {
        return specialClass2;
    }

    public void setSpecialClass2(SpecialClass2 specialClass2) {
        this.specialClass2 = specialClass2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
