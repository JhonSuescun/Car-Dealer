package model;

import java.util.ArrayList;


/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author: Jhon E. Suescun
 * @version: 12/05/2020

 */
public class Client 
{
    // attributes
    private String firstName;
    private String lastName;
    private int id;
    private int phoneNumber;
    private String eMail;
    ArrayList<Vehicle> vehiclesInterest;


    // builder 

    // builder
    /**
     * Constructor para la clase de clientes
     * @param firstName El parámetro firstName define el o los nombres del cliente
     * @param lastName El parámetro lastName define el o los apellidos del cliente
     * @param id El parámetro id define el numero de identificacion del cliente
     * @param phoneNumber El parámetro phoneNumber define el numero telefonico del cliente
     * @param email El parámetro email define el correo electronico del cliente
     */
    public Client( String firstName, String lastName, int id, int phoneNumber, String eMail)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        vehiclesInterest = new ArrayList<Vehicle>();
    }


    // getters and setters
    
    /**
     * Metodo que devuelve el nombre del cliente
     * @return el nombre del cliente
     */
    public String getFirstName() 
    {
        return this.firstName;
    }


    /**
     * Metodo que establece el nombre del cliente
     * @param firstName el parametro firstName define los nombres del cliente
     */
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    

    /**
     * Metodo que devuelve el apellido del cliente
     * @return el apellido del cliente
     */
    public String getLastName() 
    {
        return this.lastName;
    }

    
    /**
     * Metodo que establece el apellido del cliente
     * @param lastName el parametro lastName define el apellido del cliente
     */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }


    /**
     * Metodo que devuelve el id del cliente
     * @return el numero de identificacion del cliente
     */
    public int getId() 
    {
        return this.id;
    }

    /**
     * metodo que establece el id del cliente
     * @param id el parametro id define el numero de ideintificacion del cliente
     */
    public void setId(int id)
    { 
        this.id = id;
    }


    /**
     * Metodo que devuelve el numero de telefono del cliente
     * @return el numero telefonico del cliente
     */
    public int getPhoneNumber() 
    {
        return this.phoneNumber;
    }


    /**
     * Metodo que establece el numero telefonico del cliente
     * @param phoneNumenber el parametro phoneNUmber define el numero telefonico del cliente
     */
    public void setPhoneNumber(int phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Metodo que devuelve el correo electronico del cliente
     * @return el correo electronico del cliente
     */
    public String getEMail() 
    {
        return this.eMail;
    }


    /**
     * Metodo que establece el correro electronico del cliente
     * @return el numero telefonico del cliente
     */
    public void setEMail(String eMail) 
    {
        this.eMail = eMail;
    }


    // public methods

    /**
     * Metodo que añade un automovil a la lista de interes del cliente
     * @param vehicle el parametro vehicle define el auto que sera añadido
     */
    public void addVehiclesInterest(Vehicle vehicle)
    {
        vehiclesInterest.add(vehicle);
    }

    /**
     * Metodo que lista todos los vehiculos de interes del cliente
	 * <b>pre: </b><br>
	 * <b>post: </b><br>
     */
    public void showVehiclesInterest()
    {
        for (int i=0 ; i<vehiclesInterest.size() ; i++)
        {
            System.out.print(""+
            "\n\n\t----------------------------"+
            "\n\n\t\tVEHICULO #"+i+
            vehiclesInterest.get(i).showInfo()+
            "\n\t----------------------------");
        }
        
    }


    /**
     * Metodo que lista la informacion del cliente
	 * <b>pre: </b><br>
	 * <b>post: </b><br>
     */
    public void showInfo()
    {
        System.out.printf("%n%n\t%s %n\t%s %s %n\t%s%d %n\t%s%d %n\t%s%s %n\t%s",
        "--------------------------------",
        getFirstName(), getLastName(),
        "id: ", getId(),
        "telefono: ", getPhoneNumber(),
        "e-mail: ", getEMail(),
        "--------------------------------");
    }
}