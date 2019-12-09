package Class;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class TableCellRenderer extends DefaultTableCellRenderer 
{
   private static final long serialVersionUID = 1L;
   Border padding = BorderFactory.createEmptyBorder(0, 4, 0, 0);
   
   @Override
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) 
   {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        setBorder(BorderFactory.createCompoundBorder(getBorder(), padding));
        return c;
   }
}
