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
@Table(name = "drug_introduction_cn")
public class DrugIntroductionCnDO {
    @Id
    @Column(columnDefinition = "VARCHAR COMMENT '主键'")
    private String id;
    @Column(columnDefinition = "VARCHAR COMMENT '药品id'")
    private String drugId;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '通用名'")
    private String name;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '商品名'")
    private String tradeName;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '批准文号'")
    private String approvalNumber;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '规格'")
    private String spec;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '生产企业'")
    private String company;
    @Column(columnDefinition = "TIMESTAMP COMMENT '说明书更新时间'")
    private Date updateTime;


}
