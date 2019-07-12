package com.alibaba.easyexcel.test.wirte.simple;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.easyexcel.test.util.FileUtil;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;

/**
 * Simple data test
 * 
 * @author zhuangjiaju
 */
public class SimpleData07Test {

    @Test
    public void simple() {
        ExcelWriter writer = EasyExcelFactory.writerBuilder().outputFile(FileUtil.createNewFile("simple07.xlsx"))
            .head(SimpleData.class).build();
        Sheet sheet = EasyExcelFactory.writerSheetBuilder().sheetNo(0).sheetName("simple").build();
        writer.write(createData(10), sheet);
        writer.finish();
    }

    private List<SimpleData> createData(int count) {
        List<SimpleData> list = new ArrayList<SimpleData>();
        for (int i = 0; i < count; i++) {
            SimpleData simpleData = new SimpleData();
            simpleData.setString("字符体" + i);
            list.add(simpleData);
        }
        return list;
    }
}