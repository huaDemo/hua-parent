package com.hua.huacommon.Util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
    public static List<List<List<String>>> readExcelXls(File file) throws Exception {
        InputStream inputStream = new FileInputStream(file);
        //得到Excel工作簿对象
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(inputStream);
        //遍历得到Excel的sheet页
        for (int i = 0; i < hssfWorkbook.getNumberOfSheets(); i++) {

        }
        return null;
    }

    /**
     * 得到XSSFSheet对象
     *
     * @param url
     * @param sheetPage
     * @return
     * @throws IOException
     */
    public static XSSFSheet getSheet(String url, int sheetPage) throws IOException {
        InputStream fs = new FileInputStream(new File(url));
        //得到Excel工作簿对象
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        //得到Excel工作表对象
        return wb.getSheetAt(sheetPage);
    }

    /**
     * 得到string类型单元格的值
     *
     * @param row
     * @param i
     * @return
     */
    public static String getStringCell(XSSFRow row, int i) {
        if (row != null && row.getCell(i) != null && row.getCell(i).getCellType() == Cell.CELL_TYPE_STRING) {
            return row.getCell(i).getStringCellValue();
        } else {
            return null;
        }
    }

}
