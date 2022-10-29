package cartoon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.scene.input.KeyEvent;

/*
This the Cartoon class. It is contained in and associated with PaneOrganizer. It instantiates the classes
Jeep and Road. It also creates a Timeline which causes the Jeep to move across the screen and updates
a label based on the Jeep's position.
 */

public class Cartoon {

    private Jeep jeep;
    private Road road;
    private PaneOrganizer organizer;

    public Cartoon(PaneOrganizer myOrganizer){
        this.organizer = myOrganizer;

        Pane cartoonPane = new Pane();

        this.road = new Road(cartoonPane);
        this.jeep = new Jeep(cartoonPane);

        this.organizer.getRoot().setCenter(cartoonPane);
        cartoonPane.setFocusTraversable(true);
        cartoonPane.setOnKeyPressed((KeyEvent e) -> this.onKeyPressed(e));

        this.setUpTimeline();
    }

    /*
    This method creates the two KeyFrames that make the Jeep go forward and update the locationLabel based off
    the Jeep's position. It adds these KeyFrames to a new Timeline.
     */

    public void setUpTimeline(){
        KeyFrame keyframe = new KeyFrame(Duration.seconds(Constants.DURATION), (ActionEvent e) -> this.jeep.goForward());
        KeyFrame labelKF = new KeyFrame(Duration.seconds(Constants.DURATION), (ActionEvent e) -> this.organizer.updateLabel());
        Timeline timeline = new Timeline(keyframe, labelKF);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    /*
    This method is called within the constructor to tell the program to bring the Jeep back to its
    original position when R is pressed and to change the colors of the buildings when C is pressed.
     */

    private void onKeyPressed(KeyEvent e){
        KeyCode keyPressed = e.getCode();
        switch (keyPressed){
            case R:
                this.jeep.restart();
                break;
            case C:
                this.road.changeColor();
                break;
            default:
                break;
        }
        e.consume();
    }

    /*
    This method returns the instance variable of Jeep so that it can be used in the PaneOrganizer
    class when updating the label based on the Jeep's position.
     */

    public Jeep getJeep(){
        return this.jeep;
    }

}