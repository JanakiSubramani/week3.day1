package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("new desktop");
	
	}
public static void main(String[] args) {
	Desktop dc=new Desktop();
	dc.desktopSize();
	dc.computerModel();
}
}
