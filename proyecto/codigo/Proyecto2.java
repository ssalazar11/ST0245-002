import java.util.ArrayList;
public class Proyecto2{
public static void main(String[] args) {
ArrayList<int[]> foto = new ArrayList<int[]>();
ArrayList<int[]> fotoCompri = new ArrayList<int[]>();
int[] datos ={1,2,3,4,5};
foto.add(datos);
foto.add(datos); 
foto.add(datos);  
foto.add(datos);   
foto.add(datos); 

   
 for(int y = 0; y < foto.size();y++){
    
                for(int x = 0; x < foto.get(0).length;x++){

          
                    System.out.print("["+foto.get(y)[x]+"]");


        }
        System.out.println("");
       }
         System.out.println("              ");   


int fx = 0;
int cy= 0;  
int sum = 0;
int prom = 0;
int tamx = foto.get(0).length;
int nuevotamaño = tamx/2; 

   
for(int y=0;y<foto.size()-2;y = y+2){
 fx=0;
 int[] nuevotamx = new int[nuevotamaño];
for(int x=0;x<foto.get(0).length-2;x = x+2){  
 
   
 int pixel1 = foto.get(y)[x];
 int pixel2 = foto.get(y+1)[x];
 int pixel3 = foto.get(y)[x+1];      
 int pixel4 = foto.get(y+1)[x+1];
 
 sum = pixel1+pixel2+pixel3+pixel4;
       prom = sum / 4;
                                             
    
  nuevotamx[fx]=prom; 
  
   fx = fx + 1;
   
}   
   fotoCompri.add(cy,nuevotamx);
  cy = cy + 1; 
}   
   
   System.out.println(" ");
   
 for(int y = 0; y < fotoCompri.size();y++){
    
                for(int x = 0; x < fotoCompri.get(0).length;x++){

          
          System.out.print("["+fotoCompri.get(y)[x]+"]");


        }
        System.out.println("");
       }
         System.out.println("              ");   
   
   
   
   
   
   
   
   
   
   
   
   
   
  } 
  }