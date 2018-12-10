package com.acat.model;

import java.io.Serializable;

public class Denglu implements Serializable {
    private static final long serialVersionUID = 2L;

    private Integer id;

    @Override
    public String toString() {
        return "Denglu{" +
                "id=" + id +
                ", mima='" + mima + '\'' +
                ", yonghuming='" + yonghuming + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public void setMima(String mima) {
        this.mima = mima;
    }
}
