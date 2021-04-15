import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class leerArchivo{
    public static void main(String[] args){
        //Al probar el programa, porfavor cambiar el pat
        String path="C:/Users/SAMUEL/imag98908es.csv";
        String linea=" ";
        try{
            BufferedReader br= new BufferedReader(new FileReader(path));
            ArrayList<Integer> datos=new ArrayList<Integer>();
            while((linea=br.readLine())!=null){
                String[] valores=linea.split(",");
                List<String> list=Arrays.asList(valores);
                System.out.println(list);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}