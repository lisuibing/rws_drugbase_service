package com.inspur.health.service;

import com.inspur.health.dao.DrugClinicalTrialResultDao;
import com.inspur.health.domain.DrugClinicalTrialResultDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Service
public class DrugClinicalTrialResultService {

    public final DrugClinicalTrialResultDao drugClinicalTrialResultDao;

    @Autowired
    public DrugClinicalTrialResultService(DrugClinicalTrialResultDao drugClinicalTrialResultDao) {
        this.drugClinicalTrialResultDao = drugClinicalTrialResultDao;
    }

    public List<DrugClinicalTrialResultDO> listByDrugId(String id) {
        return drugClinicalTrialResultDao.findAllByDrugId(id);
    }
}
