// 
// Decompiled by Procyon v0.5.36
// 

package Class;

import java.io.InputStream;
import java.awt.FontFormatException;
import java.io.IOException;
import java.awt.Font;

public class Roboto
{
    public static final Font BLACK;
    public static final Font BLACK_ITALIC;
    public static final Font BOLD;
    public static final Font BOLD_ITALIC;
    public static final Font ITALIC;
    public static final Font LIGHT;
    public static final Font LIGHT_ITALIC;
    public static final Font MEDIUM;
    public static final Font MEDIUM_ITALIC;
    public static final Font REGULAR;
    public static final Font THIN;
    public static final Font THIN_ITALIC;
    
    private static Font loadFont(final String resourceName) {
        try (final InputStream inputStream = Roboto.class.getResourceAsStream("/fonts/" + resourceName)) {
            return Font.createFont(0, inputStream);
        }
        catch (IOException | FontFormatException ex2) {
            final Exception ex = null;
            final Exception e = ex;
            throw new RuntimeException("Could not load " + resourceName, e);
        }
    }
    
    static {
        BLACK = loadFont("Roboto-Black.ttf").deriveFont(1);
        BLACK_ITALIC = loadFont("Roboto-BlackItalic.ttf").deriveFont(3);
        BOLD = loadFont("Roboto-Bold.ttf").deriveFont(1);
        BOLD_ITALIC = loadFont("Roboto-BoldItalic.ttf").deriveFont(3);
        ITALIC = loadFont("Roboto-Italic.ttf").deriveFont(2);
        LIGHT = loadFont("Roboto-Light.ttf").deriveFont(0);
        LIGHT_ITALIC = loadFont("Roboto-LightItalic.ttf").deriveFont(2);
        MEDIUM = loadFont("Roboto-Medium.ttf").deriveFont(0);
        MEDIUM_ITALIC = loadFont("Roboto-MediumItalic.ttf").deriveFont(2);
        REGULAR = loadFont("Roboto-Regular.ttf").deriveFont(0);
        THIN = loadFont("Roboto-Thin.ttf").deriveFont(0);
        THIN_ITALIC = loadFont("Roboto-ThinItalic.ttf").deriveFont(2);
    }
}
