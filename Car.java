public class Car {
  private String color;
  private int miles;
  private boolean fast;

  public Car(String paintColor, int milesDriven, boolean isFast) {
    color = paintColor;
    miles = milesDriven;
    fast = isFast;
  }

  public void drive(int milesDriven) {
    miles += milesDriven;
    System.out.println("You have driven " + milesDriven + " miles.  Your total mileage is now " + miles + ".");
    if (miles > 53000) {
      System.out.println("It's time for a tune-up");
    } else {
      System.out.println("Keep on rolling");
    }
  }

  public String repaint(String newColor) {
    color = newColor;
    return newColor;
  }

  public void tuneUp() {
    fast = true;
    System.out.println("Vroom vroom");
  }

  public String getColor() {
    return this.color;
  }

  public boolean getFast() {
    return this.fast;
  }

  public String toString() {
    if (!fast) {
      return "This is a slow " + color + " car that has driven " + miles + " miles.";
    } else {
      return "This is a fast " + color + " car that has driven " + miles + " miles.";
    }
  }
  
  public static void main(String[] args) {
    Car versa = new Car("white", 52000, false);
    System.out.println(versa);
    versa.drive(66);
    System.out.println("You have repainted your car " + versa.repaint("red"));
    versa.drive(1000);
    versa.tuneUp();
    System.out.println(versa);
  }
  
}
