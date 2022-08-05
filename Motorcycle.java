package august4;

public class Motorcycle {

    String brand;
    String color;
    int year;
    String condition;
    String owner;
    public Motorcycle(String brand, String color, int year, String condition, String owner) {
        this.brand = brand;
        this.color=color;
        this.year=year;
        this.condition= condition;
        this.owner=owner;

    }
    public Motorcycle(String brand, int year){
        this.brand=brand;
        this.color="random color";
        this.year=year;
        this.condition=condition;
        this.owner=owner;
    }

    @Override
    public String toString(){
        String returnValue = "";
        returnValue += "Motorcycle brand is " + this.brand;
        returnValue += "Motorcycle is "+ this.color;
        returnValue += "Motorcycle year is " + this.year;
        returnValue += "Condtion is"+ this.condition;
        returnValue += "Owner "+ this.owner;
        return returnValue;

    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Motorcycle)) return false;
        Motorcycle other= (Motorcycle)obj;
        if(!this.color.equals(other.color)) return false;
        if(this.brand.equals(other.brand)) return false;
        if(this.year >2020) return true;
        return true;
    }
}
