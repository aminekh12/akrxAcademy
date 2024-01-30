package day7.challenge3;

public class DrawingMain {
    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();

        // Adding shapes to the drawing board
        drawingBoard.addToList(new Triangle());
        drawingBoard.addToList(new Square());

        // Drawing and displaying types
        drawingBoard.drawShapes();
        drawingBoard.displayTypes();
    }
}
