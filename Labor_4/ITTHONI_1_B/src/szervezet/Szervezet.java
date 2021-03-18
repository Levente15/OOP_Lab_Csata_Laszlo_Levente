package szervezet;

public class Szervezet {
    private String name;
    private boolean profit;
    private double ado;

    public Szervezet(String name,boolean profit,double ado){
        this.name=name;
        this.profit=profit;
        this.ado=ado;
    }

    public double getAdo() {
        return ado;
    }

    public void setAdo(double ado) {
        this.ado = ado;
    }

    public String getName() {
        return name;
    }

    public boolean isProfit() {
        return profit;
    }
    public double adoszamol(double ado,boolean profit){
        if(profit==false)
        return (ado*2)/100;

        return (ado*10)/100;
    }
     public void megjelnit(){
         System.out.print(name);
         System.out.print(" szervezet ");
         System.out.print(profit);
         System.out.print(" ");
         System.out.print(adoszamol(ado,profit));
         System.out.print(" lej adoja van\n");
     }
}

