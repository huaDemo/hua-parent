package com.hua.huacommon.Core;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author: hua
 * @create: 2018-06-27 19:05
 */
public class ExcelTest {

    @Test
    public void poiTest() throws Exception {
        //创建poi excelModel对象
        List<ExcelModel> poiList = new ArrayList<ExcelModel>();
        //创建poi2 excelModel对象
        List<ExcelModel> poi2List = new ArrayList<ExcelModel>();
        //创建poi3 excelModel对象
        List<ExcelModel> poi3List = new ArrayList<ExcelModel>();
        //创建poi4 excelModel对象
        List<ExcelModel> poi4List = new ArrayList<ExcelModel>();
        //创建myPoi excelModel对象
        List<ExcelModel> myPoiList = new ArrayList<ExcelModel>();

        //获取poi1
        XSSFSheet sheet = this.getSheet("F:/poi.xlsx", 0);
        for (int i = 2; i < 10; i++) {
            ExcelModel excelModel = new ExcelModel();
            //获取第i行
            XSSFRow row = sheet.getRow(i);
            System.out.println("第" + i + "行");
            if (row != null) {
                System.out.println(row.getCell(1));
                excelModel.setDirection(this.getStringCell(row, 1));
                System.out.println(row.getCell(2));
                excelModel.setName(this.getStringCell(row, 2));
                System.out.println(row.getCell(3));
                excelModel.setType(this.getStringCell(row, 3));
                System.out.println(row.getCell(4));
                excelModel.setIsSS(this.getStringCell(row, 4));
                System.out.println(row.getCell(5));
                excelModel.setIsSJ(this.getStringCell(row, 5));
                System.out.println(row.getCell(7));
                excelModel.setFrom(this.getStringCell(row, 7));
            }
            System.out.println(excelModel);
            poiList.add(excelModel);
        }
        //获取poi2
        XSSFSheet sheet2 = this.getSheet("F:/poi2.xlsx", 0);
        for (int i = 2; i < 10; i++) {
            ExcelModel excelModel = new ExcelModel();
            //获取第i行
            XSSFRow row = sheet2.getRow(i);
            System.out.println("第" + i + "行");
            if (row != null) {
                System.out.println(row.getCell(1));
                excelModel.setDirection(this.getStringCell(row, 1));
                System.out.println(row.getCell(2));
                excelModel.setName(this.getStringCell(row, 2));
                System.out.println(row.getCell(3));
                excelModel.setType(this.getStringCell(row, 3));
                System.out.println(row.getCell(4));
                excelModel.setIsSS(this.getStringCell(row, 4));
                System.out.println(row.getCell(5));
                excelModel.setIsSJ(this.getStringCell(row, 5));
                System.out.println(row.getCell(7));
                excelModel.setFrom(this.getStringCell(row, 7));
            }
            System.out.println(excelModel);
            poi2List.add(excelModel);
        }
        myPoiList = this.addList(poiList, poi2List);
        //获取poi3
        XSSFSheet sheet3 = this.getSheet("F:/poi3.xlsx", 0);
        for (int i = 2; i < 10; i++) {
            ExcelModel excelModel = new ExcelModel();
            //获取第i行
            XSSFRow row = sheet3.getRow(i);
            System.out.println("第" + i + "行");
            if (row != null) {
                System.out.println(row.getCell(1));
                excelModel.setDirection(this.getStringCell(row, 1));
                System.out.println(row.getCell(2));
                excelModel.setName(this.getStringCell(row, 2));
                System.out.println(row.getCell(3));
                excelModel.setType(this.getStringCell(row, 3));
                System.out.println(row.getCell(4));
                excelModel.setIsSS(this.getStringCell(row, 4));
                System.out.println(row.getCell(5));
                excelModel.setIsSJ(this.getStringCell(row, 5));
                System.out.println(row.getCell(7));
                excelModel.setFrom(this.getStringCell(row, 7));
            }
            System.out.println(excelModel);
            poi3List.add(excelModel);
        }
        myPoiList = this.addList(myPoiList, poi3List);
        //获取poi4
        XSSFSheet sheet4 = this.getSheet("F:/poi4.xlsx", 0);
        for (int i = 2; i < 10; i++) {
            ExcelModel excelModel = new ExcelModel();
            //获取第i行
            XSSFRow row = sheet4.getRow(i);
            System.out.println("第" + i + "行");
            if (row != null) {
                System.out.println(row.getCell(1));
                excelModel.setDirection(this.getStringCell(row, 1));
                System.out.println(row.getCell(2));
                excelModel.setName(this.getStringCell(row, 2));
                System.out.println(row.getCell(3));
                excelModel.setType(this.getStringCell(row, 3));
                System.out.println(row.getCell(4));
                excelModel.setIsSS(this.getStringCell(row, 4));
                System.out.println(row.getCell(5));
                excelModel.setIsSJ(this.getStringCell(row, 5));
                System.out.println(row.getCell(7));
                excelModel.setFrom(this.getStringCell(row, 7));
            }
            System.out.println(excelModel);
            poi4List.add(excelModel);
        }
        myPoiList = this.addList(myPoiList, poi4List);
        this.createMyExcel("F:/myPoi.xlsx", 0, myPoiList);

    }

