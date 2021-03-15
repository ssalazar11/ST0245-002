//Excercises CodinBat (Array2)

public class array2{
  
//Exercise 1
  
 // Return the number of even ints in the given array. 
  
  @authors Samuel Salazar salazar/Carla Sofía Rendón
  @version 1
  @param nums is an array of integer numbers
  @return a counter with the number of even ints
    
  public int countEvens(int[] nums) {
    int contador=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]%2==0){
        contador++;
      }
    }
    return contador;
  }
  
  //Excercise 2
  
  /*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
  so it does not count and numbers that come immediately after a 13 also do not count.
  */
  @param nums is an array of integer numbers
  @return sum of numbers in the array
  
  public int sum13(int[] nums) {
    int suma=0;
    int i=0;
    while(i<nums.length){
      if(nums[i]==13){
        i+=2;
      }else{
        suma+=nums[i];
        i++;
      }
    }
    return suma;
  }
  
  /*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
*/
  
  @param nums is an array of integer numbers
  @return the difference between the largest and smallest values in the array
    
  public int bigDiff(int[] nums) {
    int maximo=nums[0];
    int minimo=nums[0];
    
    for(int i=1; i<nums.length; i++){
      minimo=Math.min(minimo,nums[i]);
      maximo=Math.max(maximo,nums[i]);
    }
    return maximo-minimo;
  }
  
  //Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
  @param nums is an array of integer numbers
  @return true if the sum of all the 2s in the array is 8
    
  public boolean sum28(int[] nums) {
    int suma=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]==2){
        suma+=nums[i];
      }
    }
    if(suma==8){
      return true;
    }else{
      return false;
    }
  }
  
/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array.
If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.
*/
  @param nums is an array of integer numbers
  @return the most centered average of the array
  
  public int centeredAverage(int[] nums) {
    int suma = 0;
    int maximo = nums[0];
    int minimo = nums[0];
         
    for(int i = 0; i < nums.length; i++) {
        suma += nums[i];
        minimo = Math.min(minimo, nums[i]);
        maximo = Math.max(maximo, nums[i]);
    }
                           
    return (suma - minimo - maximo) / (nums.length - 2);
}
}
