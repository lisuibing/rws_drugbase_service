package com.inspur.health.dao;

import com.inspur.health.domain.DrugInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Repository
public interface DrugInfoDao extends JpaRepository<DrugInfoDO, String> {

    /**
     * 根据名称查询药品信息
     *
     * @param name 药品名称
     * @return 药品信息
     */
    DrugInfoDO findByName(String name);


}
