package Class;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
 
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class cell0 extends JLabel implements TableCellRenderer 
{
    Border padding = BorderFactory.createEmptyBorder(0, 4, 0, 0);
 
   public cell0()
    {
        setFont(new Font("Tahoma", Font.PLAIN, 14));
        setOpaque(true);
        setBackground(new Color(212, 212, 212));
        setForeground(Color.BLACK);
        setBorder(BorderFactory.createCompoundBorder(getBorder(), padding));
    }
     
    @Override
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) 
   {
        setText(value.toString());  
        if(isSelected == true)
        {
            setBackground(new Color(51,153,255));
            setForeground(Color.white);
        }
        else
        {
            setBackground(new Color(212, 212, 212));
            setForeground(Color.BLACK);
        }
        return this;
   }
}
