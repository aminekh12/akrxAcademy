package day7.challenge3;

import java.util.ArrayList;
import java.util.List;

public class DrawingBoard {
    List<Drawable> shapes = new ArrayList<>();

    public DrawingBoard() {
    }

    public DrawingBoard(List<Drawable> shapes) {
        this.shapes = shapes;
    }

    public void addToList(Shape shape){
        shapes.add(shape);
    }
    public void drawShapes(){
        for(Drawable shape:shapes){
            shape.drawShape();
        }
    }
    public void displayTypes(){
        for(Drawable shape:shapes){
            if (shape instanceof Shape) {
                ((Shape) shape).displayType();
            }
        }
    }

}
