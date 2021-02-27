package Taller__5;

/**
 * La clase Taller5 tiene la intención de resolver el taller número 5.
 *
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */

public class Taller5 {  
    
    

    /**
    * @param array es una arreglo de numeros enteros.
    * El método suma tiene la intención de hacer el proceso de suma
    * mediante una funcion cíclica (while/for/...)
    * @return la suma de todos los numeros sumados.
    */
            public class ejercicio2{
    
 static double dif;
 long inicio = System.nanoTime();
    
    
    public  int  suma ( int [] array ) {
    int suma = 0 ;
    for ( int i = 0 ; i < array . length; i ++ ) {
        suma = suma + array [i];
    }
    long fin = System.nanoTime();
    dif = (fin - inicio) * 1.0e-9;	
    return suma;
}
  	
 public static void main(String[] args) {		
 System.out.println("El programa dura " + dif + " s");
		
}  
}  
    
    
    /**
    * @param array es un arreglo de números desordenados
    * El método insertionSort tiene la intención ordenar los números
    * del arreglo array por el método insertion:
    * @see <a href="https://www.youtube.com/watch?v=OGzPmgsI-pQ"> Insertion Sort <a/>
    * mediante la anidación de funciones cíclicas (while/for/...)
    * 
    */
    
               public class ejercicio1{
    static double dif;
    long inicio = System.nanoTime();
    public int[] insertionSort(int[] array) {
         
        int y = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) { 
            y = i;
            temp = array[y];
            while (y > 0 && array[i] > temp) {
                array[y] = array[y - 1];
                y++;
            }
            array[y] = temp;
        }
        long fin = System.nanoTime();
        dif = (fin - inicio) * 1.0e-9;
        
        return array;

    }
    public static void main(String[] args) {
    
        System.out.println("El programa dura " + dif + " s");
    }
}

