package com.acat.dao;

import com.acat.model.Denglu;

public interface IDengluDao {

    /**
     *
     * @param yonghuming
     * @param mima
     */
    void login(String yonghuming,String mima);


    /**
     *
     * @param denglu
     */
    void register(Denglu denglu);
}
