package com.inspur.health.api;


import com.inspur.health.domain.DrugClinicalTrialResultDO;
import com.inspur.health.service.DrugClinicalTrialResultService;
import com.inspur.health.web.common.result.RestResult;
import io.swagger.annotations.Api;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lisuibing
 * @date 2021/1/26
 */
@Api(tags = {"临床试验"})
@RequestMapping("/api/v1/clinical/trial/result")
@RestController
public class DrugClinicalTrialResultApi {
    private final static Log log = LogFactory.getLog(DrugClinicalTrialResultApi.class);
    private final DrugClinicalTrialResultService drugClinicalTrialResultService;

    @Autowired
    public DrugClinicalTrialResultApi(DrugClinicalTrialResultService drugClinicalTrialResultService) {
        this.drugClinicalTrialResultService = drugClinicalTrialResultService;
    }

    @GetMapping("/list")
    public RestResult<List<DrugClinicalTrialResultDO>> findDrugAdverseReaction(@RequestParam String id) {
        RestResult<List<DrugClinicalTrialResultDO>> ret = new RestResult<>();
        log.info("根据药品查询临床试验列表");
        ret.setData(drugClinicalTrialResultService.listByDrugId(id));
        ret.setCode(0);
        ret.setMessage("成功");
        return ret;
    }

}
