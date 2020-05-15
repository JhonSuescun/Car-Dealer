package model;


/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public abstract class Car extends Vehicle
{
    // constants
    private final static String SEDAN = "sedan";
    private final static String PICKUP = "pickup";
    private final static boolean POLARIZED = true;
    private final static boolean NOT_POLARIZED = false;


    // attributes
    private String typeCar;
    private int numberOfDoors;
    private boolean polarized;


    // builder
    /**
     * Constructor para la clase de automoviles
     * @param brand El parámetro brand define la marca que va a tener el automovil
     * @param model El parámetro model define el modelo que va a tener el automovil
     * @param displacement El parámetro displacement define el cilindraje que va a tener el automovil
     * @param mileage El parámetro mileage define el kilometraje que va a tener el automovil
     * @param status El parámetro status define el estado en el que se encuentra el automovil
     * @param licensePlate El parámetro licensePlate define la placa que va a tener el vehiculo
     * @param typeCar El parámetro typeCar define el tipo de automovil
     * @param numberOfDoors El parámetro numberOfDoors define el numero de puertas que va a terner el automovil
     * @param polarized El parámetro polarized define si el auto tiene las ventanas polarizadas
     */
    public Car(String brand, String model, int displacement, int mileage, String status, String licensePlate, String typeCar, int numberOfDoors, boolean polarized)
    {
        super(brand, model, displacement, mileage, status, licensePlate);
        this.typeCar = typeCar;
        this.numberOfDoors = numberOfDoors;
        this.polarized = polarized;
    }


    // getters and setters
    
    /**
     * Metodo que devuelve el tipo de carro
     * @return que tipo automovil es
     */
    public String getTypeCar() 
    {
        return this.typeCar;
    }


    /**
     * Metodo que establece el tipo de automovil
     * @param typeCar el parametro typeCar define el tipo de automovil
     */
    public void setTypeCar(String typeCar) 
    {
        this.typeCar = typeCar;
    }

    
    /**
     * Metodo que devuelve el numero de puertas del automovil
     * @return el numero de puertas del automovil
     */
    public int getNumberOfDoors() 
    {
        return this.numberOfDoors;
    }


    /**
     * Metodo que establece el numero de puertas
     * @param numberOfDoors el parametro numberOfDoors define el numero de puertas en un automovil
     */
    public void setNumberOfDoors(int numberOfDoors) 
    {
        this.numberOfDoors = numberOfDoors;
    }


    /**
     * Metodo que devuelve si un auto esta polarizado o no
     * @return si es verdadero o no que el auto esta polarizado
     */   
    public boolean getPolarized() 
    {
        return this.polarized;
    }



    /**
     * Metodo que establece el estado de las ventanas del coche
     * @return si el automovil esta polarizado o no
     */
    public void setPolarized(boolean polarized) 
    {
        this.polarized = polarized;
    }


    /**
     * Metodo que devuelve la informacion general de automovil
     * @return retorna los datos del automovil
     */
    @Override
    public String showInfo()
    {
        String showInfo = super.showInfo();
        showInfo += "\n\tTipo: "+getTypeCar()+
        "\n\tNo. puertas: "+getNumberOfDoors()+
        "\n\tpolarizado:"+getPolarized();

        return showInfo;
    }

}