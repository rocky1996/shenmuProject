package com.acat.dao;

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

}
