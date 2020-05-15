package model;

/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public class Electric extends Car
{
    // constants
    private final static String QUICK = "quick";
    private final static String NORMAL = "normal";


    // attributes
    private String chargerType;
    private int batteryLife;
    private int batteryConsumption;


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
     * @param chargerType El parámetro chargerType define el tipo de cargador que usara el automovil
     * @param batteryLife El parámetro batteryLife define la duracion de la bateria por Km
     */
    public Electric(String brand, String model, int displacement, int mileage, String status, String licensePlate, String typeCar, int numberOfDoors, boolean polarized, String chargerType, int batteryLife)
    {
        super(brand, model, displacement, mileage, status, licensePlate, typeCar, numberOfDoors, polarized);
        this.chargerType = chargerType;
        this.batteryLife = batteryLife;
        batteryConsumption = 0;
    }



    // getters and setters

    /**
     * metodo que devuelve el tipo de cargador del automovil
     * @return el tipo de cargador
     */
    public String getChargerType() 
    {
        return this.chargerType;
    }


    /**
     * Metodo que establece el tipo de cargador de la empresa
     * @param chargerType el parametro chargerType define el cargador que usara el automovil
     */
    public void setChargerType(String chargerType) 
    {
        this.chargerType = chargerType;
    }


    /**
     * Metodo que retorna la duracion de batria del automovil
     * @return la duracion de la bateria de la empresa
     */
    public int getBatteryLIfe() 
    {
        return this.batteryLife;
    }


    /**
     * Metodo que establece la duracion de la bateria
     * @param batteryLife el parametro batteryLife define la duracion de la beteria del automovil
     */
    public void setBatteryLIfe(int batteryLIfe) 
    {
        this.batteryLife = batteryLIfe;
    }


    /**
     * Metodo que devuelve el consumo de bateria del automovil
     * @return el consumo de bateria del auto
     */
    public int getBatteryConsumption() 
    {
        return this.batteryConsumption;
    }


    /**
     * Metodo que establece el consumo de bateria del automovil
     * @param batteryConsumption el parametro batteryConsumption define el consumo de bateria del automovil
     */
    public void setBatteryConsumption(int batteryConsumption) 
    {
        this.batteryConsumption = batteryConsumption;
    }


    /**
     * Metodo que calcula el consumo de bateria del automovil
     * @return el consumo de bateria del automovil
     */
    public int batteryConsumption()
    {
        int batteryConsumption = 0;

        switch (chargerType) 
        {
            case QUICK:
                batteryConsumption = (batteryLife + 10) * (getDisplacement()/100);
                break;
        
            case NORMAL:
                batteryConsumption = (batteryLife + 15) * (getDisplacement()/100);
                break;
        }

        return batteryConsumption;
    }

    /**
     * Metodo que muestra la informacion del auto electrico
     * <b>pre: </b><br>
	 * <b>post: </b>muestra la informacion del vehiculo en general<br> 
     */
    @Override
    public String showInfo()
    {
        String showInfo = super.showInfo();
        showInfo += showInfo();
        showInfo += "\n\tTipo de cargador: "+getChargerType()+
        "\n\tDuracion de bateria: "+getBatteryLIfe();
        setBatteryConsumption(batteryConsumption());
        showInfo += "\n\tConsumo de bateria: "+getBatteryConsumption();
        return showInfo;

    }


}