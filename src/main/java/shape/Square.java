package shape;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(String color, boolean filled, double side){
        super(color, filled,side, side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        setWidth(side);
    }

    @Override
    public void setLength(double side){
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
