package teken_applicatie;

public interface IPaintable {
    public void paint (Oval oval);
    public void paint (Polygon polygon);
    public void paint (PaintedText text);
    public void paint (Image image);
}
