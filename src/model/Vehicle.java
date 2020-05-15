package model;


/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public abstract class Vehicle 
{
    // constants
    private final static String NEW = "nuevo";
    private final static String USED = "usado";


    // attributes
    private int totalPrice;
    private int basePrice;
    private String brand;
    private String model;
    private int displacement;
    private int mileage;
    private String status;
    private String licensePlate;

    // builder

    /**
     * Constructor para la clase de automoviles
     * @param brand El parámetro brand define la marca que va a tener el automovil
     * @param model El parámetro model define el modelo que va a tener el automovil
     * @param displacement El parámetro displacement define el cilindraje que va a tener el automovil
     * @param mileage El parámetro mileage define el kilometraje que va a tener el automovil
     * @param status El parámetro status define el estado en el que se encuentra el automovil
     * @param licensePlate El parámetro licensePlate define la placa que va a tener el vehiculo
     */
    public Vehicle(String brand, String model, int displacement, int mileage, String status, String licensePlate)
    {
        totalPrice = 0;
        basePrice = 0;
        this.brand = brand;
        this.model = model;
        this.displacement = displacement;
        this.mileage = mileage;
        this.status = status;
        this.licensePlate = licensePlate;
    }


    // getters and setters

    /**
     * Metodo que devuelve el precio total
     * @return el precio total
     */
    public int getTotalPrice() 
    {
        return this.totalPrice;
    }


    /**
     * Metodo que devuelve el precio base
     * @return el precio base del vehiculo
     */
    public int getBasePrice() 
    {
        return this.basePrice;
    }


    /**
     * Metodo que devuelve el la marca del vehiculo
     * @return lamarca del vehiculo
     */
    public String getBrand() 
    {
        return this.brand;
    }


    /**
     * Metodo que devuelve el modelo del vehiculo
     * @return el modelo del vehiculo
     */
    public String getModel() 
    {
        return this.model;
    }


    /**
     * Metodo que devuelve el cilindraje del vehiculo
     * @return el cilindraje del vehiculo
     */
    public int getDisplacement() 
    {
        return this.displacement;
    }


    /**
     * Metodo que devuelve el kilometraje del vehiculo
     * @return el kilometraje del vehiculo
     */
    public int getMileage() 
    {
        return this.mileage;
    }


    /**
     * Metodo que devuelve el estado del vehiculo
     * @return el estado del vehiculo
     */
    public String getStatus() 
    {
        return this.status;
    }


    /**
     * Metodo que devuelve la placa del vehiculo
     * @return la placa del vehiculo
     */
    public String getLicensePlate() 
    {
        return this.licensePlate;
    }

    
    /**
     * Metodo que devuelve la informacion del vehiculo
     * @return la informacion del vehiculo
     */
    public String showInfo()
    {
        return ("\n\tMarca: "+getBrand()+
        "\n\tModelo: "+getModel()+
        "\n\tCilindraje: "+getDisplacement()+
        "\n\tKilometraje: "+getMileage()+
        "\n\tEstado: "+ getStatus()+
        "\n\tPlaca: "+ getLicensePlate());
    }



}