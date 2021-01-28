package com.inspur.health.service;

import com.inspur.health.dao.DrugIntroductionCnDao;
import com.inspur.health.dao.DrugIntroductionEnDao;
import com.inspur.health.dao.DrugIntroductionJapDao;
import com.inspur.health.domain.DrugIntroductionCnDO;
import com.inspur.health.domain.DrugIntroductionEnDO;
import com.inspur.health.domain.DrugIntroductionJapDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Service
public class DrugIntroductionService {


    private final DrugIntroductionCnDao drugIntroductionCnDao;
    private final DrugIntroductionEnDao drugIntroductionEnDao;
    private final DrugIntroductionJapDao drugIntroductionJapDao;

    @Autowired
    public DrugIntroductionService(DrugIntroductionCnDao drugIntroductionCnDao,
                                   DrugIntroductionEnDao drugIntroductionEnDao,
                                   DrugIntroductionJapDao drugIntroductionJapDao) {
        this.drugIntroductionCnDao = drugIntroductionCnDao;
        this.drugIntroductionEnDao = drugIntroductionEnDao;
        this.drugIntroductionJapDao = drugIntroductionJapDao;
    }

    public List<DrugIntroductionCnDO> listChineseIntroductionByDrugId(String id) {
        return drugIntroductionCnDao.findAllByDrugId(id);
    }

    public List<DrugIntroductionEnDO> listAmericanIntroductionByDrugId(String id) {
        return drugIntroductionEnDao.findAllByDrugId(id);
    }

    public List<DrugIntroductionJapDO> listJapaneseIntroductionByDrugId(String id) {
        return drugIntroductionJapDao.findAllByDrugId(id);
    }
}
