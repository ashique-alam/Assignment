package com.ashique.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Demo {
	@Value("#{22+44}")
	private int x;
	
	@Value("#{8>6?88:66}")
	private int y;

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

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	
	
}
