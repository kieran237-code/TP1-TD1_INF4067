public class Rectangle extends Shape{

    Rectangle(Color color){
        super(color);
    }

    public void colorIt(){
        System.out.println("Le rectangle est rempli avec");
        color.fillColor();
    }
}
