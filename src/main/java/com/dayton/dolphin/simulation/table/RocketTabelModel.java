package com.dayton.dolphin.simulation.table;

/**
 * Created by root on 17-1-22.
 */
public class RocketTabelModel extends AbstractTableModel{

    protected Rocket[] rockets;

    protected String[] columnNames = new String[]{"Name", "Price", "Apogee"};

    public RocketTabelModel(Rocket[] rockets) {
        this.rockets = rockets;
    }

    /**
     * 获取总列数
     * @return Integer
     */
    public Integer getColumnCount() {
        return columnNames.length;
    }

    /**
     * 获取列名称
     * @param col 列的索引号
     * @return String
     */
    public String getColumnName(Integer col){
        if(col>=0&&col<=columnNames.length-1){
            return columnNames[col];
        }else {
            return null;
        }
    }

    /**
     * 获取总行数
     * @return Integer
     */
    public Integer getRowCount() {
        return rockets.length;
    }

    /**
     * 获取对应行列的文本值
     * @param row 行号
     * @param col 列号
     * @return String
     */
    public String getValueAt(int row, int col) {
        String content = null;
        Rocket rocket;
        if(row>=0&&row<=rockets.length-1){
            rocket = rockets[row];
            if(col>=0&&col<=columnNames.length-1){
                if("Name".equals(columnNames[col])){
                    content = rocket.getName();
                }else if( "Price".equals(columnNames[col])){
                    content = rocket.getPrice().toString();
                }else if("Apogee".equals(columnNames[col])){
                    content = rocket.getApogee().toString();
                }
            }
        }
        return content;
    }

}
