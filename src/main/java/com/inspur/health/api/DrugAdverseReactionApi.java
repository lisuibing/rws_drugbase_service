package com.inspur.health.api;


import com.inspur.health.domain.DrugAdverseReactionDO;
import com.inspur.health.service.DrugAdverseReactionService;
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
@Api(tags = {"不良反应接口"})
@RequestMapping("/api/v1/adverse/reaction")
@RestController
public class DrugAdverseReactionApi {
    private final static Log log = LogFactory.getLog(DrugAdverseReactionApi.class);
    private final DrugAdverseReactionService drugAdverseReactionService;

    @Autowired
    public DrugAdverseReactionApi(DrugAdverseReactionService drugAdverseReactionService) {
        this.drugAdverseReactionService = drugAdverseReactionService;
    }

    @GetMapping("/list")
    public RestResult<List<DrugAdverseReactionDO>> listDrugAdverseReaction(@RequestParam String id) {
        RestResult<List<DrugAdverseReactionDO>> ret = new RestResult<>();
        log.info("根据药品查询不良反应列表");
        ret.setData(drugAdverseReactionService.listByDrugId(id));
        ret.setCode(0);
        ret.setMessage("成功");
        return ret;
    }

}
