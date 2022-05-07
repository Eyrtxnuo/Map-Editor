
package inputs;

import Env.Constants;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.SwingUtilities;
import mapeditor.MapEditor;

/**
 *
 * @author matti
 */
public class MouseInputs implements MouseListener, MouseMotionListener{

    private int clickX;
    private int initialOffset;
    
    
    public MouseInputs() {
    }
    
    private int getBlock(){
        return (int)MapEditor.jPanel.BlockSpinner.getValue();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(MapEditor.jPanel.HandToggleButton.isSelected() || SwingUtilities.isRightMouseButton(e)){
            initialOffset = MapEditor.jPanel.getOffsetX();
            clickX = e.getX();
        }else{
            int x = (e.getX()-MapEditor.jPanel.getOffsetX())/Constants.Map.TILES_DEFAULT_SIZE;
            int y = e.getY()/Constants.Map.TILES_DEFAULT_SIZE;
            changeTile(x, y);
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(MapEditor.jPanel.HandToggleButton.isSelected() || SwingUtilities.isRightMouseButton(e)){
            int moved = -clickX + e.getX();
            
            MapEditor.jPanel.setOffsetX(initialOffset+moved);
            MapEditor.repaint();
        }else{
            int x = (e.getX()-MapEditor.jPanel.getOffsetX())/Constants.Map.TILES_DEFAULT_SIZE;
            int y = e.getY()/Constants.Map.TILES_DEFAULT_SIZE;
            changeTile(x, y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
    
    private void changeTile(int x, int y){
        if(x<mapeditor.MapEditor.mapImg.getWidth() && x>=0){
            if(y<mapeditor.MapEditor.mapImg.getHeight() && y>=0){
                if(getBlock()>=0){
                    if(mapeditor.MapEditor.mapImg.getPixel(x, y).getRed()!= getBlock()){
                        mapeditor.MapEditor.mapImg.getPixel(x, y).setRed(getBlock());
                        mapeditor.MapEditor.repaint();
                    }
                }else{
                    int enemy = -getBlock();
                    if(mapeditor.MapEditor.mapImg.getPixel(x, y).getGreen()!= enemy){
                        mapeditor.MapEditor.mapImg.getPixel(x, y).setGreen(enemy);
                        mapeditor.MapEditor.repaint();
                    }
                }
                
            }
        }
    }
}
