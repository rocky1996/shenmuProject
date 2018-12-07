package com.acat.service.impl;

import com.acat.dao.IDengluDao;
import com.acat.model.Denglu;
import com.acat.service.IDengluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dengluService")
public class IDengluServiceImpl implements IDengluService {
    @Autowired
    private IDengluDao iDengluDao;
    /**
     * 登陆接口
     *
     *
     */
    public Denglu login(Denglu denglu){
        return iDengluDao.login(denglu);
    }

    /**
     * 注册接口
     *
     * @param denglu
     */

    public void update(Denglu denglu){
        iDengluDao.update(denglu);
    }

    /**
     *
     * @param yonghuming
     * @return
     */
    public Integer getRenyuanZhiwei(String yonghuming){
        return iDengluDao.getRenyuanZhiwei(yonghuming);
    }

    /**
     *
     * @param yonghuming
     * @return
     */
    public String getMimaByYonghuming(String yonghuming){
        return iDengluDao.getMimaByYonghuming(yonghuming);
    }
}
