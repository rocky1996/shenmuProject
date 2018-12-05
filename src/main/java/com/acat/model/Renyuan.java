package com.acat.model;

import java.io.Serializable;
import java.util.Date;

public class Renyuan implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ID;
    private String gonghao;
    private String shenfenzheng;
    private String xingming;
    private String xingbie;
    private Integer nainling;
    private String dianhua;
    private Integer zhiwei;
    private String ruzhishijian;
    private String chezu;
    private Integer jibengongzi;
    private String xueli;
    private String minzu;
    private String zaizhi;
    private String beizhu;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public Integer getNainling() {
        return nainling;
    }

    public void setNainling(Integer nainling) {
        this.nainling = nainling;
    }

    public String getDianhua() {
        return dianhua;
    }

    public void setDianhua(String dianhua) {
        this.dianhua = dianhua;
    }

    public Integer getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(Integer zhiwei) {
        this.zhiwei = zhiwei;
    }

    public String getRuzhishijian() {
        return ruzhishijian;
    }

    public void setRuzhishijian(String ruzhishijian) {
        this.ruzhishijian = ruzhishijian;
    }

    public String getChezu() {
        return chezu;
    }

    public void setChezu(String chezu) {
        this.chezu = chezu;
    }

    public Integer getJibengongzi() {
        return jibengongzi;
    }

    public void setJibengongzi(Integer jibengongzi) {
        this.jibengongzi = jibengongzi;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    public String getZaizhi() {
        return zaizhi;
    }

    public void setZaizhi(String zaizhi) {
        this.zaizhi = zaizhi;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "Renyuan{" +
                "ID=" + ID +
                ", gonghao='" + gonghao + '\'' +
                ", shenfenzheng='" + shenfenzheng + '\'' +
                ", xingming='" + xingming + '\'' +
                ", xingbie='" + xingbie + '\'' +
                ", nainling=" + nainling +
                ", dianhua='" + dianhua + '\'' +
                ", zhiwei=" + zhiwei +
                ", ruzhishijian='" + ruzhishijian + '\'' +
                ", chezu='" + chezu + '\'' +
                ", jibengongzi=" + jibengongzi +
                ", xueli='" + xueli + '\'' +
                ", minzu='" + minzu + '\'' +
                ", zaizhi='" + zaizhi + '\'' +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }
}
