public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;

  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck() {
    System.out.println("License plate: " + getlicensePlate());
    System.out.println("Toll price: " + gettollFee());
    System.out.println("Passengers: " + getpassengers());
    System.out.println("axels?: " + axles);
    System.out.println("has Trailer: " + hasTrailer);

  }
}