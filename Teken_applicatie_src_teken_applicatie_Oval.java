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
public class Oval extends DrawingItem {

        private Double weight;

        public Oval(Color color, Point anchor, Double width, Double height, Double weight) {
            super(color, anchor, width, height);
            this.anchor = anchor;
            this.width = width;
            this.height = height;
            this.weight = weight;
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

        public Double getWeight() {
            return weight;
        }

        public void setWeight(Double weight) {
            this.weight = weight;
        }
        
        @Override
        public String toString(){
            return "Ovaal: breedte: " + this.width.toString() + ". Ankerpunt: " + this.anchor.toString() + ". Kleur: " + this.color.toString();
        }

    @Override
    public void paintUsing(IPaintable paintable) {
        paintable.paint(this);
    }

    }