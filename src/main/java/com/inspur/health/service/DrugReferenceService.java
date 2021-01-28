package com.inspur.health.service;

import com.inspur.health.dao.DrugReferenceDao;
import com.inspur.health.domain.DrugReferenceDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Service
public class DrugReferenceService {


    private final DrugReferenceDao drugReferenceDao;

    @Autowired
    public DrugReferenceService(DrugReferenceDao drugReferenceDao) {
        this.drugReferenceDao = drugReferenceDao;
    }


    public List<DrugReferenceDO> listReferenceByDrugId(String id) {
        return drugReferenceDao.findAllByDrugId(id);
    }
}
