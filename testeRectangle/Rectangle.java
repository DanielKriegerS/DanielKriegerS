package testeRectangle;

public class Rectangle {

    public double width;
    public double height;
    public double area;

    public double perimeter;

    public double diagonal;

    public double area (){
        return this.area = (width*height);
    }

    public double perimeter (){
        return this.perimeter = ((width*2)+(height*2));
    }

    public double diagonal (){
        return this.diagonal = Math.sqrt(Math.pow(height, 2)+(Math.pow(width, 2)));
    }

    public String toString(){
        return  "Area: "+ area +
                "Perimetro: " + perimeter +
                "Diagonal: " + String.format("%.2f", diagonal);
    }
}
