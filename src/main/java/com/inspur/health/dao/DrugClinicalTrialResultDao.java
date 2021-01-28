package com.inspur.health.dao;

import com.inspur.health.domain.DrugClinicalTrialResultDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Repository
public interface DrugClinicalTrialResultDao extends JpaRepository<DrugClinicalTrialResultDO, String> {


    /**
     * 根据药品id获取临床试验列表
     *
     * @param id 药品id
     * @return 不良反应列表
     */
    List<DrugClinicalTrialResultDO> findAllByDrugId(String id);

}
