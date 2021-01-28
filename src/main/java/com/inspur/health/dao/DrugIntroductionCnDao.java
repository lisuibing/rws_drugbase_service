package com.inspur.health.dao;

import com.inspur.health.domain.DrugIntroductionCnDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Repository
public interface DrugIntroductionCnDao extends JpaRepository<DrugIntroductionCnDO, String> {

    /**
     * 根据药品查询中文说明书列表
     *
     * @param id 药品id
     * @return 中文说明书列表
     */
    List<DrugIntroductionCnDO> findAllByDrugId(String id);

}
