//Lebron James :O
//Steph curry :D
//balls
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	//TA
	//COMP 55
	//GITHUB
	public void run() {
		GImage robot = new GImage("robot.png", 200, 300);
		add(robot);
		GLabel label = new GLabel("", 250, 400);
		add(label); // Ryan 
		}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}