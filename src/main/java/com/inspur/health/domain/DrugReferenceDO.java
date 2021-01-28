package com.inspur.health.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lisuibing
 * @date 2021/1/25
 */
@Data
@Entity
@Table(name = "drug_reference")
public class DrugReferenceDO {
    @Id
    @Column(columnDefinition = "VARCHAR COMMENT '主键'")
    private String id;
    @Column(columnDefinition = "VARCHAR COMMENT '药品id'")
    private String drugId;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '文献标题'")
    private String title;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '作者信息'")
    private String authorInfo;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '期刊信息'")
    private String journalInfo;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '摘要'")
    private String referenceAbstract;


}
