package com.inspur.health.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Data
@Entity
@Table(name = "drug_clinical_trial_result")
public class DrugClinicalTrialResultDO {
    @Id
    @Column(columnDefinition = "VARCHAR COMMENT '主键'")
    private String id;
    @Column(columnDefinition = "VARCHAR COMMENT '药品id'")
    private String drugId;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '活性成分'")
    private String activeIngredient;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '来源'")
    private String source;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '药理学'")
    private String pharmacology;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '药代动力学评价'")
    private String pharEval;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '临床安全性评价'")
    private String clinicalSafetyEval;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '临床有效性评价'")
    private String clinicalValidityEval;


}
