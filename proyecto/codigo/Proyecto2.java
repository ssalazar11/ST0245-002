import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Proyecto2{
    public static void main(String[] args){
        //Al probar el programa, porfavor cambiar el pat
        ArrayList<int[]> foto = new ArrayList<int[]>();
        String path="C:/Users/Usuario/Documents/ganado/0.csv";
        String linea=" ";
        try{
            BufferedReader br= new BufferedReader(new FileReader(path));
            
            while((linea=br.readLine())!=null){
            String[] valores = linea.split(",");
            int[] elementos = new int[valores.length];
            for(int i = 0; i < valores.length; i++){
                
                int valor = Integer.parseInt(valores[i]);
                elementos[i] = valor;
            }
            foto.add(elementos);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
      
    /////////////////ALGORITMO DE COMPRESION DE IMAGENES///////////////////////////////////////////////////////////////////////////////////////////////////
   
ArrayList<int[]> fotoCompri = new ArrayList<int[]>();

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
   
 
   
 for(int y = 0; y < fotoCompri.size();y++){
    
                for(int x = 0; x < fotoCompri.get(0).length;x++){

          
          System.out.print("["+fotoCompri.get(y)[x]+"]");


        }
        System.out.println("");
       }
         System.out.println("    termino          ");   
   
   
   

   
   
   
   
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
