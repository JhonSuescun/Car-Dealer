package model;


/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public class Motorcycle extends Vehicle
{
    // constants
    private final static String STANDAR = "standar";
    private final static String SPORTY = "sporty";
    private final static String SCOOTER = "scooter";
    private final static String CROSS = "cross";


    // attributes
    private String typeMotorcycle;
    private int tankCapacity;
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
     * @param typeMotorcycle el parametro typeMotorcycle define de que tipo es la motocicleta
     * @param tankCapacity El parámetro tankCapacity define la capcidad del tanque de gasolina de la motocicleta
     */
    public Motorcycle(String brand, String model, int displacement, int mileage, String status, String licensePlate, String typeMotorcycle, int tankCapacity)
    {
        super(brand, model, displacement, mileage, status, licensePlate);
        this.typeMotorcycle = typeMotorcycle;
        this.tankCapacity = tankCapacity;
        oilConsume = 0;
    }


    // getters and setters

    /**
     * metodo que devuelve el tipo de la motociclera
     * @return el tipo de la motocicleta
     */
    public String getTypeMotorcycle() 
    {
        return this.typeMotorcycle;
    }


    /**
     * metodo que devuelve la capacidad del tanque de gasolina de la motocicleta
     * @return la capacidad del tanque
     */
    public int getTankCapacity() 
    {
        return this.tankCapacity;
    }


    /**
     * metodo que devuelve el consumo de gasolina de la motocicleta
     * @return el gasto de gasolina de la motocicleta 
     */
    public int getOilConsume() 
    {
        return this.oilConsume;
    }


    /**
     * metodo que establece el consumo de gasolina de la motocicleta
     * @param oilConsume el parametro oilConsume define el consumo de gasolina por parte de la motocicleta
     */
    public void setOilConsume(int oilConsume) 
    {
        this.oilConsume = oilConsume;
    }

    /**
     * metodo que calcula cual es el gasto de gasolina para una motocicleta
     * @return devuelve cual es el gasto de gasolina para una motocicleta
     */
    public int oilConsume()
    {
        return tankCapacity * (getDisplacement()/90);
    }

    /**
     * metodo que muestra la informacion general de la motocicleta
     * @return la informacion de la motocicleta;
     */
    @Override
    public String showInfo()
    {
        String showInfo = super.showInfo();
        showInfo += "\n\tTipo de motocicleta: "+ getTypeMotorcycle()+
        "\n\tCapacidad de tanque: "+ getTankCapacity();
        setOilConsume(oilConsume());
        showInfo += "\n\tConsumo de gasolina: "+getOilConsume();
        return showInfo;
    }

}