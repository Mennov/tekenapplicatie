/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teken_applicatie;

/**
 *
 * @author Menno
 */
public abstract class DrawingItem extends DrawingItemsComparator {

    public Color color;
    public Point anchor;
    public Double width;
    public Double height;

    public DrawingItem(Color color, Point anchor, Double width, Double height) {
        this.color = color;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    public DrawingItem(Color color, Point anchor, Double width, Double height, DrawingItem previousState) {
        this.color = color;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        DrawingItem previousState1 = previousState;
    }

    public DrawingItem(Color color) {
        this.color = color;
    }

    public Color getColor()
    { return color; }

    public void setColor(Color value)
    { color = value; }

    public abstract Point getAnchor();

    public abstract Double getWidth();

    public abstract Double getHeight();

    public abstract void paintUsing(IPaintable paintable);
}
