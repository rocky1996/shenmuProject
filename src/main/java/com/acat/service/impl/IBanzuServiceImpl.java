package com.acat.service.impl;

import com.acat.dao.IBanzuDao;
import com.acat.model.Banzu;
import com.acat.service.IBanzuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("banzuService")
public class IBanzuServiceImpl implements IBanzuService {

    @Autowired
    private IBanzuDao iBanzuDao;

    public void addBanzu(Banzu banzu){
        iBanzuDao.addBanzu(banzu);
    }

    public Integer getFenzuById(Integer id){
        return iBanzuDao.getFenzuById(id);
    }

    public Banzu getBanzuByFenzu(Integer fenzu){
        return iBanzuDao.getBanzuByFenzu(fenzu);
    }
}
