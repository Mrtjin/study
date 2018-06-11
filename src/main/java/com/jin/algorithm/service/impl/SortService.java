package com.jin.algorithm.service.impl;

import com.jin.algorithm.service.ISortService;
import org.springframework.stereotype.Component;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: www.lvmama.com</p>
 *
 * @author jin
 * @version 1.0 2018/6/11
 */
@Component("sortService")
public class SortService implements ISortService {
    /**
     * <p>Description: 使用冒泡排序将数据按小到大的规律排序</p>
     *
     * @param array
     * @version 1.0 2018/6/11
     * @author jin
     */
    @Override
    public int[] bubbleSort(int[] array) {
        for (int i=0,l=array.length;i<l;i++){
            int b=0;
            while(b<l-i-1){
                if (array[b]>array[b+1]){
                    int temp=array[b];
                    array[b]=array[b+1];
                    array[b+1]=temp;
                }
                b++;
            }
        }
        return array;
    }
}
