/*
 Una empresa vende computadoras, con las siguientes condiciones:
• Si el cliente es de tipo 1 se le descuenta 1% 
• Si el cliente es de tipo 2 se le descuenta 5% 
• Si el cliente es de tipo 3 se le descuenta 10% 
• Si el cliente es de tipo 4 se le descuenta 15%
Los productos y computadoras disponibles son:
• Computadora 1: $1000 • Computadora 2: $1100 • Computadora 3: $ 900
Cuando un cliente realiza una compra se pide los siguientes datos:
• Nombre del cliente • Tipo de cliente (1,2,3,4) • Seleccionar computadora de las disponibles
El cliente solo compra un computador a lavez
Elaborar un programa que permita procesar varios cliente e imprima el siguiente reporte
Cliente con Ana Gomez, con cédula 11001111, compra 1 computadoras con precio individual $1000. 
Total a pagar $1000 Cliente con Pedro Huertas, con cédula 21001111, compra 2 computadoras con precio individual $900. Total a pagar $1800
Total venta de computadoras: $2800
 */
package taller08;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Taller08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int tipoCliente;
        double pc;
        double descuento;
        double porcentaje1 = 1;
        double porcentaje2 = 5;
        double porcentaje3 = 10;
        double porcentaje4 = 15;
        int cedula;
        String cadena = "";
        int condicion; 
        double valorFinal;
        double sumaPrecios = 0;
        int contador = 0;
        int numPc;
        double valorAcumulado;
        
        do{
            System.out.println("Ingrese el nombre del cliente:");
            nombre = entrada.nextLine();
        
            System.out.println("Ingrese la cédula del cliente:");
            cedula = entrada.nextInt();
        
            System.out.println("Ingrese el tipo de cliente (1, 2, 3, o 4):");
            tipoCliente = entrada.nextInt();
            
            System.out.println("Ingrese la computadora a comprar(1, 2 o 3):");
            pc = entrada.nextInt();
            
            if(pc == 1){
                pc = 1000; 
            }else{
              if(pc == 2){
                  pc = 1100;                           
              }else{
                  if(pc == 3){
                      pc = 900;                                      
                  }
              }
            }
                                  
            valorFinal = pc;
            
            if(tipoCliente == 1){
                descuento = (porcentaje1 * pc)/100;
                valorFinal = pc - descuento ;
            }else{
                if(tipoCliente == 2){
                    descuento = (porcentaje2 * pc)/100;
                    valorFinal = pc - descuento ;                
                }else{
                    if(tipoCliente == 3){
                        descuento = (porcentaje3 * pc)/100;
                        valorFinal = pc - descuento ;                       
                    }else{
                        if(tipoCliente == 4){
                            descuento = (porcentaje4 * pc)/100;
                            valorFinal = pc - descuento ;  
                        }
                    }                
                }            
            }
            
            System.out.println("Ingrese la cantidad de computadoras a comprar:");
            numPc = entrada.nextInt();
            
            valorAcumulado = numPc * valorFinal;
            
            sumaPrecios = sumaPrecios + valorFinal;
            contador = contador + 1;
            
            cadena = String.format("%sCliente %s, con cédula %s, compra "
                    + "%s computadoras con precio individual %s Total a pagar %s\n",
                    cadena,
                    nombre,
                    cedula,
                    numPc,
                    pc,
                    valorAcumulado);
                    
        
            System.out.println("Ingrese 1 para seguir introduciendo datos: ");
            condicion = entrada.nextInt();
            
            
        }while(condicion == 1);
        
        System.out.println(cadena + "Total venta de computadoras: " + sumaPrecios);
    }
    
}
