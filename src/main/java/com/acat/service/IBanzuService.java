package com.acat.service;

import com.acat.model.Banzu;

public interface IBanzuService {
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
