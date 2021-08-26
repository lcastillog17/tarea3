/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevaComision;

import java.util.*;

import modelos.MdVendedor;

/**
 *
 * @author linda
 */
public class ClsNuevaComision {
     List <MdVendedor> Todos= new ArrayList<MdVendedor>();
Scanner t= new Scanner (System.in);
MdVendedor vende = new MdVendedor();
 /*private static final int nombre =0;
    private static final int enero =1;
    private static final int febrero =2;
    private static final int marzo =3;
    private static final int total =4;
    private static final int promedio =5;*/

private MdVendedor Ingreso_Informacion(){
        MdVendedor vende = new MdVendedor();
        System.out.println("Ingrese nombre:");
        vende.setNombre(t.nextLine());
        System.out.println("Enero:");
        vende.setEnero(t.nextDouble());
        System.out.println("Febrero");
        vende.setFebrero(t.nextDouble());
        System.out.println("marzo:");
        vende.setMarzo(t.nextDouble());
        Todos.add(vende);
        return vende;
    }


/*
public void desplegarDatos(){
    for(MdVendedor ele:Todos){
    System.out.println("Nombre: "+ele.getNombre());
    System.out.println("Enero: "+ele.getEnero());
    System.out.println("Febrero: "+ele.getFebrero());
    System.out.println("Marzo: "+ele.getMarzo());
    ele.setTotal(ele.getEnero() + ele.getFebrero() + ele.getMarzo());
    System.out.println("Total: vendedor "+ele.getTotal());
    }
      System.out.println("----------------------");
   
}
*/

    public void imprimirDecorado(){
        
        System.out.print("\n Nombre-----Enero-----Febrero-----Marzo----Total\n");
       for(MdVendedor ele:Todos){

            System.out.print(" "+ele.getNombre()+"------Q."+ele.getEnero()+"------Q."+ele.getFebrero()+"------Q."+ele.getMarzo()+"------Q."+ele.getTotal()+"\n");

            }
     
        }


public String MayorxMes(int mes){
   Double mayor=0.0;
        String resultado = null;
        Double col;
        for(MdVendedor ele:Todos){ //recorre filas
            if(mes==1){
         col=ele.getEnero();
        if (col>mayor){
        mayor=col;
        resultado="vendio más la persona:"+ele.getNombre()+" con una venta de "+mayor;
            }
            }else if(mes==2){
                col=ele.getFebrero();
                if (col>mayor){
        mayor=Double.valueOf(col);
        resultado="vendio más la persona:"+ele.getNombre()+" con una venta de "+mayor;
                
            }
            }else if(mes==3){
                 col=ele.getMarzo();
                 if (col>mayor){
        mayor=Double.valueOf(col);
        resultado="vendio más la persona:"+ele.getNombre()+" con una venta de "+mayor;
            }
        
                }
        }
        return resultado; 
}


public String MenorxMes(int mes){
   Double menor=100000000000.0;
        String resultado = null;
        Double col;
        for(MdVendedor ele:Todos){
            if(mes==1){
         col=ele.getEnero();
        if (col<menor){
        menor=Double.valueOf(col);
        resultado="vendio menos la persona:"+ele.getNombre()+" con una venta de "+menor;
            }
            }else if(mes==2){
                col=ele.getFebrero();
                if (col<menor){
        menor=Double.valueOf(col);
        resultado="vendio menos la persona:"+ele.getNombre()+" con una venta de "+menor;
                
            }
            }else if(mes==3){
                 col=ele.getMarzo();
                 if (col<menor){
        menor=Double.valueOf(col);
        resultado="vendio menos la persona:"+ele.getNombre()+" con una venta de "+menor;
            }
        
                }
        }
        return resultado; 
}


public String vendioMas3Meses(){

            String Nom = null;
            int mayor=0;
            Double totalMayorVendedor;
            for(MdVendedor ele:Todos){
                
           totalMayorVendedor= ele.getEnero()+ele.getFebrero()+ele.getMarzo();

            if(totalMayorVendedor>Double.valueOf(mayor)){
            mayor=(int) Math.round(totalMayorVendedor);
             Nom=ele.getNombre();
             }
            }
            return Nom;
    }
public void totalesPorPersona(){
        for (MdVendedor ele:Todos) {
            ele.setTotal(ele.getEnero() + ele.getFebrero() + ele.getMarzo());
        }
    }

public String totalesPorMes(){
      Double totEnero=0.0,totFebrero=0.0,totMarzo=0.0;
      for(MdVendedor ele:Todos){
        totEnero=ele.getEnero()+totEnero;
            totFebrero=ele.getFebrero()+totFebrero;
            totMarzo=ele.getMarzo()+totMarzo;
      }
      return "\n En enero se vendio un total de: "+totEnero+"\n En febrero se vendio un total de: "+totFebrero+"\n En marzo se vendio un total de: "+totMarzo+"/n";
    }


public void UnidadPrueba(String nom,double ene,double feb, double mar){
         MdVendedor vende = new MdVendedor();
         vende.setNombre(nom);
         vende.setFebrero(feb);
         vende.setEnero(ene);
         vende.setMarzo(mar);
         Todos.add(vende);
    }

public String BuscarCantidad(Double cantidad){
      String encontre,busca=null;
      
      for(MdVendedor ele:Todos) {
     if(ele.getEnero()==cantidad){
          encontre=ele.getNombre();
          
           busca= "La venta es de: "+encontre+" en el mes de Enero"; 
           
      }
           if(ele.getFebrero()==cantidad){
          encontre=ele.getNombre();
          busca= "La venta es de: "+encontre+" en el mes de Febrero"; 
         
      }
         if(ele.getMarzo()==cantidad){
          encontre=ele.getNombre();
         busca="La venta es de: "+encontre+" en el mes de Marzo"; 
      }    
      }
     return busca;
      } 

