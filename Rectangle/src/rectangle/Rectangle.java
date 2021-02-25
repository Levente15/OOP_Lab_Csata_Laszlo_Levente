package rectangle;

public class Rectangle {
      // attribute, data - tulajdonsag
      // egysegbezaras - encapsulation
      private double length;
      private double width;
      public String rectangleName; //egysegbezaras nincs betartva

    //Methods, behaviour - viselkedes

    //Constructor - inicializalas, lefoglalas
    //default constructor
     public Rectangle(){

     }
    public Rectangle(double width, double length){
            this.length=length;
            this.width=width;
    }
    public Rectangle(double width){
        this.length=0;
        this.width=width;
    }
    //Getters
    public double getWidth(){
         return  this.width;
    }
    public double getLength(){
        return  this.length;
    }
    //Setters
    public void setWidth(double width){
         this.width=width;
    }
    @Override
    public String toString(){
         //felepithetjuk a kimenetet
        //rRectangle: hossz X szelesseg
         return "Rectangle "+this.width+" X "+this.length;
    }


}
