//Ejercicio 1.2

/*Calcular e cuantas formas se puede rellenar un rectangulo de 2*n cm˄2 con rectangulos de 2*1 cm˄2  .
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.1
 @param n - corresponde al lado n del rectangulo.
 @return -Devuelve el número de combinación de que pueden desarrolar con respecto
 a al area del rectangulo (2*n).
*/

public class Ejercicio2 {

    public int rectangulo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return rectangulo(n - 1) + rectangulo(n - 2);
        }
    }

}

// Para testear el código :)
public class TestEje2 {

    public static void main(String[] args) {
        Ejercicio2 E = new Ejercicio2();
        System.out.println(E.rectangulo(5));
    }

}
