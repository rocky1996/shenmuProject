package com.acat.service;

import com.acat.model.Denglu;

public interface IDengluService {

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
