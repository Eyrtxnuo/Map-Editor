/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Image;

import Env.Constants;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class MapImage{

    


    Pixel[][] matrix;
    private static final BufferedImage[] levelSprite = importOutsideSprites(); 
    private static final BufferedImage background = GetBgAtlas();

    public MapImage(int height, int width) {
        matrix = new Pixel[height][width];
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                matrix[h][w] = new Pixel(11, 0, 0);
            }
        }
    }

    public void changeResolution(int width, int height){
        
    }
    
    public void changeWidth(int width){
        Pixel[][] newMat = new Pixel[getHeight()][width];
        for (int h = 0; h < getHeight(); h++) {
            for (int w = 0; w < width; w++) {
                Pixel p=  null;
                try{
                    p= matrix[h][w];
                }catch(Exception ex){
                    
                }
                newMat[h][w] = (p!=null)?p:new Pixel(11, 0, 0);
            }
        }
        matrix=newMat;
    }
    
    public Pixel getPixel(int x, int y){
        return matrix[y][x];
    }

    public Pixel[][] getMatrix() {
        return matrix;
    }

    public int getHeight() {
        return matrix.length;
    }

    public int getWidth() {
        return (matrix[0]!=null)?matrix[0].length:0;
    }
    
    public BufferedImage getMap(){
        BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        for (int h = 0; h < getHeight(); h++) {
            for (int w = 0; w < getWidth(); w++) {
                g.setColor( matrix[h][w].getAsColor());
                g.fillRect(w, h, 1, 1);
            }
        }
        return image;
    }
    
    public BufferedImage getMapPreview(){
        BufferedImage image = new BufferedImage(getWidth()*Constants.Map.TILES_DEFAULT_SIZE, getHeight()*Constants.Map.TILES_DEFAULT_SIZE, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        g.drawImage(background, 0, 0, image.getWidth(), image.getHeight(),null);
        for (int h = 0; h < getHeight(); h++) {
            for (int w = 0; w < getWidth(); w++) {
                int y = h * Constants.Map.TILES_DEFAULT_SIZE;
                int x = w * Constants.Map.TILES_DEFAULT_SIZE;
                int index = matrix[h][w].getRed();
                if(index>levelSprite.length){
                    index=11;//if not valid, set air
                }
                g.drawImage(levelSprite[index], x, y, null);
                
                int enemy = matrix[h][w].getGreen();
                if(enemy!=0){
                    g.drawImage(getEnemySprite(enemy), x, y, null);
                }
            }
        }
        return image;
    }

    public static BufferedImage[] getLevelSprite() {
        return levelSprite;
    }
    
    public static BufferedImage getLevelSprite(int index) {
        if(index<0 || index>=levelSprite.length) return null;
        return levelSprite[index];
    }
    
    
    private static BufferedImage[] importOutsideSprites() {
        BufferedImage img = GetMapAtlas();
        BufferedImage[] levelSprite = new BufferedImage[48];
        for(int j = 0;j<4;j++){
            for(int i = 0;i< 12; i++){
                int index = j*12 + i;
                levelSprite[index] = img.getSubimage(i*Constants.Map.TILES_DEFAULT_SIZE, j*Constants.Map.TILES_DEFAULT_SIZE, Constants.Map.TILES_DEFAULT_SIZE, Constants.Map.TILES_DEFAULT_SIZE);
            }
        }
        return levelSprite;
    }
    
    private static  BufferedImage GetImageAtlas(String atlas){
        BufferedImage img = null;
        InputStream is = MapImage.class.getResourceAsStream(atlas);
        try {
           img = ImageIO.read(is);
            
        } catch (IOException ex) {
            Logger.getLogger(MapImage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(MapImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return img;
    }
    
    private static  BufferedImage GetMapAtlas(){
        return GetImageAtlas("/outside_sprites.png");
    }
    
    private static  BufferedImage GetBgAtlas(){
        return GetImageAtlas("/background.png");
    }
    
    public static BufferedImage GetCrabbyAtlas(){
        return GetImageAtlas("/crabby.png");
    }
    
   public static BufferedImage GetFollowCrabbyAtlas(){
        return GetImageAtlas("/follow-crabby.png");
    }
    
    private static BufferedImage getEnemySprite(int i) {
        switch (i){
            case 0 ->{
                return null;
            }
            case 1 ->{
                return GetCrabbyAtlas();
            }
            case 2->{
                return GetFollowCrabbyAtlas();
            }
        }
        return null;
    }
    
    
    public static BufferedImage getPrevewSprite(int i) {
        if(i>0){
            return getLevelSprite(i);
        }else{
            int i2 = -(i+1);
            return getEnemySprite(i2);
        }
    }
    
    public void loadLevelData(File file) throws IOException {
        BufferedImage img = ImageIO.read(file);
        Pixel[][] lvlData = new Pixel[img.getHeight()][img.getWidth()];
        for (int j = 0; j < img.getHeight(); j++){
            for (int i = 0; i < img.getWidth(); i++) {
                lvlData[j][i] = new Pixel(0, 0, 0);
                Color color = new Color(img.getRGB(i, j));
                lvlData[j][i].setAsColor(color);
            }
        }
        matrix = lvlData;
    }
}
