package teken_applicatie;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class JavaFXPaintable implements IPaintable {

    private GraphicsContext graphicsContext;

    public JavaFXPaintable(GraphicsContext graphicsContext) {

        this.graphicsContext = graphicsContext;
    }

    public void paint(Oval oval) {
        this.graphicsContext.setStroke(Color.BLUE);
        this.graphicsContext.strokeOval(oval.anchor.getX(), oval.anchor.getY(), oval.getWidth(), oval.getHeight());
    }

    public void paint(Polygon polygon) {
        this.graphicsContext.setStroke(Color.RED);
        this.graphicsContext.strokePolygon(polygon.getxPoints(), polygon.getyPoints(), polygon.getNpoints());
    }

    public void paint(PaintedText text) {
        this.graphicsContext.setStroke(Color.BLACK);
        this.graphicsContext.strokeText(text.getContent(), text.anchor.getX(), text.anchor.getY());
    }

    public void paint(Image image) {
        javafx.scene.image.Image imageFX = new javafx.scene.image.Image(image.getFile());
        this.graphicsContext.drawImage(imageFX, image.anchor.getX(), image.anchor.getY(), image.getWidth(), image.getHeight());
    }
}
