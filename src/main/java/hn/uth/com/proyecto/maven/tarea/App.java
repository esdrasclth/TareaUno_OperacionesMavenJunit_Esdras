package hn.uth.com.proyecto.maven.tarea;

import java.util.Scanner;

/**
 * Proyecto de clase, poniendo a prueba la herramienta de Maven.
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("*** CALCULADORA DE AREAS -- ESDRAS CLOTHER ***");
         
         imprimirMenu();
         
         int opcion = pedirNumeroTeclado("");
         if(opcion == 1) {
         	System.out.println("* AREA DE UN CIRCULO *");
         	int radio = pedirNumeroTeclado("Ingrese el radio del circulo");
         	System.out.println("El area de un circulo cuyo radio es " + radio + " es: " + areaCirculo(radio));
         } else if(opcion == 2) {
         	System.out.println("* AREA DE UN CUADRADO *");
         	int lado = pedirNumeroTeclado("Ingrese el lado del cuadrado");
         	System.out.println("El area de un cuadrado cuyo lado es " + lado + " es: " + areaCuadrado(lado));
         } else if(opcion == 3) {
         	System.out.println("* AREA DE UN RECTANGULO *");
         	int base = pedirNumeroTeclado("Ingrese la base del rectangulo");
         	int altura = pedirNumeroTeclado("Ingrese la altura del rectangulo");
         	System.out.println("El area de un rectagunlo cuya base es de " + base + " y altura es de " + altura + " es: " + areaRectangulo(base, altura));
         } else if(opcion == 4) {
         	System.out.println("* AREA DE UN TRIANGULO *");
         	int base = pedirNumeroTeclado("Ingrese la base del triangulo");
         	int altura = pedirNumeroTeclado("Ingrese la altura del triangulo");
         	System.out.println("El area de un triangulo cuya base es de " + base + " y altura es de " + altura + " es: " + areaTriangulo(base, altura));
         } else {
         	System.out.println("NO HA SELECCIONADO NINGUNA OPCION DEL MENU");
         }
    }
    
    // Mostrar las opciones del menu
    private static void imprimirMenu() {
    	System.out.println("ELIJA LA OPERACION A REALIZAR:");
    	System.out.println("1. AREA DE UN CIRCULO");
    	System.out.println("2. AREA DE UN CUADRADO");
    	System.out.println("3. AREA DE UN RECTANGULO");
    	System.out.println("4. AREA DE UN TRIANGULO");  
    }
    
    // Obtener los valores del usuario por teclado
    public static int pedirNumeroTeclado(String mensaje) {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println(mensaje);
    	int num = teclado.nextInt();
    	
    	return num;
    }
    
    // Calcular el área de un círculo
    public static int areaCirculo(int radio) {
    	int area = (int) (Math.PI * Math.pow(radio,2));
		return area;
    }
    
    // Calcular el área de un cuadrado
    public static int areaCuadrado(int lado) {
    	int area = lado * lado;
		return area;
    }
    
    // Calcular el área de un rectángulo
    public static Integer areaRectangulo(int base, int altura) {
    	Integer area = null;
    	if(base >= 0 && altura >= 0) {
    		area = base * altura;
    	} 
    	return area;
    }
    
    // Calcular el área de un triángulo
    public static Integer areaTriangulo(int base, int altura) {
    	Integer area = null;
    	if(base >= 0 && altura >= 0) {
    		area = base * altura;
    	} 
    	return area;
    }
}
