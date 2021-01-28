package com.inspur.health.dao;

import com.inspur.health.domain.DrugIntroductionJapDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Repository
public interface DrugIntroductionJapDao extends JpaRepository<DrugIntroductionJapDO, String> {


    /**
     * 根据药品查询日文说明书列表
     *
     * @param id 药品id
     * @return 日文说明书列表
     */
    List<DrugIntroductionJapDO> findAllByDrugId(String id);


}
