//Ejercicios CoginBat (Recursión 1)

//Ejercicio 1(bunnyEars2)

/*Calcular recursivamente el número de orejas que tiene la linea de conejos (1,2,3....n), 
 teniendo en cuenta que los conejos pares tiene tres orejas y los conejos impares tienen 2 orejas,
 ademas se desarrollara mediante recursividad.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.0
 @param bunnies - El número de conejos
 @return -El número total de orejas con respecto al número de conejos.
*/

public int bunnyEars2(int bunnies) {
if( bunnies == 0){// O(1)
    return 0;// O(1)
} else{
if(bunnies%2==0){ // O(1)
   return 3 + bunnyEars2(bunnies-1);// O(1) + O(n-1)
}else{
   return 2 + bunnyEars2(bunnies-1);// O(1)+ O(n-1)
   }   
  }
}
/*
T(n)= O(1)+O(1)+O(1)+O(1)+O(n-1)+O(1)+ O(n-1)= O(1)+ O(n-1) = C + T(n-1) =  O (n)

*/

//Ejercicio 2(triángulo) 

/*Calcular los bloques totales de una piramide teniendo en cuenta que dependiende del numero de filas 
que corresponde al número de bloques, mediante recursividad.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.0
 @param rows - corresponde el número de filas.
 @return -El número total de bloques de una piramede que depende de el número de filas.
*/
public int triangle(int rows) {
if(rows == 0){//C ,O(1)
    return 0;//O(1)
}else{
return rows+triangle(rows-1);// O(1) + O(n-1)
 } 
}

// T(n) = n + 1 + 1 + n - 1 = 1 + 2n = O(1 + 2n) =C + T(n-1), O(n)

//Ejercicio 3(sumDigits)

/*Calcular la suma de los digitos de un número no negativo mediante recursividad.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.0
 @param n - corresponde al número.
 @return -La suma de los digitos de n(número).
*/
public int sumDigits(int n) {
if(n==0){ // O(1)
    return 0; // O(1)
}else{

return n%10+sumDigits(n/10); // O(1) + O(n/10-1)
 }
}  
//  T(n) = n/10 + 1 + 1 + n/10 - 1 = 1 + 2n = C+ t(n/10) ,O(log n)

//Ejercicio 4(count7)

/*Calcular las veces que se repite el 7 en un número no negativo.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.0
 @param n - corresponde al número.
 @return -Devuelven el recuento de la existencia del número 7 en n(número).
*/

public int count7(int n) {
    if(n==0){ // O(1)
        return 0;// O(1)
    }else{
        if(n%10==7){ // O(1)
        return 1+count7(n/10); // O(1) + O(n/10)
        }else{
        return count7(n/10);  // O(1) + O(n/10) 
        }
   }   
}
// T(n) = 1 + 1 + 1 + 1 + n + n/10 + n/10  = 1 + 4n = O(1 + 4n) = C+ t(n/10), O(log n)
//Ejercicio 5(count8)

/*Calcular las veces que se repite el 8 en un número no negativo, teniendo en cuenta si se repite 
un 8 a la izquierda de otro, este contara el doble, de lo contario se tomara como 1.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.0
 @param n - corresponde al número.
 @return -Devuelven el recuento de la existencia del número 8 en n(número).
*/
public int count8(int n) {
    if(n==0){  //O(1)
        return 0; //O(1)
    }else{
    if(n%10==8){ //O(1)

        if((n/10)%10 == 8){ //O(1)
            return 2 + count8(n/10); // O(1)+ O(n/10)
        }else{
            return 1+count8(n/10); //  O(1) + O(n/10)
        } 

    }else{
        return count8(n/10);   //O(n/10)
    }
  }   
}

//O(1)+O(1)+O(1)+O(1)+O(1)+ O(n/10)+O(1) + O(n/10) +O(n/10) = C+ t(n/10), O(log n)
