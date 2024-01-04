package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 width = 50;
   	 height = 50;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
    
    public int getX() {
    	return x;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setX(int x) {
    	this.x = x;
    }
    
    public void setY(int y) {
    	this.y = y;
    }
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public void setWidth(int x) {
    	this.width = x;
    }
    
    public void setHeight(int y) {
    	this.height = y;
    }
    
}
