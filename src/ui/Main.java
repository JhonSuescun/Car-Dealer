package ui;

import model.*;
import java.util.*;


public class Main
{
    public static void main(String args[])
    {
        // constants
        final int MENU_ADMIN = 1;
        final int MENU_CLIENT = 2;
        final int EXIT = 3;


        // attributes
        Scanner sc;

        // initialice
        sc = new Scanner(System.in);


        // menu
        System.out.printf("%n%n\t\t\t\t%s %n\t%s %n\t%s",
        "!BIENVENIDO A CAR DEALER APP¡",
        "antes de empezar con esta aplicacion y poder administrar tu concesionario, por favor",
        "llena la siguiente informacion:");

        System.out.print("\n\n\tIntroduce el nombre de la compañia: ");
        String name = sc.nextLine();

        System.out.print("\n\tIntroduce el NIT de tu empresa: ");
        int NIT = sc.nextInt();
        sc.nextLine();

        Company company = new Company(name, NIT);
        Seller seller1 = new Seller("Oscar", "Suarez", 100708300);
        Seller seller2 = new Seller("Maria Juliana", "Lopez", 1006073400);
        Seller seller3 = new Seller("Maria Jose", "Martinez", 1005044270);
        Seller seller4 = new Seller("Kevin David", "Galeano", 1007045250);
        Seller seller5 = new Seller("Erika", "Vergara", 1007450240);
      
        company.addSeller(seller1);
        company.addSeller(seller2);
        company.addSeller(seller3);
        company.addSeller(seller4);
        company.addSeller(seller5);

        boolean menu = true;
        
        while (menu) 
        {
            System.out.printf("%n%n%n\t\t\t%s%s %n\t\t\t  %s%s %n\t%s %n\t%s %n\t%s %n\t%s",
            "BIENVENIDO A ", company.getName(),
            "NIT: ", company.getNIT(),
            "¿qué desea hacer?",
            "1. Ingresar como administrador",
            "2. Ingresa como cliente",
            "3. Salir de la aplicacion");

            System.out.print("\n\t>> Digite lo que desea hacer: ");
            int choice = sc.nextInt();
            sc.nextLine();
            

            switch (choice) 
            {
                case MENU_ADMIN:
                    menuAdmin(sc, company);
                    break;
            
                case MENU_CLIENT:
                    menuClient(sc, company);
                    break;
                
                case EXIT:
                    menu = false;
                    break;
            }    
        }
        
         
    }


    public static void menuAdmin(Scanner sc, Company company)
    {
        
        System.out.printf("%n%n\t%s %n\t%s %n\t%s %n\t%s %n\t%s %n\t%s ",
        "Bienvenido a la mejor apilacion para",
        "administrar tu concesionario.",
        "¿que deseas hacer?",
        "1. ver inrformacion de los vendedores",
        "2. ver informacion de los clientes",
        "3. registrar un vehiculo");

        System.out.print("\n\n\tPorfavor digite lo que desea hacer: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                company.showAllSellers();
                break;
            
            case 2:
                company.showAllClients();
                break;
            
            case 3:
                registerVehicle(sc, company);
                break;
        }
    }

    public static void menuClient(Scanner sc, Company company)
    {
        System.out.printf("%n%n\t%s %n\t%s %n\t%s",
        "hola, nos complace que visites nuestro concesionario,",
        "antes de ver nuestro catalogo de vehiculos, necesitamos",
        "que llenes la siguiente informacion : ");

        System.out.print("\n\n\t>>Digita tu(s) nombres: ");
        String firstName = sc.nextLine();

        System.out.print("\n\t>>Digita tu(s) apellidos: ");
        String lastName = sc.nextLine();

        System.out.print("\n\t>> Digita tú id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("\n\t>> Digita tu numero telefonico: ");
        int phoneNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("\n\t>> Digita tu correo electronico: ");
        String eMail = sc.nextLine();

        Client client = new Client(firstName, lastName, id, phoneNumber, eMail);

        System.out.print("\n\n\tPorfavor elige el vendedor que te asesorara: ");

        company.showAllSellers();

        System.out.print("\n\t>> Digite el numero del vendedor: ");
        int choice = sc.nextInt();
        sc.nextLine();

        company.assignSeller(choice, client);

        System.out.print("\n\n\thola,"+
        "\n\tmuy buenas apreciado cliente, me complace tenerlo el dia de hoy."+
        "\n\t¿que desea hacer?"+
        "\n\t1. catalogo de vehiculos"+
        "\n\t2. Autos de interes"+
        "\n\t>> Digite lo que desea buscar:");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                company.showAllVehicles();
                System.out.print("\n\n\t>> Digite su vehiculo de interes");
                choice = sc.nextInt();
                client.addVehiclesInterest(company.searchVehicles(choice));
                break;
        
            case 2:
                System.out.print("Estos son tus autos de interes: ");
                break;
        } 
    }


