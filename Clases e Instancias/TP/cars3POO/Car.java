public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon; //
    private Picture pic;

    public Car(double mpg) // Inicializador
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg; //
        pic = new Picture("car.jpg");
        pic.draw();
    }

    public void drive(double distance)
    {
        //TODO
        
        
        //Update picture position
        int pixelsPerMile = 10;
        pic.translate(distance * pixelsPerMile, 0);
    }

    public void addGas(double amount)
    {
        //TODO
    }

    public double getMilesDriven()
    {
        //TODO
        return 0.0;
    }

    public double getGasInTank()
    {
        return 0.0;
        //TODO
    }


}
