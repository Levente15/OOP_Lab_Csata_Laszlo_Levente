package person;

public class Person {
    private String name;
    private int weight;
    private float height;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double calculateBmi(){
        return weight/(height*height);
    }
    public String bodyshape(){
        if(calculateBmi()<18.5)
            return "thin";
        if(calculateBmi()>25)
            return "fat";
        else
            return "normal";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +" tti= "+calculateBmi()
                +"->"+bodyshape()+
                '}';
    }
}
