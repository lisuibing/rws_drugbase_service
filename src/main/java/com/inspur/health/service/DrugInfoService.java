package com.inspur.health.service;

import com.inspur.health.dao.DrugInfoDao;
import com.inspur.health.domain.DrugInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Service
public class DrugInfoService {

    private final DrugInfoDao drugInfoDao;

    @Autowired
    public DrugInfoService(DrugInfoDao drugInfoDao) {
        this.drugInfoDao = drugInfoDao;
    }

    public DrugInfoDO locateByName(String name) {
        return drugInfoDao.findByName(name);
    }
}
