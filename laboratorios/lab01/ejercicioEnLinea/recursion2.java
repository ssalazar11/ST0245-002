@author Samuel Salazar, Carla Sofia Rendon
@version 1

@param start es el valor inicial
@param nums es el arreglo de numeros enteros
@param target es el valor objetivo
@return verdadero si las sumas de los enteros es igual al falso, de lo contrario retornar un falso

public boolean groupSum6(int start, int[] nums, int target) {
  if(start >= nums.length)
        return target == 0;
          
    if(nums[start] == 6)
        return groupSum6(start+1, nums, target - 6);
                    
    if(groupSum6(start+1, nums, target - nums[start]))
        return true;
                              
    if(groupSum6(start+1, nums, target))
        return true;
                                        
    return false;
}

@param start es el valor inicial
@param nums es el arreglo de numeros enteros
@param mult es donde se guarda el grupo con multiplo a diez
@param odd es la variable donde se guarda el grupo impar
@return verdadero si la suma de grupo uno es un multiplo de cinco y si la suma del grupo dos es impar, de lo contrario retornar un falso

public boolean splitOdd10(int[] nums) {
   return splitOdd10Helper(0, nums, 0, 0);
}

public boolean splitOdd10Helper(int start, int[] nums, int mult, int odd) {
    if(start >= nums.length)
        return mult % 10 == 0 && odd % 2 == 1;
            
    if(splitOdd10Helper(start+1, nums, mult + nums[start], odd))
        return true;
                      
    if(splitOdd10Helper(start+1, nums, mult, odd + nums[start]))
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
  
