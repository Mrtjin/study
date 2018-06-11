package com.jin.algorithm.service.impl;

import com.jin.algorithm.service.ISearchService;
import com.jin.algorithm.service.ISortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <p>Title: 二分查找算法实现</p>
 * <p>Description: </p>
 * <p>Company: www.lvmama.com</p>
 *
 * @author jin
 * @version 1.0 2018/6/11
 */
@Component("searchService")
public class SearchServiceImpl implements ISearchService {
    @Autowired
    private ISortService sortService;
    @Override
    public int binarySearch(int[] array, int index) {
        if (null==array||index<0)return -1;
        array=sortService.bubbleSort(array);
        int s=0;
        int e=array.length-1;
        int mid = (s+e)>>>1;
        while(e>=s){
            if (array[index]<array[mid]){
                e=mid-1;
            }else if (array[index]>array[mid]){
                s=mid+1;
            }else {
                return mid;
            }
        }
        return -mid;
    }
}
