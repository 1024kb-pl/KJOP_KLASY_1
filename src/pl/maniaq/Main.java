package pl.maniaq;

public class Main {

    public static void main(String[] args) {
	    Dog reks = new Dog("Reks", "Jamnik", 3);
        Dog tofik = new Dog("Tofik", "Kundel", 5);

        Human pablo = new Human("Pablo", "Escabo", 25, 185, 87.3f);
        Human johny = new Human("Johny", "Bravo", 35, 188, 92.3f);

        Engine electricEngine = new Engine("Elektryczny");

        Car tesla = new Car("Tesla", "Czarny", electricEngine);
        Car bmw = new Car("BMW", "Biały", new Engine("spalinowy"));

        System.out.println("Samochód: " + tesla.brand + " jeździ na silniku: " + tesla.engine.engineType);
        System.out.println("Samochód: " + bmw.brand + " jeździ na silniku: " + bmw.engine.engineType);
    }
}
