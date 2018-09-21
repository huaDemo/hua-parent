package com.hua.huacommon.Util;

import java.util.List;

/**
 * 分页实体
 *
 * @author: hua
 * @create: 2018-06-09 12:34
 */
public class Page {

    private Integer currentPage = 1;// 当前页

    private Integer pageSize = 10;// 每页量

    private Integer totalRecord;// 总记录数

    private Integer totalPage;// 总页数

    private List<?> data;//查询数据

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