   /*   private void editar(int columna){
          System.out.println("Ingrese el que desea cambiar ");
       System.out.println("Ingrese el dato nuevo ");    
          
          if (columna==1) {
              String nomNuevo;
              for(MdVendedor ele:Todos) {
                  if (ele.getNombre()==) {
                      nomNuevo=t.nextLine(); 
             ele.setNombre(nomNuevo);
                  }
          }
          }else if(columna==2){
              Double nomNuevo;
              for(MdVendedor ele:Todos) {
             nomNuevo=t.nextDouble();
             ele.setEnero(nomNuevo);
                  }
          }
          else if(columna==3){
              Double nomNuevo;
              for(MdVendedor ele:Todos) {
             nomNuevo=t.nextDouble();
              ele.setFebrero(nomNuevo);
                  }
          }
          else if(columna==4){
              Double nomNuevo;
              for(MdVendedor ele:Todos) {
             nomNuevo=t.nextDouble();
              ele.setMarzo(nomNuevo);
                  }
          }
   
   // comisiones[fila-1][columna-1]=t.nextLine();
  
    }
*/
      
      private void editar2(int columna){
          //get muestra y set modifica
          int x=0;
          String nomNuevo;
          double numNuevo;
         if (columna==1) {
        for(MdVendedor ele:Todos){
          System.out.println(x+" = "+ele.getNombre());
          x++;
      }
          System.out.println("ingrese el numero del que desea modificar: ");
          int i=t.nextInt();
          System.out.println("Cual sera el nombre nuevo que pondrá");
          nomNuevo=t.nextLine();
          nomNuevo=t.nextLine();
          Todos.get(i).setNombre(nomNuevo);   
          }
         
         if (columna==2) {
        for(MdVendedor ele:Todos){
          System.out.println(x+" = "+ele.getEnero());
          x++;
      }
          System.out.println("ingrese el indice del numero del que desea modificar: ");
          int i=t.nextInt();
          System.out.println("Cual sera el dato nuevo que pondrá");
          numNuevo=t.nextDouble();
         
          Todos.get(i).setEnero(numNuevo);   
          }
         
         if (columna==3) {
        for(MdVendedor ele:Todos){
          System.out.println(x+" = "+ele.getFebrero());
          x++;
      }
          System.out.println("ingrese el indice del numero del que desea modificar: ");
          int i=t.nextInt();
          System.out.println("Cual sera el dato nuevo que pondrá");
          numNuevo=t.nextDouble();
          
          Todos.get(i).setFebrero(numNuevo);   
          }
         
        if (columna==4) {
        for(MdVendedor ele:Todos){
          System.out.println(x+" = "+ele.getMarzo());
          x++;
      }
          System.out.println("ingrese el indice del numero del que desea modificar: ");
          int i=t.nextInt();
          System.out.println("Cual sera el dato nuevo que pondrá");
          numNuevo=t.nextDouble();
         
          Todos.get(i).setMarzo(numNuevo);   
          }
      
      }

public void menu(){
        String opc="";
        
        while(opc!="7"){
            
            System.out.println("1- Ingreso Informacion");
            System.out.println("2- Ver Informacion");
            System.out.println("3- Mayor y menor por mes");
            System.out.println("4- Mayor tres meses");
            System.out.println("5- Editar datos");
            System.out.println("6- Buscar por cantidad");
            System.out.println("7- Salir del programa");
            opc = t.nextLine();
            switch(opc){
                case "1": Ingreso_Informacion();
                
                break;
                case "2": 
                    totalesPorPersona();
                    imprimirDecorado();
                    System.out.println("-----"+totalesPorMes()+"-----"); 
                break;
                case "3": 
                    System.out.println("De qué mes desea ver cual es la venta mayor y menor sabiendo que 1=ene, 2=feb y 3=mar");
                    int mesElegido = t.nextInt();
                    System.out.println("-----Mayor "+MayorxMes(mesElegido)+"-----"+ "/n ");
                  System.out.println("-----Menor "+MenorxMes(mesElegido)+"-----"+" /n ");
                break;
                case "4":
                    System.out.println("-----La persona que vendió mas en tres meses fue: "+vendioMas3Meses()+"-----");
                    break;
                case "5":
                    int col;
                    imprimirDecorado();
                    System.out.println("Ingrese el numero de la columna donde se encuentra el dato que desea editar ");
                    System.out.println("Sabiendo que 1=nombre, 2=enero, 3=febrero y 4=marzo ");
                    col=t.nextInt();
                    editar2(col);
                    System.out.println("----Datos editados con exito----");
                    totalesPorPersona();
                    imprimirDecorado();
                    System.out.println("-----"+totalesPorMes()+"-----");
                   
                    break;
                case "6":
                    Double cant;
                    System.out.println("Ingrese la cantidad que desea buscar: ");
                    cant = t.nextDouble();
                    System.out.println(""+BuscarCantidad(cant)+"");
                    break;
                case "7":
                    opc="7";
                    break;
            }
        }
    }


}


