/*
 * SpecialClass3.java
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
public class SpecialClass3 {

    private String stringData;

    private Integer integerData;

    private Boolean booleanData;

    /**
     * @param integerData
     * @param stringData
     * @param booleanData
     */
    public SpecialClass3(Integer integerData, String stringData,
            Boolean booleanData) {
        this.integerData = integerData;
        this.stringData = stringData;
        this.booleanData = booleanData;
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public Integer getIntegerData() {
        return integerData;
    }

    public void setIntegerData(Integer integerData) {
        this.integerData = integerData;
    }

    public Boolean getBooleanData() {
        return booleanData;
    }

    public void setBooleanData(Boolean booleanData) {
        this.booleanData = booleanData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
