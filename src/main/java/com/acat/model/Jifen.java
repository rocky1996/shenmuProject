package com.acat.model;

import java.io.Serializable;

public class Jifen implements Serializable {

    private static final long serialVersionUID = 2L;

    private int id;
    private String riqi;
    private String jifen;
    private String jfftype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi;
    }

    public String getJifen() {
        return jifen;
    }

    public void setJifen(String jifen) {
        this.jifen = jifen;
    }

    public String getJfftype() {
        return jfftype;
    }

    public void setJfftype(String jfftype) {
        this.jfftype = jfftype;
    }

    @Override
    public String toString() {
        return "Jifen{" +
                "id=" + id +
                ", riqi='" + riqi + '\'' +
                ", jifen='" + jifen + '\'' +
                ", jfftype='" + jfftype + '\'' +
                '}';
    }
}
