package com.dayton.dolphin.simulation.table;

/**
 * Created by root on 17-1-22.
 */
public interface TableModel {

    void addTableModelListener();

    Class<?> getColumnClass();

    Integer getColumnCount();

    String getColumnName();

    Integer getRowCount();

    String getValueAt();

    Boolean isCellEditable();

    Boolean removeTableModelListener();

    void setValueAt(Integer row, Integer col);

}
