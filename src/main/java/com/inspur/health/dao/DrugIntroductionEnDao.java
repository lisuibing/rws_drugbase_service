package com.inspur.health.dao;

import com.inspur.health.domain.DrugIntroductionEnDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Repository
public interface DrugIntroductionEnDao extends JpaRepository<DrugIntroductionEnDO, String> {


    /**
     * 根据药品查询英文说明书列表
     *
     * @param id 药品id
     * @return 英文说明书列表
     */
    List<DrugIntroductionEnDO> findAllByDrugId(String id);


}
