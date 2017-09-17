package teken_applicatie;

import java.util.Comparator;

public class DrawingItemsComparator implements Comparator<DrawingItem> {

    @Override
    public int compare(DrawingItem drawingItem1, DrawingItem drawingItem2) {
        Point pointA = drawingItem1.getAnchor();
        Point pointB = drawingItem2.getAnchor();

        double pointC = (pointA.getX() * pointA.getX()) + (pointA.getY() * pointA.getY());
        double pointD = (pointB.getX() * pointB.getX()) + (pointB.getY() * pointB.getY());

        if(pointC > pointD)
            return 1;
        else if(pointC < pointD)
            return -1;
        else return 0; //(pointC == pointD)
    }
}
