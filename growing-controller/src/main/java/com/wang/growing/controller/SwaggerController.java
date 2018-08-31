package com.wang.growing.controller;

import com.wang.growing.dto.SwaggerRequest;
import com.wang.growing.response.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangyuanyuan@zto.com
 * @Description: Swagger demo
 * @date 2018/8/30/10:40
 */
@RestController
@Api(value = "测试模块", description = "测试模块")
public class SwaggerController {
    /**
     * 测试
     *
     * @param param
     * @return
     */
    @RequestMapping(value = "/test/{param}", method = RequestMethod.GET)
    @ApiOperation(value = "测试", notes = "测试", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "param", value = "参数", required = true, dataType = "String", paramType = "path")
    })
    public String test(@PathVariable("param") String param) {
        return "hello Swagger";
    }

    /**
     * 新增
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation("新增")
    @PutMapping("add")
    @ApiImplicitParam(name = "request", value = "单个用户信息", dataType = "SwaggerRequest")
    public ResponseMessage<SwaggerRequest> add(@RequestBody SwaggerRequest request) {
        return new ResponseMessage(true, "200", "hello Swagger", "hello Swagger");
    }
}
