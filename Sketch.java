import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  // Variables
  PImage imgBackground;
  PImage imgLilbaby;
  PImage imgCircle;
  
  float fltBabyX = 150;
  float fltBabyY = 380;
  float fltBabySpeedX = 5;
  float fltBabySpeedY = 2;
  float fltCircleX = 200;
  float fltCircleY = 450;
  float fltCircleSpeedX = 8;
  float fltCircleSpeedY = 1;
  float fltRotation = 1;
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);

    // Load images
    imgBackground = loadImage("background.PNG");
    imgBackground.resize(width, height);
    
    imgLilbaby = loadImage("lebaby.PNG");
    imgCircle = loadImage("emoji.PNG");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // Background
    image(imgBackground, 0, 0);

    // Draw image
	  
	  
  }
  
  // define other methods down here.
}