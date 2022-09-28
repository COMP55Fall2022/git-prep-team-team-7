//Michael Phelps
//Steph curry
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.png", 200, 300);
		add(robot);
		GLabel label = new GLabel("Lebron James", 200, 400);
		add(label); // Ryan 
		}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}