    public static void registerVehicle(Scanner sc, Company company)
    {
        System.out.print("\n\n\t\t>> REGISTRAR VEHICULOS <<");
        System.out.print("\n\tEl auto es: \n\t1. Nuevo \n\t2. Usado \n\t>> Digite su eleccion: ");
        int choice = sc.nextInt();
        sc.nextLine();
        String licensePlate = "";
        String status = "";

        switch (choice) 
        {
            case 1:
                licensePlate = "sin asignar";
                status = "nuevo";
                break;
        
            case 2:
                System.out.print("\n\t> digite la placa");
                licensePlate = sc.nextLine();
                status = "usado";
                break;
        }
        
        System.out.print("\n\tDigite la marca (): ");
        String brand = sc.nextLine();

        System.out.print("\n\tDigite el modelo: ");
        String model = sc.nextLine();

        System.out.print("\n\tDigite el cilindraje: ");
        int displacement = sc.nextInt();

        System.out.print("\n\tDigite el kilometraje: ");
        int mileage = sc.nextInt();

        System.out.print("\n\t¿que clase de vehiculo es?");
        System.out.print("\n\t1. automovil \n\t2. motocicleta");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\n\tQue tipo de automovil desea registrar"+
                "\n\t1. Sedan"+
                "\n\t2. Pickup");

                choice = sc.nextInt();
                String typeCar = "";

                switch (choice) {
                    case 1:
                        typeCar = "sedan";
                        break;
                
                    case 2:
                        typeCar = "pickup";
                        break;
                }

                System.out.print("\n\tDigite el numero de puertas del automovil");
                int numberOfDoors = sc.nextInt();

                System.out.print("\n\t¿El automovil tiene es polarizado?: ");
                boolean polarized = sc.nextBoolean();

                System.out.print("\n\t¿Que auto desea registrar?"+
                "\n\t1. automovil a gasolina"+
                "\n\t2. automovil electrico"+
                "\n\t3. automovil hibrido");

                choice = sc.nextInt();
                int tankCapacity;
                String typeGasoline = "";
                String chargerType = "";
                int batteryLife;



                switch (choice) {
                    case 1:
                        System.out.print("\n\tCapacidad del tanque de gasolina (en galones): ");
                        tankCapacity = sc.nextInt();

                        System.out.print("\n\tTipo de gasolina: "+
                        "\n\t1. Extra"+
                        "\n\t2. Corriente"+
                        "\n\t3. Diesel"+
                        "\n\tDigite su eleccion: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                typeGasoline = "extra";
                                break;
                        
                            case 2:
                                typeGasoline = "ordinary";
                                break;

                            case 3:
                                typeGasoline = "diesel";
                                break;
                        }

                        Gasoline gasoline = new Gasoline(brand, model, displacement, mileage, status, licensePlate, typeCar, numberOfDoors, polarized, tankCapacity, typeGasoline);
                        company.addVehicle(gasoline);
                        break;
                

                    case 2:
                        System.out.print("\n\tTipo de cargador"+
                        "\n\t1. Cargador rapido"+
                        "\n\t2. Cargador normal"+
                        "\n\tDigite su eleccion: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                chargerType = "quick";
                                break;
                        
                            case 2:
                                chargerType = "normal";
                                break;
                        }

                        System.out.print("\n\tDigite la duracion de la bateria (por km): ");
                        batteryLife = sc.nextInt();

                        Electric electric = new Electric(brand, model, displacement, mileage, status, licensePlate, typeCar, numberOfDoors, polarized, chargerType, batteryLife); 
                        company.addVehicle(electric);

                        break;
                    


                    case 3:
                        System.out.print("\n\tCapacidad del tanque de gasolina (en galones): ");
                        tankCapacity = sc.nextInt();

                        System.out.print("\n\tTipo de gasolina: "+
                        "\n\t1. Extra"+
                        "\n\t2. Corriente"+
                        "\n\t3. Diesel"+
                        "\n\tDigite su eleccion: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                typeGasoline = "extra";
                                break;
                        
                            case 2:
                                typeGasoline = "ordinary";
                                break;

                            case 3:
                                typeGasoline = "diesel";
                                break;
                        }

                        System.out.print("\n\tTipo de cargador"+
                        "\n\t1. Cargador rapido"+
                        "\n\t2. Cargador normal"+
                        "\n\tDigite su eleccion: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                chargerType = "quick";
                                break;
                        
                            case 2:
                                chargerType = "normal";
                                break;
                        }

                        System.out.print("\n\tDigite la duracion de la bateria (por km): ");
                        batteryLife = sc.nextInt();
                    
                        Hybrid hybrid = new Hybrid(brand, model, displacement, mileage, status, licensePlate, typeCar, numberOfDoors, polarized, tankCapacity, typeGasoline, chargerType, batteryLife);
                        company.addVehicle(hybrid);

                        break;
                }


                
        
            case 2:
                System.out.print("\n\tTipo de motocicleta: "+
                "\n\t1. Estandar"+
                "\n\t2. Deportiva"+
                "\n\t3. Scooter"+
                "\n\t4. Cross"+
                "\n\t>> Digite su eleccion: ");
                choice = sc.nextInt();
                String typeMotorcycle="";

                switch (choice) {
                    case 1:
                        typeMotorcycle = "standar";
                        break;
                
                    case 2:
                        typeMotorcycle = "sporty";
                        break;
                    
                    case 3:
                        typeMotorcycle = "scooter";
                        break;
                    
                    case 4:
                        typeMotorcycle = "croos";
                        break;
                }

                System.out.print("\n\tCapacidad del tanque (por galones): ");
                int tankCapacityM = sc.nextInt();

                Motorcycle motorcycle = new Motorcycle(brand, model, displacement, mileage, status, licensePlate, typeMotorcycle, tankCapacityM);
                company.addVehicle(motorcycle);
                break;

        }





    }
}


