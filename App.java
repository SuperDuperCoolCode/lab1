package lab1;

import cs15.labs.cupcakeSupport.CupcakeFrame;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This is the second lab, where you are going to decorate a cupcake!
 */
public class App extends Application {

  @Override
  public void start(Stage stage) {
    // This sets up the empty GUI (Graphical User Interface) frame!
    new CupcakeFrame(stage);

    //TODO Instantiate the CupcakeShop here
  }

  /*
   * This is the main method. Don't worry about it, as it just makes an
   * instance of the App class.
   *
   * DO NOT CHANGE THIS CODE.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
 17  
Baker.java
@@ -0,0 +1,17 @@
package lab1;

//TODO Import CS15Cupcake

/**
 * This class represents our Baker, who will bake cupcakes on command!
 */
public class Baker {

  public Baker() {
  }

  //TODO Edit the return type to match the JavaDocs
  public void bakeCupcake() {
    //TODO Instantiate and return a new CS15Cupcake
  }
}
 16  
CupcakeShop.java
@@ -0,0 +1,16 @@
package lab1;

/**
 * This is our top-level class that represents a CupcakeShop!
 */
public class CupcakeShop {

    public CupcakeShop() {
        // Instantiates an instance of our baker as a local variable
        Baker baker = new Baker();

        //TODO Tell the baker to bake a cupcake

        //TODO Have the decorator and froster do their jobs here
    }
}
 39  
Decorator.java
@@ -0,0 +1,39 @@
package lab1;

// We've already added some imports for you here!
import cs15.labs.cupcakeSupport.CS15Cupcake;
import cs15.labs.cupcakeSupport.CS15Sprinkle;
import cs15.labs.cupcakeSupport.CupcakeDecoratorSupport;

/**
 * Don't worry about the 'extends' stuff - that just makes the click interaction
 * work! Pretend like it says 'public class CupcakeDecorator'.
 */
public class Decorator extends CupcakeDecoratorSupport {

  // This declares our instance variable _cupcake.
  private CS15Cupcake _cupcake;

  /**
   * The constructor for CupcakeDecorator, which accepts a CS15Cupcake as a
   * parameter to set up *association*.
   */
  public Decorator(CS15Cupcake cupcake) {
    super();
    // Ignore (but DO NOT CHANGE) the line above!

    // This initializes our instance variable _cupcake.
    _cupcake = cupcake;
  }

  /**
   * You will NEVER need to call this method on your own. It will be called
   * anytime you click on the cupcake once this class is instantiated in App.java!
   */
  @Override
  public void addSprinkle(CS15Sprinkle sprinkle) {
    //TODO Add the sprinkle to the cupcake
  }

  //TODO Make a method to add a cherry below!
}
