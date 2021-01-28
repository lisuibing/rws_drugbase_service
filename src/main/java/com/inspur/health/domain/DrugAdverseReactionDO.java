package com.inspur.health.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

/**
 * @author lisuibing
 * @date 2021/1/25
 */
@Data
@Entity
@Table(name = "drug_adverse_reaction")
public class DrugAdverseReactionDO {

    @Id
    @Column(columnDefinition = "VARCHAR COMMENT '主键'")
    private String id;
    @Column(columnDefinition = "VARCHAR COMMENT '药品id'")
    private String drugId;
    @Column(columnDefinition = "VARCHAR(255) COMMENT '公布机构'")
    private String publishAgency;
    @Column(columnDefinition = "TIMESTAMP COMMENT '公布时间'")
    private Date publishTime;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '安全警告'")
    private String securityWarning;

}
