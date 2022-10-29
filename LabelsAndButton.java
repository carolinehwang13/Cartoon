package cartoon;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/*
This class creates the two labels and quit button that reside in an HBox at the top of the frame.
It gives the quit button the ability to quit the program when clicked on. It is contained within
the PaneOrganizer class.
 */

public class LabelsAndButton {

    private Label locationLabel;

    public LabelsAndButton(HBox hbox){
        Button quit = new Button("quit :(");
        quit.setFont(Font.font("Serif", Constants.FONT_SIZE_SMALL));
        quit.setTextFill(Constants.QUIT_COLOR);
        quit.setOnAction((ActionEvent e) -> System.exit(0));

        Label restart = new Label("click r to restart!");
        restart.setFont(Font.font("Serif", Constants.FONT_SIZE_SMALL));
        restart.setTextFill(Constants.RESTART_COLOR);

        Label color = new Label("click c to change color!");
        color.setFont(Font.font("Serif", Constants.FONT_SIZE_SMALL));
        color.setTextFill(Constants.COLOR_COLOR);

        VBox labels = new VBox();
        labels.getChildren().addAll(restart, color);

        this.locationLabel = new Label();
        this.locationLabel.setFont(Font.font("Serif", Constants.FONT_SIZE_LARGE));

        hbox.setFocusTraversable(true);
        hbox.setSpacing(Constants.HBOX_SPACING);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(Constants.PADDING_TOP, 0, Constants.PADDDING_BOTTOM, 0));

        hbox.getChildren().addAll(quit, this.locationLabel, labels);

    }

    /*
    This method returns the locationLabel so that it can be used in the updateLabel() method in
    the Cartoon class.
     */

    public Label getLocationLabel(){
        return this.locationLabel;
    }

}
