package mapeditor;

import Image.MapImage;
import inputs.KeyboardInputs;
import inputs.MouseInputs;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author matti
 */
public class MapEditor {

    static JFrame jframe;
    public static Panel jPanel;
    public static MapImage mapImg;
    
    public static void main(String[] args) {
        mapImg = new MapImage(14, 28);
        jPanel = new Panel(mapImg);
        
        initFrame(jPanel);
    }
    
    public static void repaint(){
        jPanel.repaint();
    }
    
    
    
    public static void initFrame(JPanel gamePanel) {
        jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setResizable(false);
        jframe.pack();//auto-fit gamePanel
        jframe.setLocationRelativeTo(null);//center on screen
        jframe.setVisible(true);//set visible - always at the end of constructor!
    }
    
}
