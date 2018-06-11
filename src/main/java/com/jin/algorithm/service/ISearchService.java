package com.jin.algorithm.service;

/**
 * <p>Title: 查找算法</p>
 * <p>Description: </p>
 * <p>Company: www.lvmama.com</p>
 *
 * @author jin
 * @version 1.0 2018/6/11
 */
public interface ISearchService {

    /**
    * <p>Description: 二分查找算法，输入一组数据和需要查找的数据，返回查找到的数据下标，没有找到返回-1</p>
    * @version 1.0 2018/6/11
    * @author jin
    */
    public int binarySearch(int array[],int index);
}
