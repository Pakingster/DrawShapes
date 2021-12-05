/*
Maman 11 - Question 2 - "Draw 10 random shapes on canvas"
Student: Alexey Vartanov
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class DrawShapesController {

    @FXML
    private Canvas canvas;

    @FXML
    void drawButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        for (int i = 0; i < 10; i++) {
            drawRandomShapeOnCanvas(gc);
        }
    }

    /**
     * Draw one random shape on Canvas
     * Line, Rectangle, Oval with random size parameters
     * @param gc: canvas graphic context
     */
    private void drawRandomShapeOnCanvas(GraphicsContext gc) {
        Random rand = new Random();
        String[] shapes = {"Rectangle", "Oval", "Line"};
        //loop
        //set size
        int x = rand.nextInt((int) canvas.getWidth());
        int y = rand.nextInt((int) canvas.getHeight());
        int w = rand.nextInt(((int) canvas.getWidth() / 4));
        int h = rand.nextInt(((int) canvas.getWidth() / 4));
        //set color
        gc.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
        //draw shape
        switch (shapes[rand.nextInt(3)]) {
            case "Line":
                gc.strokeLine(x, y, w, h);
                break;
            case "Oval":
                gc.fillRect(x, y, w, h);
                break;
            case "Rectangle":
                gc.fillOval(x, y, w, h);
                break;
        }
    }
}