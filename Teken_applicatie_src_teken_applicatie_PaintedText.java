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
public class PaintedText extends DrawingItem {
    private String content;
    private String fontName;


    public PaintedText(Color color, String content, String fontName, Point anchor, Double width, Double height) {
        super(color, anchor, width, height);
        this.content = content;
        this.fontName = fontName;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
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
        return "Tekst: breedte: " + this.width.toString() + ". Ankerpunt: " + this.anchor.toString() + ". Kleur: " + this.color.toString() + " Lettertype: " + this.fontName;
    }

    @Override
    public void paintUsing(IPaintable paintable) {
        paintable.paint(this);
    }

}
