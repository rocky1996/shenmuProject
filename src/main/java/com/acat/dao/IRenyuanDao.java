package com.acat.dao;

import com.acat.model.Renyuan;
import com.acat.vo.RenyuanVo;
import java.util.List;

public interface IRenyuanDao {


    /**
     *zengjiarenyuan
     * @param
     */
    void addRunyuan(Renyuan renyuan);

    /**
     * shanchurenyuan
     * @param id
     */
    void deleteRenyuanById(Integer id);

    /**
     * gerngxinrenyuan
     * @param
     * @return
     */
    void updateRenyuan(Integer id);

    /**
     * tongguo id chaxunrenyuan
     * @param id
     * @return
     */
    Renyuan getRenyuanById(Integer id);


    /**
     *
     * @return
     */
    List<RenyuanVo> getRenyuanVo();
}
