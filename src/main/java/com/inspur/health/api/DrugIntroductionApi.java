package com.inspur.health.api;

import com.inspur.health.domain.DrugIntroductionCnDO;
import com.inspur.health.domain.DrugIntroductionEnDO;
import com.inspur.health.domain.DrugIntroductionJapDO;
import com.inspur.health.service.DrugIntroductionService;
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
@RequestMapping("/api/introduction")
@RestController
public class DrugIntroductionApi {
    private final Log log = LogFactory.getLog(DrugIntroductionApi.class);
    private final DrugIntroductionService drugIntroductionService;

    @Autowired
    public DrugIntroductionApi(DrugIntroductionService drugIntroductionService) {
        this.drugIntroductionService = drugIntroductionService;
    }

    @GetMapping("/locate/chinese")
    public RestResult<List<DrugIntroductionCnDO>> findDrugIntroductionCn(@RequestParam String id) {
        RestResult<List<DrugIntroductionCnDO>> ret = new RestResult<>();
        log.info("根据药品名称查询中文说明书");
        ret.setData(drugIntroductionService.listChineseIntroductionByDrugId(id));
        ret.setCode(0);
        ret.setMessage("成功");
        return ret;
    }

    @GetMapping("/locate/american")
    public RestResult<List<DrugIntroductionEnDO>> findDrugIntroductionEn(@RequestParam String id) {
        RestResult<List<DrugIntroductionEnDO>> ret = new RestResult<>();
        log.info("根据药品名称查询英文说明书");
        ret.setData(drugIntroductionService.listAmericanIntroductionByDrugId(id));
        ret.setCode(0);
        ret.setMessage("成功");
        return ret;
    }

    @GetMapping("/locate/japanese")
    public RestResult<List<DrugIntroductionJapDO>> findDrugIntroductionJap(@RequestParam String id) {
        RestResult<List<DrugIntroductionJapDO>> ret = new RestResult<>();
        log.info("根据药品名称查询日文说明书");
        ret.setData(drugIntroductionService.listJapaneseIntroductionByDrugId(id));
        ret.setCode(0);
        ret.setMessage("成功");
        return ret;
    }
}
