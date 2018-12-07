package com.acat.dao;

import com.acat.model.Renyuan;

import java.util.List;

public interface IRenyuanDao {
    /**
     * 添加人员
     * @param renyuan
     */
    void addRenyuan(Renyuan renyuan);

    /**
     * 通过id删除人员
     * @param id
     */
    void deleteRenyuanById(int id);


    /**
     * 通过更新人员
     * @param renyuan
     * @return
     */
    void updateRenyuanById(Renyuan renyuan);

    /**
     * 通过查询人员
     * @param id
     * @return
     */
    Renyuan getRenyuanById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<RenyuanVo> findRenyuanVo();
}
