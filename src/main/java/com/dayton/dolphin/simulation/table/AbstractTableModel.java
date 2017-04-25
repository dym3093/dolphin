package com.dayton.dolphin.simulation.table;

/**
 * Created by root on 17-1-22.
 */
public abstract class AbstractTableModel {

    protected TableModel tableModel;

    public abstract Integer getColumnCount();

    public abstract Integer getRowCount();

    public abstract String getValueAt(int row, int col);

}
