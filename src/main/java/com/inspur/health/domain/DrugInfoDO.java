package com.inspur.health.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "drug_info")
public class DrugInfoDO {

    @Id
    @Column(columnDefinition = "VARCHAR COMMENT '主键'")
    private Integer id;
    @Column(columnDefinition = "VARCHAR COMMENT '药物名称'")
    private String name;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '药品英文名'")
    private String enName;
    @Column(columnDefinition = "VARCHAR(255) COMMENT '数据来源'")
    private String dataSource;
    @Column(columnDefinition = "TIMESTAMP COMMENT '最后更新时间'")
    private Date updateTime;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '简介'")
    private String info;
    @Column(columnDefinition = "VARCHAR(128) COMMENT '药物别名'")
    private String aliasName;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '药物类型'")
    private String type;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '靶点'")
    private String targetSpot;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '作用机制'")
    private String actionMechanism;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '原研公司'")
    private String originalCompany;
    @Column(columnDefinition = "VARCHAR(32) COMMENT 'Active公司'")
    private String activeCompany;
    @Column(columnDefinition = "VARCHAR(32) COMMENT 'Inactive公司'")
    private String inactiveCompany;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '治疗领域/适应症'")
    private String treatmentArea;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '全球批准适应症'")
    private String globalApprovalIndication;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '中国批准适应症'")
    private String chineseApprovalIndication;
    @Column(columnDefinition = "VARCHAR(64) COMMENT 'Active适应症'")
    private String activeIndication;
    @Column(columnDefinition = "VARCHAR(64) COMMENT 'Inactive适应症'")
    private String inactiveIndication;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '全球最高研发状态'")
    private String globalTopResearchStatus;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '全球最高研发状态适应症'")
    private String globalTopResearchStatusIndication;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '中国最高研发状态'")
    private String chineseTopResearchStatus;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '中国最高研发状态适应症'")
    private String chineseTopResearchStatusIndication;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '国家/区域'")
    private String country;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '首批国家/区域'")
    private String firstCountry;
    @Column(columnDefinition = "INT COMMENT '首批年份'")
    private Integer firstYear;
    @Column(columnDefinition = "VARCHAR(32) COMMENT 'ATC号'")
    private String atcNumber;
    @Column(columnDefinition = "VARCHAR(32) COMMENT 'NME'")
    private String nme;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '复方'")
    private String compound;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '中国一类'")
    private String nationalFirstClass;
    @Column(columnDefinition = "VARCHAR(32) COMMENT 'Wiki'")
    private String wiki;
    @Column(columnDefinition = "VARCHAR(32) COMMENT 'Drugbank'")
    private String drugBank;
    @Column(columnDefinition = "VARCHAR(32) COMMENT 'KEGG'")
    private String kegg;


}
