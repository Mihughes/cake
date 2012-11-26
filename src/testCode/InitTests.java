package testCode;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import mainCode.Ball;
import mainCode.Bullet;
import mainCode.Cake;
import mainCode.Canon;
import mainCode.ControlPanel;
import mainCode.SaveTheCake;

public class InitTests {
	private static SaveTheCake cake;
	private static final double GRAVITY_CONSTANT = 9.8;
	private static final double VELOCITY = 50;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cake = new SaveTheCake();
	}

	//Test collisions
	@Test
	public void collisionTest() {
		Ball ballObject = new Ball();
		ballObject.setPosition(400, 300);
		Bullet bulletObject = new Bullet();
		bulletObject.setPosition(405, 305);
		Cake cakeObject = new Cake();
		
		assertTrue(bulletObject.intersect(ballObject));
		
		ballObject.setPosition(455, 450);
		
		assertTrue(cakeObject.intersect(ballObject));
	}
	
	 @Test
	    public void pathTest() {
	        Bullet bulletObject = new Bullet();
	        Ball ballObject = new Ball();
	    
	        //Test ball Path
	        ballObject.setSlope(45.0);
	        bulletObject.setInitialAngle(45.0);
	        double ballX = 250;
	        double ballY = 60;
	        double distanceForX = 7.215;
	        double distanceForY = 3.608;
	        ballObject.setPosition(ballX, ballY);
	        //bulletObject.setPosition(ballX,  ballY);
	        //bulletObject.setVelocity(10); //not used yet

	        assertTrue((int)255.102 == ballObject.calculateXPosition(distanceForX));
	        assertTrue((int)63.776 == ballObject.calculateYPosition(distanceForY));    
	        
	        //Test bullet Path
	        bulletObject.setInitialAngle(45);
	        assertTrue((int)255.102 == bulletObject.calculateXPosition(distanceForX));
	        assertTrue((int)63.776 == bulletObject.calculateYPosition(distanceForY));    
	        }
	
	@Test
	// Test whether cake is in Panick mode
	public void cakePanickTest() {
		Ball ballObject = new Ball();
		Cake cakeObject = new Cake();
		
		ballObject.setPosition(500, 400);
		assertTrue(cakeObject.inPanick(ballObject));
		
		ballObject.setPosition(450, 350);
		assertTrue(cakeObject.inPanick(ballObject));
		
		
	}
}
