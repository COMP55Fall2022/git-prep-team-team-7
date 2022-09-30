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
<<<<<<< HEAD
	//TA
	//COMP 55
	//GITHUB
=======

>>>>>>> branch 'main' of https://github.com/COMP55Fall2022/git-prep-team-team-7.git
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