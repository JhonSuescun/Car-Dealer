package model;


/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public class Hybrid extends Car
{
    // constants
    private final static String EXTRA = "extra";
    private final static String ORDINARY = "ordinary";
    private final static String DIESEL = "diesel";
    
    private final static String QUICK = "quick";
    private final static String NORMAL = "normal";
    

    // attributes
    private int tankCapacity;
    private String typeGasoline;
    private int oilConsume;

    private String chargerType;
    private int batteryLife;
    private int batteryConsumption;


    // builder
    public Hybrid (String brand, String model, int displacement, int mileage, String status, String licensePlate, String typeCar, int numberOfDoors, boolean polarized, int tankCapacity, String typeGasoline, String chargerType, int batteryLife)
    {
        super(brand, model, displacement, mileage, status, licensePlate, typeCar, numberOfDoors, polarized);
        this.tankCapacity = tankCapacity;
        this.typeGasoline = typeGasoline;
        this.oilConsume = 0;
        this.chargerType = chargerType;
        this.batteryLife = batteryLife;
        this.batteryConsumption = 0;

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
     * metodo que devuelve el tipo de cargador del automovil
     * @return el tipo de cargador
     */
    public String getChargerType() 
    {
        return this.chargerType;
    }


    /**
     * Metodo que retorna la duracion de batria del automovil
     * @return la duracion de la bateria de la empresa
     */
    public int getBatteryLife() 
    {
        return this.batteryLife;
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
     * metodo que calcula el consumo de gasolina del vehiculo
     * @return el consumo de gasolina
     */
    public int oilConsume()
    {
        return tankCapacity * (getDisplacement()/110);
    }

    
    /**
     * Metodo que establece el consumo de bateria del automovil
     * @param batteryConsumption el parametro batteryConsumption define el consumo de bateria del automovil
     */
    public int batteryConsumption()
    {
        int batteryConsumption=0;
        switch (chargerType) {
            case QUICK:
                batteryConsumption = batteryLife*(getDisplacement()/100);    
                break;
        
            case NORMAL:
                batteryConsumption = (batteryLife + 5)*(getDisplacement()/100);
                break;
            
        }
        return batteryConsumption;
    }

    @Override
    public String showInfo()
    {
        String showInfo = super.showInfo();
        showInfo += "\n\tCapacidad del tanque: "+ getTankCapacity()+
        "\n\tTipo de gasolina: "+getTypeGasoline()+
        "\n\tTipo de cargador: "+getChargerType()+
        "\n\tDuracion de bateria: "+ getBatteryLife();
        setOilConsume(oilConsume());
        setBatteryConsumption(batteryConsumption());
        showInfo += "\n\tConsumo de gasolina: "+getOilConsume()+
        "\n\tConsumo de bateria"+getBatteryConsumption();
        
        return showInfo; 
    }


}