public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }



  public void printcar()
  {
System.out.println("License plate: " + getlicensePlate());
    System.out.println("Toll price: " + gettollFee());
    System.out.println("Passengers: " + getpassengers());
    System.out.println("Electric?: " + electric);
    System.out.println("Discount: " + discountApplied);
  }

  public boolean getelectric() { return electric;}
  public boolean getdiscountApplied() { return discountApplied;}

}