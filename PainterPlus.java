import org.code.neighborhood.*;

public class PainterPlus extends Painter {

public void turnRight() {
  turnLeft();
  turnLeft();
  turnLeft();
}

  public void takeAllPaint() {
  while(isOnBucket())
    takePaint();
  }

  public void moveFast() {
  while(canMove())
    move();
  }

  public void paintToEmpty(String color) {
  while(hasPaint()){
    paint(color);
    move();
  }
  }

   public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
}
