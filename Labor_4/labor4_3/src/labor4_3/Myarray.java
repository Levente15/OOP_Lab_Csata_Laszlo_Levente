package labor4_3;

public class Myarray {
    private int length;
    private double[] element;

    public Myarray(int length){
        this.length= length;
        this.element=new double[length];
    }
    public Myarray(double[] element){
        this.length= length;
        this.element=new double[element.length];
        for(int i=0;i<element.length;i++){
            this.element[i]=element[i];
        }
    }
}
