package Class;

import java.awt.Color;
import java.awt.Font;
 
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class HeaderRenderer extends JLabel implements TableCellRenderer 
{
    Border padding = BorderFactory.createEmptyBorder(0, 3, 0, 0);
 
    public HeaderRenderer()
    {
        setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
        setOpaque(true);
        setForeground(Color.WHITE);
        //setBackground(new Color(51,153,255));
        setBackground(new Color(3, 3, 3));
        //setBorder(BorderFactory.createLineBorder(new Color(153,153,153)));
        setBorder(BorderFactory.createLineBorder(new Color(153,153,153), 1));
        
        setHorizontalAlignment(JLabel.LEFT);
        
        setBorder(BorderFactory.createCompoundBorder(getBorder(), padding));
    }
     
    @Override
    public HeaderRenderer getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) 
    {
        setText(value.toString());
        
        return this;
    }
 
}
