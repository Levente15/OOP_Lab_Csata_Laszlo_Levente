package Sajat;
public class Diak {
    private String keresztnev;
    private int kor;
    private double jegy;
    private String szak;

    public Diak(String keresztnev,int kor,double jegy,String szak){
        this.keresztnev=keresztnev;
        this.kor=kor;
        this.jegy=jegy;
        this.szak=szak;
    }
    public Diak(){

    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public int getKor() {
        return kor;
    }

    public double getJegy() {
        return jegy;
    }

    public String getSzak() {
        return szak;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setJegy(double jegy) {
        this.jegy = jegy;
    }

    public void setSzak(String szak) {
        this.szak = szak;
    }
    public void setlakas(int szam){
        if(szam==1){
            System.out.println("Kintlako");
        }else if(szam==0){
            System.out.println("Bentlako");
        }else {
            System.out.println("Nem lehet ertelmezni");
        }
    }
    public  String toString(){
        return this.keresztnev+" "+this.kor+" "+this.jegy+" "+this.szak;
    }
}
