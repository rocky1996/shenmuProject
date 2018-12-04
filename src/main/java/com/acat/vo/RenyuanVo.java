package com.acat.vo;


import java.io.Serializable;

public class RenyuanVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer xuhao=0;
    private String gonghao;
    private String xingming;
    private Integer xingbie;
    private String beizhu;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getXuhao() {
        return xuhao;
    }

    public void setXuhao(Integer xuhao) {
        this.xuhao = xuhao++;
    }

    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public Integer getXingbie() {
        return xingbie;
    }

    public void setXingbie(Integer xingbie) {
        this.xingbie = xingbie;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "RenyuanVo{" +
                "xuhao=" + xuhao +
                ", gonghao='" + gonghao + '\'' +
                ", xingming='" + xingming + '\'' +
                ", xingbie=" + xingbie +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }
}
