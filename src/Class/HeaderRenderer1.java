package Class;

import java.awt.Color;
import java.awt.Font;
 
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class HeaderRenderer1 extends JLabel implements TableCellRenderer 
{
    Border padding = BorderFactory.createEmptyBorder(0, 4, 0, 0);
 
    public HeaderRenderer1()
    {
        setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
        setOpaque(true);
        setForeground(Color.WHITE);
        setBackground(new Color(51,153,255));
        setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
        setHorizontalAlignment(JLabel.LEFT);
    }
     
    @Override
    public HeaderRenderer1 getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) 
    {
        setText(value.toString());
        
        return this;
    }
 
}
