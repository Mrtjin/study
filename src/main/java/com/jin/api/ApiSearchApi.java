package com.jin.api;

import com.jin.common.web.ResponseBody;
import com.jin.common.web.ResponseCode;
import com.jin.common.ip.IpHelper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

import java.util.Random;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: www.lvmama.com</p>
 *
 * @author jin
 * @version 1.0 2018/6/11
 */
@RestControllerAdvice
@RequestMapping("/api")
public class ApiSearchApi extends AbstractJsonpResponseBodyAdvice{

    public ApiSearchApi(){
        super("jsoncallback","jsonp");
    }
    @ApiOperation(value = "根据IP定位城市》binarySearch")
    @RequestMapping(value = "/findCityByIp", method = RequestMethod.POST)
    public ResponseBody<String> binarySearch(@ApiParam(value = "IP地址")@RequestParam String ip){
        ResponseBody<String> responseBody = new ResponseBody();
        responseBody.setT(IpHelper.findRegionByIp(ip));
        return  responseBody.returnBody();
    }

    @ApiOperation(value = "验证码发送模拟》sendMobileCode")
    @RequestMapping(value = "/sendMobileCode", method = RequestMethod.GET)
    public ResponseCode sendMobileCode(@ApiParam(value = "邮箱或者短信")@RequestParam String mobileOrEMail, @ApiParam(value = "图形验证")@RequestParam(required = false) String verifycode){
        ResponseCode code = new ResponseCode();
        String[] res = {"errorVerifycode","vcodeWarning","phoneWarning","ipLimit","waiting"};
        Random random = new Random();
        code.setSuccess(true);
        code.setErrorText(res[random.nextInt(5)]);
        return  code;
    }

    @ApiOperation(value = "验证码验证模拟》validMobileCode")
    @RequestMapping(value = "/validMobileCode", method = RequestMethod.GET)
    public ResponseCode validMobileCode(@ApiParam(value = "邮箱或者短信")@RequestParam String mobileOrEMail, @ApiParam(value = "验证码")@RequestParam(required = false) String verifycode){
        ResponseCode code = new ResponseCode();
        String[] res = {"errorVerifycode","vcodeWarning","phoneWarning","ipLimit","waiting","overLimitTimes"};
        Random random = new Random();
        code.setSuccess(false);
        code.setErrorText("overLimitTimes");
        return  code;
    }
}
