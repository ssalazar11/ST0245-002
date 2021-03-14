//Exercises CoginBat (Array3)

//Exercise 1((maxSpan))

/*Calculate the largest existing interval in the array, in other words, it should return
a number, which will be related to the size of the interval of the largest number..
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.2
 @param nums - is an array in which a series of numbers are contained,
 which will take into account its greater interval.
 @return -The number in the interval of the larger number.
*/
public int maxSpan(int[] nums) {
    int max = 0; //O(1)
    int min = 0; //O(1)
    if(nums.length == 0){ //O(1)
    return 0; //O(1)
    }
    if(nums[0] == nums[nums.length-1]){ //O(1)
        max = nums.length; //O(1)
    }
      for(int i = 0; i < nums.length; i++){ //O(n) //////(2n+2)
          for(int j = i+1; j < nums.length; j++){ //O(n) /////// (2n+2)*n /////////// (the for's are nested)
            if(nums[i] == nums[j]){ //O(1)
             min = j;
             if(min>max){ //O(1)
                max=min; 
             }
            }
         }
      }
      return max; //O(1)
    }
    //Complexity = O(1)+O(1)+O(1)+O(1)+O(1)+O(1)+O(n)+O(n) = O(1)+O(n˄2) = O(n˄2)

    //Exercise 2((canBalance))

/*It must be calculated whether or not there is a balance in an array, so that the array is divided in two,
and that its both parts are equal in case it is balanced.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.2
 @param nums - is an array in which a series of numbers are contained, which will be split in two to determine if there is a balance or not.
 @param part1 - is one of the parts of the array which will be added to determine if the array is balanced.
 @param part2 - is the second of the array parts which will be added to determine if the array is balanced.
 @param balance - shows the answer, that is, if it is true or false that there is a balance..
 @return -It will return a true or false boolean depending on whether there is a balance or not.
*/
    
    public boolean canBalance(int[] nums) {
      int part1 = 0; //O(1)
      int part2 = 0; //O(1)
      boolean balance = false; //O(1)
      for(int i = 0; i < nums.length; i++){ //O(n)
          part2 = part2 + nums[i];
      }              
      for(int i = 0; i <= nums.length - 2; i++) { //O(n) ////(the for are not nested) 
      
          part1 = part1 +nums[i];
          part2 = part2 -nums[i];
                              
          if(part1 == part2){ //O(1)
              balance=true;   //O(1)
            
    
       }
  
  }
  return balance;
  }
//Complexity = O(1)+O(1)+O(1)+O(1)+O(1)+O(1)+O(n)+O(n) = O(1)+O(n) = O(n) 

/*Given an internal and an external array, calculate if the internal array contains
all the numbers in the outer array, taking into account that the arrays are already organized.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.0
 @param outer - is the external array,where it will be evaluated if the 
 values ​​of the internal array are in the external
 @param inner - is the internal array
 @param cont- It is a parameter that will be in charge of adding each time that a number of the internal array is entered in the external array.
 @param r - shows the answer, that is, if it is true or false .
 @return -returns whether it is true or not that the internal array values ​​
 are contained in all the external array values.
*/
  public boolean linearIn(int[] outer, int[] inner) {
    int cont = 0; //O(1)
    boolean r = false; //O(1)
    for(int i = 0; i < inner.length; i++){ //O(n) //////(2n+2)
    for(int j = 0; j < outer.length; j++){ //O(n) /////// (2n+2)*n ///////// (the for's are nested)
    if(inner[i] == outer[j]){ //O(1)
    cont=cont+1; 
    break;
   
    }
    }
}
if(cont == (inner.length)){   //O(1) 
    r = true;
    }else{ 
    r= false;    
    }
return r;   /// O(1)
         
}
//Complexity = O(1)+O(1)+O(1)+O(1)+O(1)+O(1)+O(n)+O(n) =O(1)+O(n˄2) = O(n˄2) 

/*Create an array with a series of patterns that are defined by a number,
 and that number will be the subgroups contained in the array which always start with a 1.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.0
 @param n - is a number that will determine the subgroups of the array.
 @param po - determine array position.
 @return -returns an array with the organized subgroups and their defined pattern.
*/

public int[] seriesUp(int n) {
  int[] lon = new int[n * (n + 1) / 2]; /// O(1)
    int po = 0; /// O(1)
    for(int i = 1; i <= n; i++) { //O(n) //////(2n+2)
        for(int j = 1; j <(i+1) ; j++){  //O(n) /////// (2n+2)*n ///////// (the for's are nested)
           lon[po] = j;
           po= po+1;
    }
}
                              
    return lon; /// O(1)
}

//Complexity = O(1)+O(1)+)+O(1)+O(1)+O(n)+O(n) =O(1)+O(n˄2) = O(n˄2)

/*create the length of an array with a series of patterns that are defined by a number,
 and that number will be the subgroups contained in the matrix that always start with a 0,
 and the 0 will serve as a kind of filling until reaching the number.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.0
 @param n - is a number that will determine the subgroups of the length of the array
 @return -returns an array with the organized subgroups and their pattern defined by length.
*/
public  int [] squareUp ( int n) {
  int[] lon = new int[n*n];  /// O(1)
         
  for(int i = 0; i < n; i++) {  //What subgroup is it in //O(n) ///(2n+2)
      for(int j = 0; j < n ; j++){ //run the subgroups //O(n) /// (2n+2)*n ///////// (the for's are nested)
          if(j < n -i -1)    /// O(1)
          
          continue;          /// O(1)
         
          
          lon[i * n + j] = n - j;
  }
}
                            
  return lon;      /// O(1)
         
}

//Complexity = O(1)+O(1)+)+O(1)+O(1)+O(n)+O(n) =O(1)+O(n˄2) = O(n˄2)