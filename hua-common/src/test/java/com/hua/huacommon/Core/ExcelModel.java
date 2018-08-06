package com.hua.huacommon.Core;

/**
 * @author: hua
 * @create: 2018-06-27 22:46
 */
public class ExcelModel {
    private String name;
    private String type;
    private String direction;
    private String from;
    private String isBS;
    private String isBJ;
    private String isSS;
    private String isSJ;
    private String isQS;
    private String isQJ;

    @Override
    public String toString() {
        return "ExcelModel{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", direction='" + direction + '\'' +
                ", from='" + from + '\'' +
                ", isBS='" + isBS + '\'' +
                ", isBJ='" + isBJ + '\'' +
                ", isSS='" + isSS + '\'' +
                ", isSJ='" + isSJ + '\'' +
                ", isQS='" + isQS + '\'' +
                ", isQJ='" + isQJ + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getIsBS() {
        return isBS;
    }

    public void setIsBS(String isBS) {
        this.isBS = isBS;
    }

    public String getIsBJ() {
        return isBJ;
    }

    public void setIsBJ(String isBJ) {
        this.isBJ = isBJ;
    }

    public String getIsSS() {
        return isSS;
    }

    public void setIsSS(String isSS) {
        this.isSS = isSS;
    }

    public String getIsSJ() {
        return isSJ;
    }

    public void setIsSJ(String isSJ) {
        this.isSJ = isSJ;
    }

    public String getIsQS() {
        return isQS;
    }

    public void setIsQS(String isQS) {
        this.isQS = isQS;
    }

    public String getIsQJ() {
        return isQJ;
    }

    public void setIsQJ(String isQJ) {
        this.isQJ = isQJ;
    }
}
