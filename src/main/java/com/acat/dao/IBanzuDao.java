package com.acat.dao;


import com.acat.model.Banzu;
import com.acat.vo.BanZuVo;

public interface IBanzuDao {

    /**
     *
     * @param banzu
     */
    void addBanzu(Banzu banzu);

    /**
     *
     * @param id
     * @return
     */
    Integer getFenzuById(Integer id);

    /**
     *
     * @param fenzu
     * @return
     */
    Banzu getBanzuByFenzu(Integer fenzu);

    int delete(Integer banzu);

    BanZuVo getByFenzu(Integer fenzu);



   Banzu getAllByFezu(Integer fenzu);


}
