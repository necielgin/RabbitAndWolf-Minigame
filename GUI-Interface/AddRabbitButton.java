//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: CarrotPatch
// Course: CS 300 Fall 2020
//
// Author: Elgini Neci
// Email: neci@wisc.edu
// Lecturer: Hobbes LeGault
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons: (identify each by name and describe how they helped)
// Online Sources: (identify each by URL and describe how it helped)
//
///////////////////////////////////////////////////////////////////////////////

/**
 * This method creates the the button AddRabbit
 * 
 * @author elgini neci
 *
 */
public class AddRabbitButton extends Button {
  
  /**
   * This method class the constructor in the botton class
   * 
   * @param x x-position where this button will be added to the display window
   * @param y y-position where this button will be added to the display window
   */
  public AddRabbitButton(float x, float y) {
    super(x, y);

  }

  /**
   * This method class the constructor in the botton class
   * 
   * @param label label to be assigned to this button
   * @param x     x-position where this button will be added to the display window
   * @param y     y-position where this button will be added to the display window
   */
  public AddRabbitButton(String label, float x, float y) {
    super(label, x, y);

  }

  /**
   * This method add a new rabbit each time the button is pressed
   */
  @Override
  public void mousePressed() {
    if (isMouseOver()) {
      Button.processing.objects.add(new Rabbit());
    }
  }
}
