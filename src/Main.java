public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Car mercedes = new Car("Mercees", 200000);
        cars[0]=mercedes;
        Car ford = new Car("Ford",44000);
        cars[1] = ford;
        Car bmw = new Car("Bmw",555000);
        cars[2] = bmw;

        for (Car car:cars) {
            System.out.println("brand: "+car.brand+" price: "+car.price);
        }
    }
}
