package cartoon;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/*
This is the Jeep class which creates the main composite shape. It also has various methods responsible
for setting and getting the Jeep's location. It is contained within the Cartoon class.
 */

public class Jeep {

    private Rectangle body;
    private Rectangle top;
    private Rectangle window;
    private Circle wheelOne;
    private Circle wheelTwo;


    public Jeep(Pane myPane){
        this.body = new Rectangle(Constants.BODY_XLOC, Constants.BODY_YLOC, Constants.BODY_WIDTH, Constants.BODY_HEIGHT);
        this.body.setFill(Constants.BODY_COLOR);

        this.top = new Rectangle(Constants.TOP_XLOC, Constants.TOP_YLOC, Constants.TOP_WIDTH, Constants.TOP_HEIGHT);
        this.top.setFill(Constants.TOP_COLOR);

        this.window = new Rectangle(Constants.WINDOW_XLOC, Constants.WINDOW_YLOC, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        this.window.setFill(Constants.WINDOW_COLOR);

        this.wheelOne = new Circle(Constants.WHEELONE_XLOC, Constants.WHEEL_YLOC, Constants.WHEEL_RADIUS, Constants.WHEEL_COLOR);
        this.wheelTwo = new Circle(Constants.WHEELTWO_XLOC, Constants.WHEEL_YLOC, Constants.WHEEL_RADIUS, Constants.WHEEL_COLOR);

        this.setXLoc(Constants.BODY_XLOC);
        myPane.getChildren().addAll(this.body, this.top, this.window, this.wheelOne, this.wheelTwo);
    }

    /*
    This method moves the Jeep forward in increments of 5. It is called within the setUpTimeline() method
    in the Cartoon class.
     */

    public void goForward(){
        if(this.getXLoc() == Constants.SCENE_WIDTH){
            this.setXLoc(Constants.BODY_XLOC);
        }else{
            this.setXLoc(this.getXLoc() + 5);
        }
    }

    /*
    This method brings the Jeep back to its original location.
     */

    public void restart(){
        this.setXLoc(Constants.BODY_XLOC);
    }

    /*
    This method sets the X location of all the shapes that make up the Jeep, so that the Jeep can be
    moved to different locations across the screen.
     */

    public void setXLoc(double x){
        this.body.setX(x);
        this.top.setX(x);
        this.window.setX(x + Constants.WINDOW_OFFSET);
        this.wheelOne.setCenterX(x + Constants.WHEELONE_OFFSET);
        this.wheelTwo.setCenterX(x + Constants.WHEELTWO_OFFSET);
    }

    /*
    This method returns the X location of the Jeep so that it can be used in the
    PaneOrganizer to update the locationLabel based off the Jeep's location.
     */

    public double getXLoc(){
        return this.body.getX();
    }

}
