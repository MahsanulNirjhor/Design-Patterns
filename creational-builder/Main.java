
public class Main{
    public static void main(String [] args){
        System.out.println("Hello World!!");

        CarBuilder builder = new CarBuilder();
        builder.id(2122)
               .brand("Bugatti")
               .model("Chiron")
               .color("Blue");
        Car car = builder.build();
        System.out.println(car);
    }
}