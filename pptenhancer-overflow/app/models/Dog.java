package models;

public class Dog extends Animal {
	public Integer getHeight () {
		if (height == null) {
			height=new Integer (10);
		}
		return height;
	}
}
