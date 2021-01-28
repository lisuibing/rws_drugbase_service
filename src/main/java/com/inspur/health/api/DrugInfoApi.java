package com.inspur.health.api;


import com.inspur.health.domain.DrugInfoDO;
import com.inspur.health.service.DrugInfoService;
import com.inspur.health.web.common.result.RestResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lisuibing
 * @date 2021/1/25
 */
@Api(tags = {"药品信息"})
@RestController
@RequestMapping("/api/v1/drug/info")
public class DrugInfoApi {
    private final static Log log = LogFactory.getLog(DrugInfoApi.class);
    private final DrugInfoService drugInfoService;

    @Autowired
    public DrugInfoApi(DrugInfoService drugInfoService) {
        this.drugInfoService = drugInfoService;
    }

    /**
     * 根据药品名称查询药品详情
     *
     * @param name 药品名称
     * @return 药品
     */
    @ApiOperation(value = "根据药品名称查询药品详情")
    @GetMapping("/locate/name")
    public RestResult<DrugInfoDO> locateDrugInfo(@RequestParam String name) {

        RestResult<DrugInfoDO> ret = new RestResult<>();
        log.info("根据药品名称查询药品详情");
        ret.setData(drugInfoService.locateByName(name));
        ret.setCode(0);
        ret.setMessage("成功");
        return ret;
    }


}
