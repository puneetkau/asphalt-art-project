import org.code.neighborhood.*;

  /*
   * creates class and inherits everything from MuralPainter + other files by extension
   */
public class CreeperPainter extends MuralPainter {

  /*
   * all the methods come together to make the mural here
   */
    public void paintCreeper(){
    drawEyes();
    drawMouth();
    touches();
  }

   /*
   * this uses an if statement that checks to see if a painter is standing on a green square
   * if it returns true, it moves twice and paints a dark green square.
   */
  public void paintDetails() {
    String currentPaintColor = getColor();
    if (currentPaintColor == "green") {
      move();
      move();
      paintLine("darkGreen", 1);
      } 
  }
   /*
   * this is the same as the previous method except it paints a line 2 squares long.
   */
   public void paintDetails2() {
    String currentPaintColor = getColor();
    if (currentPaintColor == "green") {
      move();
      move();
      paintLine("darkGreen", 2);
      } 
  }
  
  /*
   * this makes a painter move down one line using turnLeft and switch directions (a 180).
   */
public void newLineLeft() {
  turnLeft();
    move();
    turnLeft();
    move();
}

   /*
   * this makes a painter move down one line using turnRight and switch directions (a 180).
   */
  public void newLineRight() {
  turnRight();
    move();
    turnRight();
    move();
}
  
 /*
   * draws the creepers eyes (2 4x4 squares)
   */
  public void drawEyes() {
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    paintLine("Black", 3);
    newLineRight();
    paintLine("Black", 3);
    newLineLeft();
    paintLine("Black", 3);

    move();
    move();
    paintLine("Black", 3);
    newLineLeft();
    paintLine("Black", 3);
    newLineRight();
    paintLine("Black", 3);
  }

   /*
   * draws the creepers mouth
   */
  public void drawMouth() {
     /*
   * 1st moves to get into place and the 2x1 line between eyes
   */
    turnRight();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    paintLine("Black", 2);
     /*
   * the rest
   */
    turnLeft();
    move();
    turnLeft();
    paintLine("Black", 4);
    turnRight();
    paintLine("Black", 4);
    turnRight();
    move();
    turnRight();
    paintLine("Black", 3);
    turnLeft();
    move();
    move();
    move();
    move();
    turnLeft();
    paintLine("Black", 4);
    turnLeft();
    move();
    turnLeft();
    paintLine("Black", 3);
    turnRight();
    turnRight();
    move();
    turnLeft();
    paintLine("Black", 3);
    newLineRight();
    paintLine("Black", 3);
  }
  
 /*
   * this method uses the paintDetails and paintDetails 2 from earlier 
   * it's spread out randomly to add more variation to the creeper.
   */
  public void touches() {
    move();
    turnRight();
    paintDetails();
    turnLeft();
    paintDetails();
    turnRight();
    move();
    paintDetails2();
    turnRight();
    move();
    turnRight();
    paintDetails();
    move();
    move();
    move();
    paintDetails();
    turnLeft();
    moveFast();
    turnLeft();
    paintDetails2();
    turnLeft();
    move();
    turnLeft();
    paintDetails();
    turnRight();
    turnRight();
    moveFast();
    turnLeft();
    paintDetails2();
    turnLeft();
    paintDetails();
    turnLeft();
    move();
    paintDetails();
    turnLeft();
    turnLeft();
    moveFast();
    turnRight();
    move();
    move();
    turnRight();
    move();
    paintDetails2();
  }
}