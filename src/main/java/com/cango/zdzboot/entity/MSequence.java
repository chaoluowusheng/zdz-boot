package com.cango.zdzboot.entity;

import javax.persistence.Entity;

public class MSequence {
    /**
     * SEQUENCE名
     */
    private String name;
    /**
     * 当前值
     */
    private String currentValue;
    /**
     * 步长
     */
    private String increment;

    /**
     * 保单号前缀
     */
    private String insureNoPref;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public String getIncrement() {
        return increment;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public String getInsureNoPref() {
        return insureNoPref;
    }

    public void setInsureNoPref(String insureNoPref) {
        this.insureNoPref = insureNoPref;
    }
}
