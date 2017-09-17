/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teken_applicatie;

import java.util.ArrayList;

/**
 *
 * @author Menno
 */
public class Drawing {

    private String name;
    public ArrayList<DrawingItem> drawingItems;

    public Drawing(String name) {
        this.name = name;
        drawingItems = new ArrayList<DrawingItem>();
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public ArrayList<DrawingItem> getDrawingItems() {
        return drawingItems;
    }

    public void addDrawingItems(DrawingItem drawingItems) {
        this.drawingItems.add(drawingItems);
    }

    public void paintUsing(IPaintable paintable) {
        for (DrawingItem drawing : this.drawingItems) {
            drawing.paintUsing(paintable);
        }
    }
}
