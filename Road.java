package cartoon;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/*
This is the Road class that creates the road and buildings. It also contains the method that changes
the color of the buildings. It is contained within the Cartoon class.
 */

public class Road {

    private Rectangle road;
    private Rectangle yellowLineOne;
    private Rectangle yellowLineTwo;
    private Rectangle buildingOne;
    private Rectangle buildingTwo;
    private Rectangle buildingThree;
    private Rectangle buildingFour;

    public Road(Pane myPane){
        this.road = new Rectangle(Constants.ROAD_XLOC, Constants.ROAD_YLOC, Constants.ROAD_WIDTH, Constants.ROAD_HEIGHT);
        this.road.setFill(Constants.ROAD_COLOR);

        this.yellowLineOne = new Rectangle(Constants.YELLOW_LINE_ONE_XLOC, Constants.YELLOW_LINE_YLOC, Constants.YELLOW_LINE_WIDTH, Constants.YELLOW_LINE_HEIGHT);
        this.yellowLineOne.setFill(Constants.YELLOW_LINE_COLOR);

        this.yellowLineTwo = new Rectangle(Constants.YELLOW_LINE_TWO_XLOC, Constants.YELLOW_LINE_YLOC, Constants.YELLOW_LINE_WIDTH, Constants.YELLOW_LINE_HEIGHT);
        this.yellowLineTwo.setFill(Constants.YELLOW_LINE_COLOR);

        this.buildingOne = new Rectangle(Constants.BUILDING_ONE_XLOC, Constants.BUILDING_ONE_YLOC, Constants.BUILDING_ONE_WIDTH, Constants.BUILDING_ONE_HEIGHT);
        this.buildingOne.setFill(Constants.BUILDING_ONE_COLOR);

        this.buildingTwo = new Rectangle(Constants.BUILDING_TWO_XLOC, Constants.BUILDING_TWO_YLOC, Constants.BUILDING_TWO_WIDTH, Constants.BUILDING_TWO_HEIGHT);
        this.buildingTwo.setFill(Constants.BUILDING_TWO_COLOR);

        this.buildingThree = new Rectangle(Constants.BUILDING_THREE_XLOC, Constants.BUILDING_THREE_YLOC, Constants.BUILDING_THREE_WIDTH, Constants.BUILDING_THREE_HEIGHT);
        this.buildingThree.setFill(Constants.BUILDING_THREE_COLOR);

        this.buildingFour = new Rectangle(Constants.BUILDING_FOUR_XLOC, Constants.BUILDING_FOUR_YLOC, Constants.BUILDING_FOUR_WIDTH, Constants.BUILDING_FOUR_HEIGHT);
        this.buildingFour.setFill(Constants.BUILDING_FOUR_COLOR);

        myPane.getChildren().addAll(this.road, this.yellowLineOne, this.yellowLineTwo, this.buildingOne, this.buildingTwo, this.buildingThree, this.buildingFour);
    }

    /*
    This method changes the color of the four background buildings. It uses an if-else statement
    to check what the current color of the buildings is and then change it to the other set of colors.
     */

    public void changeColor(){
        if (this.buildingOne.getFill() == Constants.BUILDING_ONE_COLOR){
            this.buildingOne.setFill(Constants.BUILDING_ONE_NEW_COLOR);
            this.buildingTwo.setFill(Constants.BUILDING_TWO_NEW_COLOR);
            this.buildingThree.setFill(Constants.BUILDING_THREE_NEW_COLOR);
            this.buildingFour.setFill(Constants.BUILDING_FOUR_NEW_COLOR);
        } else{
            this.buildingOne.setFill(Constants.BUILDING_ONE_COLOR);
            this.buildingTwo.setFill(Constants.BUILDING_TWO_COLOR);
            this.buildingThree.setFill(Constants.BUILDING_THREE_COLOR);
            this.buildingFour.setFill(Constants.BUILDING_FOUR_COLOR);
        }
    }


}
