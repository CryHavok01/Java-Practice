import java.util.ArrayList;

public class Garage {
  ArrayList<Car> cars;

  public Garage(ArrayList<Car> cars) {
    this.cars = cars;
  }

  public void addCar(Car newCar) {
    this.cars.add(newCar);
    System.out.println("A " + newCar.getColor() + " car has been added to the garage.");
  }

  public void tuneAllCars() {
    for (Car car : this.cars) {
      car.tuneUp();
    }
  }

  public static void main(String[] args) {
    Car versa = new Car("white", 50000, false);
    Car subaru = new Car("Purple", 60000, true);
    Car falcon = new Car("red", 50, true);
    ArrayList<Car> cars = new ArrayList<Car>();
    cars.add(versa);
    cars.add(subaru);
    cars.add(falcon);

    Garage myGarage = new Garage(cars);
    System.out.println(myGarage.cars.get(1).getColor());

    myGarage.addCar(new Car("black", 5, false));

    myGarage.tuneAllCars();
    System.out.println(myGarage.cars.get(0).getFast());
  }
}
