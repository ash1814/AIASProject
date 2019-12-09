package Class;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class CellRenderer extends DefaultTableCellRenderer 
{  
   Border padding = BorderFactory.createEmptyBorder(0, 3, 0, 0);
   
   @Override
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) 
   {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
//        String s = table.getModel().getValueAt(row, 5).toString();
        
        setBorder(BorderFactory.createCompoundBorder(getBorder(), padding));
        setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
        /*setBorder(BorderFactory.createLineBorder(new Color(51,153,255)));
        if(isSelected == false && hasFocus == false)
        { 
            if(s.equals("0") || s.equals("1")) 
            {
                c.setBackground(Color.red);
                c.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
            } 
            else 
            {
                c.setBackground(null);
                c.setForeground(Color.black);
                c.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
            }
        }*/
        return c;
   }
}
