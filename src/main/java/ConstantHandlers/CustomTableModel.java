
package ConstantHandlers;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class CustomTableModel extends DefaultTableModel{
    
    private boolean[][] editable_cells; // 2d array to represent rows and columns

    public CustomTableModel(Vector<Vector> tableData, Vector<String> columns) {
        super(tableData, columns);
        this.editable_cells = new boolean[tableData.size()][columns.size()];
    }
    
    public CustomTableModel(int rows, int cols) { // constructor
        super(rows, cols);
        this.editable_cells = new boolean[rows][cols];
    }

    @Override
    public boolean isCellEditable(int row, int column) { // custom isCellEditable function
        return this.editable_cells[row][column];
    }

    public void setCellEditable(int row, int col, boolean value) {
        this.editable_cells[row][col] = value; // set cell true/false
        this.fireTableCellUpdated(row, col);
    }
    
    
    
}
