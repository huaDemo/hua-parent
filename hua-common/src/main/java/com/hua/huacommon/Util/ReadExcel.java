package com.hua.huacommon.Util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * @author: hua
 * @create: 2018-06-28 17:42
 */
public class ReadExcel {


    /**
     * 读取后缀为xls的excel文件
     *
     * @param file
     * @return
     * @throws Exception
     */
    public List<List<List<String>>> readExcelXls(File file) throws Exception {
        InputStream inputStream = new FileInputStream(file);
        //得到Excel工作簿对象
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(inputStream);
        //遍历得到Excel的sheet页
        for (int i = 0; i < hssfWorkbook.getNumberOfSheets(); i++) {

        }
        return null;
    }
}
