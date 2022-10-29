package cartoon;

import javafx.scene.layout.*;

/*
This is the top-level class that is instantiated in the App class. It creates the root pane which
all the other panes are added to. It instantiates the Cartoon and LabelsAndButton classes.
 */

public class PaneOrganizer {

    private BorderPane root;
    private LabelsAndButton LB;
    private Cartoon cartoon;

    public PaneOrganizer(){
        this.root = new BorderPane();
        this.root.setStyle("-fx-background-color: lightskyblue");

        this.cartoon = new Cartoon(this);

        HBox LBPane = new HBox();
        this.LB = new LabelsAndButton(LBPane);
        this.root.setTop(LBPane);
    }

    /*
    This method updates the label based off the X location of the Jeep. It is used in setUpTimeline()
    so that it is called frequently to check the position of the Jeep and appropriately update
    the label. It uses an if-else statement to choose the correct text based on the Jeep's location.
     */

    public void updateLabel(){
        double XLoc = this.cartoon.getJeep().getXLoc();
        if (XLoc <= 200){
            this.LB.getLocationLabel().setText("Maryland!");
        } else if (XLoc <= 300){
            this.LB.getLocationLabel().setText("Delaware!");
        } else if (XLoc <= 400){
            this.LB.getLocationLabel().setText("Pennsylvania!");
        } else if (XLoc <= 500){
            this.LB.getLocationLabel().setText("New Jersey!");
        } else if (XLoc <= 600){
            this.LB.getLocationLabel().setText("New York!");
        } else if (XLoc <= 700){
            this.LB.getLocationLabel().setText("Connecticut!");
        } else if (XLoc<= 800){
            this.LB.getLocationLabel().setText("Rhode Island!");
        }
    }

    /*
    This method returns the root pane so that it can be used in the App class when
    instantiating the Scene.
     */

    public BorderPane getRoot(){
        return this.root;
    }

}
