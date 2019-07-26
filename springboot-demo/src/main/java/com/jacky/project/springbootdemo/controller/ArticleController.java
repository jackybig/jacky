package com.jacky.project.springbootdemo.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/5/31 13:00
 * @description 发布文章
 **/
@Slf4j
@RestController
@RequestMapping(value = "/api/information")
@Api(value = "ArticleController", tags = "jacky第一个接口")
public class ArticleController {

    @PostMapping("/saveArticle")
    @ApiOperation(value = "打印数字的和", notes = "打印数字的和")
    public void saveArticle() {
        int one = 10 ;
        int two = 20 ;
        int three = 0 ;
        int sum = one+two-three;
        double wu = (one+two+three)/12;
        System.out.println("所有数字的和："+sum);
        System.out.println("所有的商："+wu);
    }





}
