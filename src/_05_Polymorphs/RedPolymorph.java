package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph {
    public RedPolymorph(int width, int height) {
        super(width, height);
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
