package model;

import java.util.ArrayList;

/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public class Company 
{
    // constants
    private final static int MAX_SELLERS = 5;
    private final static int MAX_ROWS = 10;
    private final static int MAX_COLS = 5; 

    
    // attributes
    private String name;
    private int NIT;
    private int totalEarnings;
    private int salesNumber;
    private ArrayList<Seller> sellers;
    private ArrayList<Vehicle> vehicles;
    private int[][] parkingLot;

    
    // builder

    /**
     * Constructor para la clase de la compañia
     * @param name El parámetro name define el nombre de la empresa
     * @param NIT El parámetro NIT define el codigo de la empresa
     */
    public Company (String name, int NIT)
    {
        this.name = name;
        this.NIT = NIT;
        totalEarnings = 0;
        salesNumber = 0;
        sellers = new ArrayList<Seller>();
        vehicles = new ArrayList<Vehicle>();
        parkingLot = new int[MAX_ROWS][MAX_COLS];
    }


    // getters and setters


    /**
     * Metodo que devuelve el nombre de la empresa
     * @return el nombre de la empresa
     */
    public String getName()
    {
        return this.name;
    }
    

    /**
     * Metodo que devuelve el NIT de la empresa
     * @return el NIT de la empresa
     */
    public int getNIT()
    {
        return this.NIT;
    }

    
    /**
     * Metodo que devuelve el total de ganancias de la empresa
     * @return el total de ganancias de la empresa
     */
    public int getTotalEarnings() 
    {
        return this.totalEarnings;
    }


    /**
     * Metodo que establece el total de ganacias de la compañia
     * @param totalEarnings el parametro totalEarnings define el total de ganancias de la compañia
     */
    public void setTotalEarnings(int totalEarnings) 
    {
        this.totalEarnings = totalEarnings;
    }


    /**
     * Metodo que devuelve el numero de ventas hechas por la compañia
     * @return el numero de ventas hechas por la compañia
     */
    public int getSalesNumber() 
    {
        return this.salesNumber;
    }


    /**
     * Metodo que establece el numero de ventas hechas por la compañia
     * @param salesNumber el parametro salesNumber establece el numero de ventas hechas por la compañia 
     */
    public void setSalesNumber(int salesNumber) 
    {
        this.salesNumber = salesNumber;
    }


    // public methods

    /**
     * Metodo que añade la informacion de un vendedor a la compañia
     * @param seller el parametro seller define el vendedor que sera añadido
     */
    public void addSeller(Seller seller)
    {
        sellers.add(seller);
    }

    /**
     * Metodo que añade un vehiculo al concesionario de la compañia
     * @param vehicle el parametro vehicle define el vehiculo que sera añadido
     */
    public void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }


    /**
     * Metodo que muestra el listado de vendedores que tiene la compañia
     * <b>pre: </b>debe existir por lo menos un vendedor en la ArrayList<br>
	 * <b>post: </b>devuelve la informacion de todos lo vendedores<br> 
     */
    public void showAllSellers ()
    {
        for(int i=0 ; i<MAX_SELLERS ; i++)
        {
            sellers.get(i).showInfo(i);
        }
    }

    /**
     * Metodo que asigna un un cliente a un vendedor
     * @param choice el parametro choice define la eleccion del cliente al vendedor que se le asignara
     * @param client el parametro client define el cliente que sera asignado al vendedor
     * <b>pre: </b> debe existir por lo menos un vendedor en la ArrayList <br>
	 * <b>post: </b> un cliente es asignado a un vendedor<br> 
     */
    public void assignSeller(int choice, Client client)
    {
        sellers.get(choice-1).addClient(client);
    }


    /**
     * Metodo que muestra el listado de clientes que tiene la compañia
     * <b>pre: </b> debe existir por lo menos un cliente asignado a un vendedor <br>
	 * <b>post: </b> se muestra la informacion de todos los clientes <br> 
     */
    public void showAllClients()
    {
        for (int i=0 ; i<MAX_SELLERS ; i++)
        {
            sellers.get(i).showClients();
        }
    }


    /**
     * Metodo que muestra el listado de vehiculos que tiene el concesionario
     * <b>pre: </b> debe exisitr por lo menos un vehiculo en la arraylist <br>
	 * <b>post: </b> devuelve la informacion de todos lo vehiculos en el concesionario<br> 
     */
    public void showAllVehicles()
    {
        for (int i=0 ; i<vehicles.size() ; i++)
        {
            System.out.print(""+
            "\n\n\t----------------------------"+
            "\n\n\t\tVEHICULO #"+i+
            vehicles.get(i).showInfo()+
            "\n\t----------------------------");
        }
        
    }

    /**
     * Metodo que muestra el listado de clientes que tiene la compañia
     * @param choice el parametro choice define la eleccion del auto que va a elegir el cliente como de interes
     * <b>pre: </b> el numero seleccionado debe ser positivo <br>
	 * <b>post: </b> devuelve el vehiculo que el cliente eligio<br> 
     */
    public Vehicle searchVehicles(int choice)
    {
        return vehicles.get(choice-1);
    }



    /**
     * Metodo que añade un vehiculo al concesionario
     * @param vehicle el parametro vehicle define el vehiculo que sera añadido a la compañia
     * <b>pre: </b><br>
	 * <b>post: </b> un vehiculo sera añadido al concesionario<br> 
     */
    public void addVehicles(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }











}