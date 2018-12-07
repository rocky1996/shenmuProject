package com.acat.dao;

import com.acat.model.Denglu;

public interface IDengluDao {
    /**
     * 登陆接口
     *
     *
     */
    Denglu login(Denglu denglu);

    /**
     * 注册接口
     *
     * @param denglu
     */

    void update(Denglu denglu);

    /**
     *
     * @param yonghuming
     * @return
     */
    Integer getRenyuanZhiwei(String yonghuming);

    /**
     *
     * @param yonghuming
     * @return
     */
    String getMimaByYonghuming(String yonghuming);
}
