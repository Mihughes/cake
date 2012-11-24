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
		ballObject.setPosition(400.0, 300.0);
		Bullet bulletObject = new Bullet();
		bulletObject.setPosition(405, 305);
		Cake cakeObject = new Cake();
		
		assertTrue(bulletObject.intersect(ballObject));
		
		ballObject.setPosition(0.0, 0.0);
		
		assertTrue(cakeObject.intersect(ballObject));
	}
	
	@Test
	public void pathTest() {
		Bullet bulletObject = new Bullet();
		Ball ballObject = new Ball();
	
		//Test ball Path
		ballObject.setSlope(45.0);
		assertTrue(255.102 == ballObject.calculateXPosition(7.215));
		assertTrue(63.776 == ballObject.calculateYPosition(3.608));	
		
		//Test bullet Path
		bulletObject.setInitialAngle(45.0);
		assertTrue(255.102 == bulletObject.calculateXPosition(7.215));
		assertTrue(63.776 == bulletObject.calculateYPosition(3.608));	
		
		
	}
	
	@Test
	// Test whether cake is in Panick mode
	public void cakePanickTest() {
		Ball ballObject = new Ball();
		Cake cakeObject = new Cake();
		
		ballObject.setPosition(400.0, 300.0);
		assertTrue(cakeObject.inPanick());
		
		ballObject.setPosition(400.0, 300.0);
		assertTrue(cakeObject.inPanick());
		
		
	}
}
