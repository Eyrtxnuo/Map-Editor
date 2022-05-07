/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Image;

import java.awt.Color;

public class Pixel {

    byte red;
    byte green;
    byte blue;

    public Pixel(int red, int green, int blue) {//values are max 255. inputs >255 will be transformed to 0;
        this.red = (red > 0 && red < 256) ? (byte) (red - 128) : -128;
        this.green = (green > 0 && green < 256) ? (byte) (green - 128) : -128;
        this.blue = (blue > 0 && blue < 256) ? (byte) (blue - 128) : -128;
    }

    public int getRed() {
        return red + 128;
    }

    public void setRed(int red) {
        this.red = (red > 0 && red < 256) ? (byte) (red - 128) : -128;
    }

    public int getGreen() {
        return green + 128;
    }

    public void setGreen(int green) {
        this.green = (green > 0 && green < 256) ? (byte) (green - 128) : -128;
    }

    public int getBlue() {
        return blue + 128;
    }

    public void setBlue(int blue) {
        this.blue = (blue > 0 && blue < 256) ? (byte) (blue - 128) : -128;
    }

    @Override
    public String toString() {
        return "[ " + getRed() + "; " + getGreen() + "; " + getBlue() + " ]";
    }

    public Color getAsColor() {
        return new Color(getRed(), getGreen(), getBlue());
    }

    public void setAsColor(Color c) {
        setRed(c.getRed());
        setGreen(c.getGreen());
        setBlue(c.getBlue());
    }
}