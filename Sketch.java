import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  // Variables
  PImage imgBackground;
  PImage imgLilbaby;
  PImage imgCircle;
  
  float fltBabyX = 100;
  float fltBabyY = 400;
  float fltBabySpeedX = 2;
  float fltBabySpeedY = 2;
  float fltCircleX = width/3;
  float fltCircleY = height/3;
  float fltCircleSpeedX = 1;
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
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // Drawings
    image(imgBackground, 0, 0);
    
    // Draw and animate image
    image(imgLilbaby, fltBabyX, fltBabyY);
    fltRotation += (Math.PI/6);
    fltBabyX += fltBabySpeedX;
    fltBabyY += fltBabySpeedY;
    rotate(radians(fltRotation));

    // Creates a barrier
    if(fltBabyX > width - (width / 2) || fltBabyX < 0){
      fltBabySpeedX *= -1;
    }
    if(fltBabyY > height - (height / 2) || fltBabyY < 0){
      fltBabySpeedY *= -1;
    }
    
    // Draw and animate image
      fltCircleX = fltCircleSpeedX;
      fltCircleY = fltCircleSpeedY;
      pushMatrix();
      translate(fltBabyX + (200 / 2) - 10, fltBabyY + (200 / 2) + 5);
      rotate(radians(fltRotation));

      stroke(75, 90, 250);
      fill(250, 100, 20);
      ellipse(fltCircleX, fltCircleY, 75, 75);
      popMatrix();
      fltRotation += 5;

     // Barrier
     if((fltCircleX - 150) < 0 || (fltCircleX + 50) > 0){
       fltCircleSpeedX *= -1;
     }
      if((fltCircleY - 60) < 0 || (fltCircleY + 60) > 0){
       fltCircleSpeedY *= -1;
     }
   }
}