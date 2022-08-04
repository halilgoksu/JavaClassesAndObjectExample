package ClassesAndObjects;

public class CarObjectExample {
    public static void main(String[] args) {
        Car car1= new Car(":Honda, ", ":blue, ",2022," Good, "," Sam ");
        Car car2 = new Car(":Toyota,",":blue, ",2018," Used "," Ali ");
        Car car3 = new Car(":Mercedes, ",":Black, ",2015," Bad, "," Halil ");
        Car car4= new Car(":Ford, ",":yellow, ",2001," Good, "," Olivia ");
        Car car5= new Car(":AlfaRomeo, ",":white, ",2025," Good, "," Kiana ");

        String carString=car1.toString();
        System.out.println(carString);
        System.out.println(car2.toString());
        System.out.println(car5.toString());
        System.out.println("Ford to AlfaRomeo "+car4.equals((car5)));
        System.out.println("Mecedes to Toyota "+car3.equals((car2)));

    }
}
