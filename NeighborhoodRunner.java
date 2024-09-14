import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

      /*
   * new MuralPainter to add the background.
   */
    MuralPainter sam = new MuralPainter();
    sam.paintBackground("green", 12);
    
  /*
   * CreeperPainter declared + paints creeper.
   */
    CreeperPainter jacob = new CreeperPainter();
    jacob.paintCreeper();
  }
}