    /**
     * 将两个集合合并
     *
     * @param models1
     * @param models2
     * @return
     */
    public List<ExcelModel> addList(List<ExcelModel> models1, List<ExcelModel> models2) {
        Map<String, ExcelModel> map = new HashMap<String, ExcelModel>();
        if (models1.size() >= models2.size()) {
            for (ExcelModel excelModel1 : models1) {
                map.put(excelModel1.getName(), excelModel1);
            }
            for (ExcelModel excelModel2 : models2) {
                if (map.containsKey(excelModel2.getName())) {
                    map.remove(excelModel2.getName());
                }
            }
        } else {
            for (ExcelModel excelModel2 : models2) {
                map.put(excelModel2.getName(), excelModel2);
            }
            for (ExcelModel excelModel1 : models1) {
                if (map.containsKey(excelModel1.getName())) {
                    map.remove(excelModel1.getName());
                }
            }
        }
        //判断是否有不相同的集合
        if (map.size() > 0) {
            for (Map.Entry<String, ExcelModel> entry : map.entrySet()) {
                if (models1.size() >= models2.size()) {
                    models1.add(entry.getValue());
                    return models1;
                } else {
                    models2.add(entry.getValue());
                    return models2;
                }
            }
        } else {
            return models1;
        }
        return null;
    }

    public XSSFSheet getSheet(String url, int sheetPage) throws IOException {
        InputStream fs = new FileInputStream(new File(url));
        //得到Excel工作簿对象
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        //得到Excel工作表对象
        return wb.getSheetAt(sheetPage);
    }

    public void createMyExcel(String url, int sheetPage, List<ExcelModel> excelModelList) throws Exception {
        //XSSFSheet sheet = this.getSheet(url, sheetPage);
        //创建excel
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("测试sheet");
        int i = 0;
        for (ExcelModel excelModel : excelModelList) {
            //创建第i行
            XSSFRow xssfRow = xssfSheet.createRow(i);
            //创建第0列
            XSSFCell xssfCell = xssfRow.createCell(0);
            xssfCell.setCellValue(excelModel.getName());
            //创建第1列
            XSSFCell xssfCell1 = xssfRow.createCell(1);
            xssfCell1.setCellValue(excelModel.getType());
            //创建第2列
            XSSFCell xssfCell12 = xssfRow.createCell(2);
            xssfCell12.setCellValue(excelModel.getDirection());
            //创建第3列
            XSSFCell xssfCell13 = xssfRow.createCell(3);
            xssfCell13.setCellValue(excelModel.getFrom());
            //创建第4列
            XSSFCell xssfCell14 = xssfRow.createCell(4);
            xssfCell14.setCellValue(excelModel.getIsBS());
            //创建第5列
            XSSFCell xssfCell15 = xssfRow.createCell(5);
            xssfCell15.setCellValue(excelModel.getIsBJ());
            //创建第6列
            XSSFCell xssfCell16 = xssfRow.createCell(6);
            xssfCell16.setCellValue(excelModel.getIsSS());
            //创建第7列
            XSSFCell xssfCell17 = xssfRow.createCell(7);
            xssfCell17.setCellValue(excelModel.getIsSJ());
            //创建第8列
            XSSFCell xssfCell18 = xssfRow.createCell(8);
            xssfCell18.setCellValue(excelModel.getIsQS());
            //创建第8列
            XSSFCell xssfCell19 = xssfRow.createCell(9);
            xssfCell19.setCellValue(excelModel.getIsQJ());
            //创建第i行
            System.out.println("创建第" + i + "行成功!");
            i++;
        }
        //输出excel文件
        FileOutputStream fileOutputStream = new FileOutputStream(new File("F:/myPoi.xlsx"));
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();
        xssfWorkbook.close();
    }

    public String getStringCell(XSSFRow row, int i) {
        if (row != null && row.getCell(i) != null && row.getCell(i).getCellType() == Cell.CELL_TYPE_STRING) {
            return row.getCell(i).getStringCellValue();
        } else {
            return null;
        }
    }


}