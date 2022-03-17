public class Taxi extends Car{

    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean getelectric, double fareCollected, boolean getdiscountApplied)
    {
        super(licensePlate, tollFee, passengers, getelectric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi()
    {
        System.out.println("License plate: " + getlicensePlate());
        System.out.println("Toll price: " + gettollFee());
        System.out.println("Passengers: " + getpassengers());
        System.out.println("Electric?: " + getelectric());
        System.out.println("Discount: " + getdiscountApplied());
        System.out.println("total fare collected: " + fareCollected);
    }


}
