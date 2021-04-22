
public interface GUIListener {
  /**
   * draws this interactive object to the display window
   */
  public void draw();

  /**
   * called each time the mouse is Pressed
   */
  public void mousePressed();

  /**
   * called each time the mouse is Pressed
   */
  public void mouseReleased();

  /**
   * checks whether the mouse is over this GUI listener
   *
   * @return true if the mouse is over this interactive object, false otherwise
   */
  public boolean isMouseOver();

}
