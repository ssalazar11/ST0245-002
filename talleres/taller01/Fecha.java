

public class Fecha {
     private int dia;
     private int mes ;
     private int anio;
   
   public Fecha(int d,int m,int a){
        
        this.dia=d;
        this.mes=m;
        this.anio=a;    
  
    }   
   
    public  int  dia () {
         
        return this.dia;
    }

    public  int  mes () {
        
        return this.mes;
    }

    public  int  anio () {
            
         return this.anio;
    }
         String sA = String.valueOf(this.dia);
         String sB = String.valueOf(this.mes);
         String sC = String.valueOf(this.anio);
    
         String cadena = sA+sB+sC;
         int resultado = Integer.parseInt(cadena);
    public  int  comparar (Fecha otra) {
         String sD = String.valueOf(otra.dia);
         String sE = String.valueOf(otra.mes);
         String sF = String.valueOf(otra.anio);
         String cadena2 = sD+sE+sF;
         int resultado2 = Integer.parseInt(cadena2);
 
    if(resultado < resultado2){
        return -1;
    }else if(resultado == resultado2){
        return 0;
    }else{
        return 1;
    }

}

public String toString() {
    String fecha = this.dia+"/"+this.mes+"/"+this.anio;
   return fecha;
}
}


