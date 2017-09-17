package teken_applicatie;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;

public class DrawingTool extends Application {

    private Drawing drawing;
    private JavaFXPaintable paintable;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Teken Applicatie");
        Group root = new Group();
        Canvas canvas = new Canvas(750, 750);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        this.paintable = new JavaFXPaintable(graphicsContext);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        drawing = new Drawing("drawing");

        //Points for Polygon
        double xpoints[] = {25, 145, 25, 145, 25};
        double ypoints[] = {25, 25, 145, 145, 25};
        int npoints = 5;

        drawing.addDrawingItems(new Oval(Color.RED, new Point(200.0,1.0), 150.0, 150.0, 5.0));
        drawing.addDrawingItems(new Polygon(Color.BLUE, xpoints, ypoints, npoints, new Point(125.0,125.0), 20.0, 20.0, 1.0));
        drawing.addDrawingItems(new PaintedText(Color.GREEN, "test", "Calabria", new Point(235.0,135.0), 40.0, 40.0));
        drawing.addDrawingItems(new Image(Color.WHITE, "https://s14-eu5.ixquick.com/cgi-bin/serveimage?url=https:%2F%2Fmatsvanzanten.files.wordpress.com%2F2012%2F12%2Fperez_alhambra_luthier_flamenco_spaanse_gitaar_angled1.jpg&sp=7d9d0b01ef696749c4dd59fe0387f091", new Point(56.0,278.0), 75.0, 75.0));

        ArrayList<DrawingItem> drawingItems = drawing.getDrawingItems();

//        drawingItems.sort(new DrawingItemsComparator());

        for(DrawingItem di : drawingItems) System.out.println(di.toString());

        this.draw();

    }

    private void draw() {
        drawing.paintUsing(paintable);
    }
}
