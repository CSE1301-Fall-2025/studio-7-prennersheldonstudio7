//A rectangle has a length and a width. A rectangle should be able
// to provide its area and perimeter. 
//A rectangle can indicate whether it is smaller than 
//another rectangle in terms of area. A rectangle can 
//indicate whether it is in fact a square. 
//(This is mainly about the concepts needed to represent a rectangle,
// but the StdDraw library is included in your repository. 
//You can also provide a rectangle the ability to draw itself on the screen)
public class Rectangle{
    private double length;
    private double width;

    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    public double rectangleArea(){
        double area = this.length * this.width;
        return area;
    } 
    public double rectanglePerimeter (){
        double perimeter = (this.length * 2) + (this.width * 2);
        System.out.println("My perimeter is: " + perimeter);
        return perimeter;
    }
    public boolean rectangleAreaSmaller(Rectangle r2){
        double otherArea = r2.rectangleArea();
        double area = this.rectangleArea();
        if (area > otherArea){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isSquare(double length, double width){
        if(length == width){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4,5);
        System.out.println("My area is: " + r1.rectangleArea());
        Rectangle r2 = new Rectangle(2,3);
        System.out.println("Rectangle 1 is larger than rectangle 2: " + r1.rectangleAreaSmaller(r2));
    }
}

