import java.io.FileReader; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
public class algoritmoCompres
{
public static void main(String[] args) {
  File dir = new File("C:/Users/Usuario/Documents/ganado");
  File[] leerDirectorio = dir.listFiles();
  if (leerDirectorio != null) {
           for (File archivo : leerDirectorio) {
               BufferedReader bufferLectura = null;
                 try {
                      bufferLectura = new BufferedReader(new FileReader(archivo));
                      String line = null;
                      ArrayList lista = new ArrayList();
                      while ((line = bufferLectura.readLine()) != null) {
                            line = bufferLectura.readLine();
                            System.out.println(line);
                            lista.add(line);
                      }
                 } 
                 catch (IOException e) {
                      e.printStackTrace();
                 }
                 finally {
                      if (bufferLectura != null) {
                           try {
                                bufferLectura.close();
                           } 
                           catch (IOException e) {
                                e.printStackTrace();
                           }
                  }
                }
             System.out.println("---------------------SE IMPRIMIO----------------------");
          }
  }else{
            //imprimir que el directorio no existe o esta mal escrito
   }
  }  
}






