package ClassesAndObjects;

public class Car {

    String brand;
    String color;
    int year;
    String condition;
    String owner;
    public Car(String brand, String color, int year,String condition,String owner) {
        this.brand = brand;
        this.color=color;
        this.year=year;
        this.condition= condition;
        this.owner=owner;

    }
    public Car(String brand, int year){
        this.brand=brand;
        this.color="random color";
        this.year=year;
        this.condition=condition;
        this.owner=owner;
    }

    @Override
    public String toString(){
        String returnValue = "";
        returnValue += "Car brand is " + this.brand;
        returnValue += "Color is "+ this.color;
        returnValue += "Car year is " + this.year;
        returnValue += "Condtion is"+ this.condition;
        returnValue += "Owner "+ this.owner;
        return returnValue;

    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Car)) return false;
        Car other= (Car)obj;
        if(!this.color.equals(other.color)) return false;
        if(this.brand.equals(other.brand)) return false;
        if(this.year >2020) return true;
        return true;
    }
}
