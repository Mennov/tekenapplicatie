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
public class Polygon extends DrawingItem {

    private Point[] vertices;
    private Double weight;

    private double xPoints[];
    private double yPoints[];
    private int npoints = 5;

    public Polygon(Color color, Point[] vertices, Point anchor, Double width, Double height, Double weight) {
        super(color, anchor, width, height);
        this.vertices = vertices;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public Polygon(Color color, double xPoints[], double yPoints[], int npoints, Point anchor, Double width, Double height, Double weight) {
        super(color, anchor, width, height);
        this.xPoints = xPoints;
        this.yPoints = yPoints;
        this.npoints = npoints;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Point[] getVertices() {
        return vertices;
    }

    public Point getAnchor()
    {
        return null;
    }

    public Double getWidth()
    {
        return 0.0;
    }

    public Double getHeight()
    {
        return 0.0;
    }

    /**
     *
     *
     */
    public double[] getxPoints() {
        return xPoints;
    }

    public void setxPoints(double[] xPoints) {
        this.xPoints = xPoints;
    }

    public double[] getyPoints() {
        return yPoints;
    }

    public void setyPoints(double[] yPoints) {
        this.yPoints = yPoints;
    }

    public int getNpoints() {
        return npoints;
    }

    public void setNpoints(int npoints) {
        this.npoints = npoints;
    }

    /**
     *
     *
     */


    @Override
    public String toString(){
        return "Driehoek: Breedte: " + this.width.toString() + ". Ankerpunt: " + this.anchor.toString() + ". Kleur: " + this.color.toString();
    }

    @Override
    public void paintUsing(IPaintable paintable) {
        paintable.paint(this);
    }
}
