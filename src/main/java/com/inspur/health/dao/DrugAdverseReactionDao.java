package com.inspur.health.dao;


import com.inspur.health.domain.DrugAdverseReactionDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Repository
public interface DrugAdverseReactionDao extends JpaRepository<DrugAdverseReactionDO, String> {

        /**
         * 根据药品id查询不良反应列表
         *
         * @param id 药品id
         * @return 不良反应列表
         */
        List<DrugAdverseReactionDO> findAllByDrugId(String id);


        }
