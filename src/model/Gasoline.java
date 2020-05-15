package model;

/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public class Gasoline extends Car 
{
    // constants
    private final static String EXTRA = "extra";
    private final static String ORDINARY = "ordinary";
    private final static String DIESEL = "diesel";


    // attributes
    private int tankCapacity;
    private String typeGasoline;
    private int oilConsume;


    // builder

    /**
     * Constructor para la clase de automoviles electricos
     * @param brand El parámetro brand define la marca que va a tener el automovil
     * @param model El parámetro model define el modelo que va a tener el automovil
     * @param displacement El parámetro displacement define el cilindraje que va a tener el automovil
     * @param mileage El parámetro mileage define el kilometraje que va a tener el automovil
     * @param status El parámetro status define el estado en el que se encuentra el automovil
     * @param licensePlate El parámetro licensePlate define la placa que va a tener el vehiculo
     * @param typeCar El parámetro typeCar define el tipo de automovil
     * @param numberOfDoors El parámetro numberOfDoors define el numero de puertas que va a terner el automovil
     * @param polarized El parámetro polarized define si el auto tiene las ventanas polarizadas
     * @param tankCapacity El parámetro tankCapacity define la capcidad del tanque de gasolina del automovil en galones
     * @param typeGasoline El parámetro typeGasoline define el tipo de gasolina que usara el automovil
     */
    public Gasoline(String brand, String model, int displacement, int mileage, String status, String licensePlate, String typeCar, int numberOfDoors, boolean polarized, int tankCapacity, String typeGasoline)
    {
        super(brand, model, displacement, mileage, status, licensePlate, typeCar, numberOfDoors, polarized);
        this.tankCapacity = tankCapacity;
        this.typeGasoline = typeGasoline;
        oilConsume = 0;
    }


    // getters and setters

    /**
     * metodo que devuelve la capacidad del tanque del automovil
     * @return la capacidad del tanque en galones
     */
    public int getTankCapacity() 
    {
        return this.tankCapacity;
    }

    /**
     * metodo que devuelve el tipo de gasolina que usa el automovil
     * @return  el tipo de gasolina que usa el automovil
     */
    public String getTypeGasoline() 
    {
        return this.typeGasoline;
    }

    /**
     * metodo que devuelve la cantidad de conbustible que consume el vehiculo
     * @return la gasolina que consume el automovil
     */
    public int getOilConsume() 
    {
        return this.oilConsume;
    }


    /**
     * metodo que establece el gasto de gasolina por parte del vehiculo
     * @param oilConsume el parametro oilConsume define la cantidad de combustible consumida poe el vehiculo
     */
    public void setOilConsume(int oilConsume) 
    {
        this.oilConsume = oilConsume;
    }

    /**
     * metodo que devuelve la informacion del vehiculo en general
     * @return la informacion del vehiculo
     */
    @Override
    public String showInfo()
    {
        String showInfo = super.showInfo();
        showInfo += "\n\tCapacidad del tanque: "+ getTankCapacity()+
        "\n\tTipo de gasolina: "+getTypeGasoline();
        setOilConsume(oilConsume());
        showInfo += "\n\tConsumo de gasolina: "+getOilConsume();
        return showInfo;
    }

    /**
     * metodo que calcula el consumo de gasolina del vehiculo
     * @return el consumo de gasolina
     */
    public int oilConsume()
    {
        
        return getTankCapacity() * (getDisplacement()/100); 
    }

}