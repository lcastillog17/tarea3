/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelisplus;

import dominio.MdEmpleado;
import java.util.Scanner;
import negocio.CatalogoEmpleados;
import negocio.CatalogoEmpleadosImpl;


/**
 *
 * @author linda
 */
public class ClsComision {
     private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\Users\\linda\\Desktop\\umg linda daniela\\SEMESTRE 4\\Programacion 2\\Clase7\\tarea\\Empleados.txt";
    private static final CatalogoEmpleados catalogoEmple = new CatalogoEmpleadosImpl();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- Iniciar nomina Empleado"
                        + "\n2.- Agregar empleado\n"
                        + "3.- Listar empleado\n"
                        + "4.- Buscar empleado por cantidad\n"
                        + "5.- Mayor y menor por mes\n"
                        + "6.- Mayor tres meses\n"
                        + "7.- Editar datos\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        //1. Creamos el objeto que administra el catalogo de personas
                        //La creacion del archivo es opcional, de todas maneras se creara 
                        //al escribir por primera vez en el archivo
                        catalogoEmple.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        //2. agregar informacion archivo
                        System.out.println("Introduce el nombre del empleado a agregar:");
                        String nombre = scanner.nextLine();
                        System.out.println("Introduce la venta de enero:");
                        String enero = scanner.nextLine();
                        System.out.println("Introduce la venta de febrero:");
                        String febrero = scanner.nextLine();
                        System.out.println("Introduce la venta de marzo:");
                        String marzo = scanner.nextLine();
                                
                        catalogoEmple.agregarEmpleado(nombre, nombreArchivo,Double.valueOf(enero),Double.valueOf(febrero),Double.valueOf(marzo));
                        break;
                    case 3:
                        //3. listar catalogo completo
                        catalogoEmple.listarEmpleado(nombreArchivo);
                        break;
                    case 4:
                        //4. Buscar pelicula
                        System.out.println("Introduce una cantidad a buscar:");
                        String buscar = scanner.nextLine();
                        catalogoEmple.buscarEmpleado(nombreArchivo, Double.valueOf(buscar));
                        break;
                        
                    case 5:
                        System.out.println("Ingrese el mes del que desea saber la mayor y menor venta");
                        int mesElegido=scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(catalogoEmple.MayorxMes(nombreArchivo, mesElegido));
                        System.out.println(catalogoEmple.MenorxMes(nombreArchivo, mesElegido));
                        
                        break;
                        
                    case 6:
                        System.out.println(catalogoEmple.vendioMas3Meses(nombreArchivo));  
                        break;
                        
                    case 7:
                        System.out.println("Ingrese la columna donde se encuentran los datos que desea modificar: ");
                         int col = scanner.nextInt();
                        System.out.println("Ingrese la fila donde desea modificar los datos: ");
                        int fila=scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ingrese el nuevo dato: ");
                        String nuevo=scanner.nextLine();
                        catalogoEmple.editar2(nombreArchivo, col, fila, nuevo);
                        
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
