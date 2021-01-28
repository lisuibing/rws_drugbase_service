package com.inspur.health.service;

import com.inspur.health.dao.DrugAdverseReactionDao;
import com.inspur.health.domain.DrugAdverseReactionDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Service
public class DrugAdverseReactionService {

    public final DrugAdverseReactionDao drugAdverseReactionDao;


    @Autowired
    public DrugAdverseReactionService(DrugAdverseReactionDao drugAdverseReactionDao) {
        this.drugAdverseReactionDao = drugAdverseReactionDao;
    }

    public List<DrugAdverseReactionDO> listByDrugId(String id) {
        return drugAdverseReactionDao.findAllByDrugId(id);
    }
}
