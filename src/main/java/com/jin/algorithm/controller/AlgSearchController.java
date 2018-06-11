package com.jin.algorithm.controller;

import com.jin.algorithm.service.ISearchService;
import com.jin.common.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: 查找算法</p>
 * <p>Description: </p>
 * <p>Company: www.lvmama.com</p>
 *
 * @author jin
 * @version 1.0 2018/6/11
 */
@RestController
@RequestMapping("alg/search")
@Api(value = "/search", description = "算法》查找算法")
public class AlgSearchController {

    @Autowired
    private ISearchService searchService;
    @ApiOperation(value = "1.顺序查询@jin",notes = "实现方式可以用get请求,直接传当前页以及页码大小以及排序等")
    @RequestMapping(value = "/sequenceSearch", method = RequestMethod.POST)
    public ResponseBody<Integer> sequenceSearch(@ApiParam(value = "源数据表")@RequestParam int[] array, @ApiParam(value = "待查找数据")@RequestParam int index){
        return  null;
    }
    @ApiOperation(value = "2.二分查找@jin")
    @RequestMapping(value = "/binarySearch", method = RequestMethod.POST)
    public ResponseBody<Integer> binarySearch(@ApiParam(value = "源数据表")@RequestParam int[] array, @ApiParam(value = "待查找数据")@RequestParam int index){
        ResponseBody<Integer> responseBody = new ResponseBody();
        int res = searchService.binarySearch(array,index);
        responseBody.setT(res);
        return  responseBody.returnBody();
    }
    @ApiOperation(value = "3.插值查找@jin")
    @RequestMapping(value = "/insertionSearch", method = RequestMethod.POST)
    public ResponseBody<Integer> insertionSearch(@ApiParam(value = "源数据表")@RequestParam int[] array, @ApiParam(value = "待查找数据")@RequestParam int index){
        return  null;
    }
    @ApiOperation(value = "4.斐波那契查找@jin")
    @RequestMapping(value = "/fibonacciSearch", method = RequestMethod.POST)
    public ResponseBody<Integer> fibonacciSearch(@ApiParam(value = "源数据表")@RequestParam int[] array, @ApiParam(value = "待查找数据")@RequestParam int index){
        return  null;
    }
    @ApiOperation(value = "5.二叉树查找@jin")
    @RequestMapping(value = "/binaryTreeSearch ", method = RequestMethod.POST)
    public ResponseBody<Integer> binaryTreeSearch(@ApiParam(value = "源数据表")@RequestParam int[] array, @ApiParam(value = "待查找数据")@RequestParam int index){
        return  null;
    }
    @ApiOperation(value = "6.分块查找@jin")
    @RequestMapping(value = "/indexSearch", method = RequestMethod.POST)
    public ResponseBody<Integer> indexSearch(@ApiParam(value = "源数据表")@RequestParam int[] array, @ApiParam(value = "待查找数据")@RequestParam int index){
        return  null;
    }
    @ApiOperation(value = "7.哈希查找@jin")
    @RequestMapping(value = "/hashSearch", method = RequestMethod.POST)
    public ResponseBody<Integer> hashSearch(@ApiParam(value = "源数据表")@RequestParam int[] array, @ApiParam(value = "待查找数据")@RequestParam int index){
        return  null;
    }
}
