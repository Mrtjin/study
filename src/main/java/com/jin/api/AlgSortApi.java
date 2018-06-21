package com.jin.api;

import com.jin.service.sort.ISortService;
import com.jin.common.web.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: 排序算法</p>
 * <p>Description: </p>
 * <p>Company: www.lvmama.com</p>
 *
 * @author jin
 * @version 1.0 2018/6/11
 */
@RestController
@RequestMapping("algor/sort")
@Api(value = "/sort", description = "算法》排序算法")
public class AlgSortApi {
    @Autowired
    private ISortService sortService;

    @ApiOperation(value = "1.冒泡排序@jin")
    @RequestMapping(value = "/bubbleSort", method = RequestMethod.POST)
    public ResponseBody<Integer[]> bubbleSort(@ApiParam(value = "源数据表")@RequestParam Integer[] array){
        ResponseBody responseBody= new ResponseBody<int[]>();
        responseBody.setLength(array.length);
        array=sortService.bubbleSort(array);
        responseBody.setT(array);
        return  responseBody.returnBody();
    }
    @ApiOperation(value = "2.选择排序@jin")
    @RequestMapping(value = "/selectSort", method = RequestMethod.POST)
    public ResponseBody<Integer[]> selectSort(@ApiParam(value = "源数据表")@RequestParam Integer[] array){
        return  new ResponseBody<Integer[]>(array);
    }
    @ApiOperation(value = "3.插入排序@jin")
    @RequestMapping(value = "/insertSort", method = RequestMethod.POST)
    public ResponseBody<Integer[]> insertSort(@ApiParam(value = "源数据表")@RequestParam Integer[] array){
        return  new ResponseBody<Integer[]>(array);
    }
    @ApiOperation(value = "4.希尔排序@jin")
    @RequestMapping(value = "/shellSort", method = RequestMethod.POST)
    public ResponseBody<Integer[]> shellSort(@ApiParam(value = "源数据表")@RequestParam Integer[] array){
        return  new ResponseBody<Integer[]>(array);
    }
    @ApiOperation(value = "5.快速排序@jin")
    @RequestMapping(value = "/quickSort", method = RequestMethod.POST)
    public ResponseBody<Integer[]> quickSort(@ApiParam(value = "源数据表")@RequestParam Integer[] array){
        return  new ResponseBody<Integer[]>(array);
    }
    @ApiOperation(value = "6.归并排序@jin")
    @RequestMapping(value = "/mergeSort", method = RequestMethod.POST)
    public ResponseBody<Integer[]> mergeSort(@ApiParam(value = "源数据表")@RequestParam Integer[] array){
        return  new ResponseBody<Integer[]>(array);
    }
    @ApiOperation(value = "7.堆排序@jin")
    @RequestMapping(value = "/heapSort", method = RequestMethod.POST)
    public ResponseBody<Integer[]> heapSort(@ApiParam(value = "源数据表")@RequestParam Integer[] array){
        return  new ResponseBody<Integer[]>(array);
    }
}
