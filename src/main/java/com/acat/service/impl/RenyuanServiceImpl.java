package com.acat.service.impl;

import com.acat.dao.IRenyuanDao;
import com.acat.model.Renyuan;
import com.acat.service.IRenyuanService;
import com.acat.vo.RenyuanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("renyuanService")
public class RenyuanServiceImpl implements IRenyuanService {

    @Autowired
    private IRenyuanDao renyuanDao;

    /**
     *zengjiarenyuan
     * @param
     */
    public void addRenyuan(Renyuan renyuan){
        renyuanDao.addRenyuan(renyuan);
    }

    /**
     * shanchurenyuan
     * @param id
     */
    public void deleteRenyuanById(Integer id){
        renyuanDao.deleteRenyuanById(id);
    }

    /**
     * gerngxinrenyuan
     * @param
     * @return
     */
    public void updateRenyuan(Renyuan renyuan){
        renyuanDao.updateRenyuan(renyuan);
    }

    /**
     * tongguo id chaxunrenyuan
     * @param id
     * @return
     */
    public Renyuan getRenyuanById(Integer id){
        return renyuanDao.getRenyuanById(id);

    }


    /**
     *
     * @return
     */
    public List<RenyuanVo> getRenyuanVo() {
        return renyuanDao.getRenyuanVo();
    }
}
