package model;

import java.util.ArrayList;


/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public class Seller
{
    // constants
    private final static int MAX_CLIENTS = 5;


    //attributes
    private String firstName;
    private String lastName;
    private int id;
    private int totalSales;
    private ArrayList <Client> clients;
    public static int nextId;


    // builder
    
    
    /**
     * Constructor para la clase de clientes
     * @param firstName El parámetro firstName define el o los nombres del vendedor
     * @param lastName El parámetro lastName define el o los apellidos del vendedor
     * @param id El parámetro id define el numero de identificacion del vendedor
     */
    public Seller(String firstName,  String lastName, int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        totalSales = 0;
        clients = new ArrayList <Client>();
    }


    // getters and setters

    /**
     * Metodo que devuelve el nombre del vendedor
     * @return el nombre del vendedor
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Metodo que devuelve el apellido del vendedor
     * @return el apellido del vendedor
     */
    public String getLastName()
    {
        return this.lastName;
    }
    

    /**
     * Metodo que devuelve el numero de identificacion del vendedor
     * @return el numero de identificacion del vendedor
     */
    public int getId()
    {
        return this.id;
    }

    /**
     * Metodo que devuelve el numero total de ventas del vendedor
     * @return el numero de ventas totales del vendedor
     */
    public int getTotalSales() 
    {
        return this.totalSales;
    }

    /**
     * Metodo que destablece el numero total de ventas
     * @param totalSales el parametro totalSales define el numero de ventas hecho por un empleado
     */
    public void setTotalSales(int totalSales) 
    {
        this.totalSales = totalSales;
    }




    // public methods
    
    /**
     * Metodo que añade un cliente a un vendedor
     * @param client el parametro client define el cliente que sera añadido 
     * <b>pre: </b><br>
	 * <b>post: </b>sera añadido un cliente a un vendedor<br> 
     */
    public void addClient(Client client)
    {
        if(clients.size() < MAX_CLIENTS)
        {
            clients.add(client);
        }
        else
        {
            System.out.println("ERROR: no se pueden agregar mas clientes");
        }
        
    }



    /**
     * Metodo que añade un cliente a un vendedor
     * @param i el parametro i define el numero del vendedor 
     * <b>pre: </b><br>
	 * <b>post: </b>se mostrara la informacion de un vendedor<br> 
     */
    public void showInfo(int i)
    {
        System.out.printf("%n%n\t%s %n\t\t%s%d   %n\t%s%s %n\t%s%d %n\t%s",
        "----------------------------",
        "SELLER ", i+1,
        getFirstName(), getLastName(),
        "id: ", getId(),
        "> clientes:");
        for(int j=0 ; j<clients.size() ; j++)
        {
            System.out.print("\n>> "+clients.get(j).getFirstName()+" "+clients.get(j).getLastName());
        }
        System.out.print("\n\t----------------------------");
    }


    /**
     * Metodo que muestra los clientes asignados a un cliente 
     * <b>pre: </b><br>
	 * <b>post: </b>se mostraran los clientes para un vendedor especifico<br> 
     */
    public void showClients()
    {
        for (int i=0 ; i<MAX_CLIENTS ; i++)
        {
            clients.get(i).showInfo();
        }
    }

}