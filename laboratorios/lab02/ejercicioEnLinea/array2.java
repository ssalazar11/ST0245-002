public class array2{

  public int countEvens(int[] nums) {
    int contador=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]%2==0){
        contador++;
      }
    }
    return contador;
  }

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

  public int bigDiff(int[] nums) {
    int maximo=nums[0];
    int minimo=nums[0];
    
    for(int i=1; i<nums.length; i++){
      minimo=Math.min(minimo,nums[i]);
      maximo=Math.max(maximo,nums[i]);
    }
    return maximo-minimo;
  }


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