package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	public MovingMorph(int width, int height) {
        super(width, height);
    }

    public void update() {
    	setX(getX()+10);
    	setY(getY()+10);
    }

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
}
