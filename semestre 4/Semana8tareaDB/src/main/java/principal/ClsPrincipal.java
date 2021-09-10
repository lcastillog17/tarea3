/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import datos.AccesoDatosJDBC;
import dominio.MdEmpleado;
import java.sql.*;
import java.util.*;
import negocio.*;


/**
 *
 * @author linda
 */
public class ClsPrincipal {
     private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final CatalogoEmpleados catalogoEmple = new CatalogoEmpleadosImpl();


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n"
                        + "\n1.- Agregar empleado\n"
                        + "2.- Listar empleado\n"
                        + "3.- Buscar empleado por cantidad\n"
                        + "4.- Mayor y menor por mes\n"
                        + "5.- Mayor tres meses\n"
                        + "6.- Editar datos\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        //2. agregar informacion archivo
                        System.out.println("Introduce el nombre del empleado a agregar:");
                        String nombre = scanner.nextLine();
                        System.out.println("Introduce la venta de enero:");
                        String enero = scanner.nextLine();
                        System.out.println("Introduce la venta de febrero:");
                        String febrero = scanner.nextLine();
                        System.out.println("Introduce la venta de marzo:");
                        String marzo = scanner.nextLine();
                                
                        catalogoEmple.agregarEmpleado(nombre,Double.valueOf(enero),Double.valueOf(febrero),Double.valueOf(marzo));
                        break;
                    case 2:
                        //3. listar catalogo completo
                        catalogoEmple.listarEmpleado();
                        break;
                    case 3:
                        //4. Buscar pelicula
                        System.out.println("Introduce una cantidad a buscar:");
                        String buscar = scanner.nextLine();
                        catalogoEmple.buscarEmpleado(Double.valueOf(buscar));
                        break;
                        
                    case 4:
                        System.out.println("Ingrese el mes del que desea saber la mayor y menor venta");
                        int mesElegido=scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(catalogoEmple.MayorxMes(mesElegido));
                        System.out.println(catalogoEmple.MenorxMes(mesElegido));
                        
                        break;
                        
                    case 5:
                        System.out.println(catalogoEmple.vendioMas3Meses());  
                        break;
                        
                    case 6:
                        System.out.println("Ingrese la columna donde se encuentran los datos que desea modificar: ");
                         int col = scanner.nextInt();
                        System.out.println("Ingrese del empleado del que desee modificar los datos: ");
                        int codigo=scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ingrese el nuevo dato: ");
                        String nuevo=scanner.nextLine();
                        catalogoEmple.editar2(col, codigo, nuevo);
                        
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception ex) {
                ex.printStackTrace(System.out);
                //System.out.println("Error!");
            }
        }

    }

}
