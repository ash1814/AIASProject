package Class;

import java.awt.Color;
import java.awt.Font;
 
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class column0 extends JLabel implements TableCellRenderer 
{
    Border padding = BorderFactory.createEmptyBorder(0, 4, 0, 0);
 
    public column0()
    {
        setFont(new Font("Tahoma", Font.BOLD, 14));
        setOpaque(true);
        setForeground(Color.WHITE);
        setBackground(new Color(50,62,100));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setHorizontalAlignment(JLabel.LEFT);
        setBorder(BorderFactory.createCompoundBorder(getBorder(), padding));
    }
     
    @Override
    public column0 getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) 
    {
        setText(value.toString());       
        return this;
    }
 
}
