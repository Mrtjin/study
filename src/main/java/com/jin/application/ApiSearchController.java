package com.jin.application;

import com.jin.algorithm.service.ISearchService;
import com.jin.common.ResponseBody;
import com.jin.common.ip.IpHelper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: www.lvmama.com</p>
 *
 * @author jin
 * @version 1.0 2018/6/11
 */
@RestController
@RequestMapping("/api")
public class ApiSearchController {
    @ApiOperation(value = "根据IP定位城市》binarySearch")
    @RequestMapping(value = "/findCityByIp", method = RequestMethod.POST)
    public ResponseBody<String> binarySearch(@ApiParam(value = "IP地址")@RequestParam String ip){
        ResponseBody<String> responseBody = new ResponseBody();
        responseBody.setT(IpHelper.findRegionByIp(ip));
        return  responseBody.returnBody();
    }
}
