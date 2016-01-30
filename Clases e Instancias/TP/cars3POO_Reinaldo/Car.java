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
    
    public Car(int mpg)
    /*
     * Crea el segundo tipo de carro
     */
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg; //
        pic = new Picture("hummer.jpg");
        pic.draw();
        moveStart(pic);
    }
    
    public Car(double mpg, String img) // Discussed later
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg; //
        pic = new Picture(img);
        pic.draw();
    }

    public void drive(double distance)
    {
        //TODO
        //Update picture position
        milesDriven = milesDriven + distance;
        double gasConsumed = distance / milesPerGallon; //
        gasInTank = gasInTank - gasConsumed; //
        int pixelsPerMile = 10;
        pic.translate(distance * pixelsPerMile, 0);
       
    }

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
        //TODO
    }

    public double getMilesDriven()
    {
        //TODO
        return milesDriven;
    }

    public double getGasInTank()
    {
        return gasInTank;
        //TODO
    }
    
    /*
     * Cambia la posición inicial de cualquier carro
     */
    public void moveStart(Picture pic)
    {
        pic.translate(0,100);
    }    
    
   

}
