package com.designpattern.study.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {

    private String cloneName;

    private String cloneClass;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
