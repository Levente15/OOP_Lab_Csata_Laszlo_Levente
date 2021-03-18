package product;

public class Bread extends Products{
   private double mennyiseg;

    public Bread(String nev, int ar,int afakulcs, double mennyiseg){
        super(nev,ar,afakulcs);
        this.mennyiseg=mennyiseg;
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(double mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getegysegar(){
        return (int)(getbruttoar()/mennyiseg);
    }

    @Override
    public String toString() {
        return "Bread{" +super.toString()+" ar "+
                getbruttoar()+
                '}';
    }
}
