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
public class Point {
    private Double x;
    private Double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
    
    @Override
    public String toString(){
        return "X:" + this.x.toString() + " Y:" + this.y.toString();
    }
}
