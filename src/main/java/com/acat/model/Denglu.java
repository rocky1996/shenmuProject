package com.acat.model;

import java.io.Serializable;

public class Denglu implements Serializable {
    private static final long serialVersionUID = 2L;

    private String mima;
    private String yonghuming;

    public String getYonghuming() {
        return yonghuming;
    }

    public void setYonghuming(String yonghuming) {
        this.yonghuming = yonghuming;
    }


    public String getMima() {
        return mima;
    }

    @Override
    public String toString() {
        return "Denglu{" +
                "mima='" + mima + '\'' +
                ", yonghuming='" + yonghuming + '\'' +
                '}';
    }

    public void setMima(String mima) {
        this.mima = mima;
    }
}