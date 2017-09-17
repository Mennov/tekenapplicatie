/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teken_applicatie;

import java.io.File;

/**
 *
 * @author Menno
 */
public class Image extends DrawingItem{
    private String file;

    public Image(Color color, String file, Point anchor, Double width, Double height) {
        super(color, anchor, width, height);
        this.file = file;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Point getAnchor() {
        return anchor;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "Image: breedte: " + this.width.toString() + ". Ankerpunt: " + this.anchor.toString() + ". Kleur: " + this.color.toString();
    }

    public void paintUsing(IPaintable paintable) {
        paintable.paint(this);
    }
}

