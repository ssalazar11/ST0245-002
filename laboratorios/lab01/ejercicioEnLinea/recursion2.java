@author Samuel Salazar, Carla Sofia Rendon
@version 1

@param start es el valor inicial
@param nums es el arreglo de numeros enteros
@param target es el valor objetivo
@return verdadero si las sumas de los enteros es igual al falso, de lo contrario retornar un falso

public boolean groupSum5(int start, int[] nums, int target) {
    if(start >= nums.length)   //c1=4
          return target == 0; 
      if(nums[start] % 5 == 0) {
          if(start <= nums.length - 2 && nums[start+1] == 1)
              return groupSum5(start+2, nums, target - nums[start]);
          return groupSum5(start+1, nums, target - nums[start]);
      }
      if(groupSum5(start+1, nums, target - nums[start]))
          return true;
      if(groupSum5(start+1, nums, target))
          return true;
      return false;
  }

@param start es el valor inicial
@param nums es el arreglo de numeros enteros
@param target es el valor objetivo
@return verdadero si la sumas del arreglo son igual al objetivo, de lo contrario retornar un falso

public boolean groupSumClump(int start, int[] nums, int target) {
    if(start >= nums.length)
          return target == 0; //c1=4
            
      int i = start; //c2=1
      int sum = 0; //c3=1
      
      while(i < nums.length && nums[start] == nums[i]) {
          sum += nums[i]; //c4=7
          i++;
      }
                                
      if(groupSumClump(i, nums, target - sum))
          return true; //c5=3
                                          
      if(groupSumClump(i, nums, target))
          return true;
                                                    
      return false;
  }

@param start es el valor inicial
@param nums es el arreglo con los enteros
@param mult5 es el grupo de multiplos de 5
@param mult3 es el grupo de multiplos que 3 y que no son del 5
@return verdadero si la suma de los dos grupos son iguales, de lo contrario retornar un falso

public boolean split53(int[] nums) {
    return split53Helper(0, nums, 0, 0);
  }
  public boolean split53Helper(int start, int[] nums, int mult5, int mult3) {
      if(start >= nums.length)
          return mult5 == mult3;
              
      if(nums[start] % 5 == 0)
          return split53Helper(start+1, nums, mult5 + nums[start], mult3);
                        
      if(nums[start] % 3 == 0)
          return split53Helper(start+1, nums, mult5, mult3 + nums[start]);
                                  
      if(split53Helper(start+1, nums, mult5 + nums[start], mult3))
          return true;
                                            
      if(split53Helper(start+1, nums, mult5, mult3 + nums[start]))
          return true;
                                                      
      return false;
  }
@param start es el valor inicial
@param nums es el arreglo de los enteros
@param target es el valor objetivo
@return verdadero si la suma del grupo es igual al valor objetivo, de lo contrario retornar falso
public boolean groupNoAdj(int start, int[] nums, int target) {
    if(start >= nums.length)
          return target == 0;
            
      if(groupNoAdj(start+2, nums, target - nums[start]))
          return true;
                      
      if(groupNoAdj(start+1, nums, target))
          return true;
                                
      return false;
  }
@param start es el valor inicial
@param nums es el arreglo de los enteros
@param group1 es uno de los grupos divididos
@param group2 es el otro grupo divididos
@return verdadero si la suma de los dos grupos es igual, de lo contrario retornar un falso

public boolean splitArray(int[] nums) {
    return splitArrayHelper(0, nums, 0, 0);
  }
  
  public boolean splitArrayHelper(int start, int[] nums, int group1, 
      int group2) {
      if(start >= nums.length)
          return group1 == group2;
              
      if(splitArrayHelper(start+1, nums, group1 + nums[start], group2))
          return true;
                        
      if(splitArrayHelper(start+1, nums, group1, group2 + nums[start]))
          return true;
                                  
      return false;
  }
  
