package com.inspur.health.api;


import com.inspur.health.domain.DrugReferenceDO;
import com.inspur.health.service.DrugReferenceService;
import com.inspur.health.web.common.result.RestResult;
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
 * @date 2021/1/25
 */
@RequestMapping("/api/v1/reference")
@RestController
public class DrugReferenceApi {
    private final Log log = LogFactory.getLog(DrugReferenceApi.class);

    private final DrugReferenceService drugReferenceService;

    @Autowired
    public DrugReferenceApi(DrugReferenceService drugReferenceService) {
        this.drugReferenceService = drugReferenceService;
    }

    @GetMapping("/list")
    public RestResult<List<DrugReferenceDO>> findDrugReferenceService(@RequestParam String id) {
        RestResult<List<DrugReferenceDO>> ret = new RestResult<>();
        log.info("根据药品查询参考文献");
        ret.setData(drugReferenceService.listReferenceByDrugId(id));
        ret.setCode(0);
        ret.setMessage("成功");
        return ret;
    }
}
