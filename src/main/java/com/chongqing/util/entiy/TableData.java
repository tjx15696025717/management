package com.chongqing.util.entiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
@AllArgsConstructor
@NoArgsConstructor
public class TableData<T>{

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    class MyMap{
        int id;
        T date;
    }

    public List getTableHead() {
        return tableHead;
    }

    public void setTableHead(List tableHead) {
        this.tableHead = tableHead;
    }

    @Override
    public String toString() {
        return "TableData{" +
                "tableHead=" + tableHead +
                ", tableData=" + tableData +
                '}';
    }

    private List tableHead;

    public List<MyMap> getTableData() {
        return tableData;
    }

    public void setTableData(List<T> list) {

        if (null == list && list.isEmpty()) this.tableData = null;
        List lists = new ArrayList<T>();
        for (int i = 0; i <list.size() ; i++) {
            MyMap objectMyMap = new MyMap();
            objectMyMap.setDate(list.get(i));
            objectMyMap.setId(i+1);
            lists.add(objectMyMap);
        }
        this.tableData = lists;
    }
    private List<MyMap> tableData;

}
