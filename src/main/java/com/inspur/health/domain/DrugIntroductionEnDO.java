package com.inspur.health.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author lisuibing
 * @date 2021/1/25
 */
@Data
@Entity
@Table(name = "drug_introduction_en")
public class DrugIntroductionEnDO {
    @Id
    @Column(columnDefinition = "VARCHAR COMMENT '主键'")
    private String id;
    @Column(columnDefinition = "VARCHAR COMMENT '药品id'")
    private String drugId;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '活性成分(药渡)'")
    private String activeIngredient;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '商品名'")
    private String tradeName;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '注册申请号'")
    private String registerNumber;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '公司'")
    private String company;
    @Column(columnDefinition = "TIMESTAMP COMMENT '批准日期'")
    private Date approvalDate;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '修订号'")
    private String revisionNumber;
    @Column(columnDefinition = "TIMESTAMP COMMENT '执行日期'")
    private Date executeDate;


}
