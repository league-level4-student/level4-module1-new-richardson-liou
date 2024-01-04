package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseFollowPolymorph extends Polymorph implements MouseMotionListener{

	public MouseFollowPolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		int mouseX = arg0.getX();
		int mouseY = arg0.getY();
		setX(mouseX);
		setX(mouseY);
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		int mouseX = arg0.getX();
		int mouseY = arg0.getY();
		setX(mouseX);
		setX(mouseY);
		
	}

}
