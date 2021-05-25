import java.io.*;

public class AlgoritSinPerdidas {
  public static final int DEFAULT_BUFF_SIZE = 1024;
  protected int tamBuffer;
  protected Reader mIn;
  protected PrintWriter mOut;
  protected StringBuffer BusquedaBuffer; 

  public AlgoritSinPerdidas() {
    this(DEFAULT_BUFF_SIZE);
  }
  
  public AlgoritSinPerdidas(int buffSize) {
    tamBuffer = buffSize;
    BusquedaBuffer = new StringBuffer(tamBuffer);
  }

  private void trimBusquedaBuffer() {
    if (BusquedaBuffer.length() > tamBuffer) {
      BusquedaBuffer = BusquedaBuffer.delete(0,  BusquedaBuffer.length() - tamBuffer);
    }
  }

 //////////////////////////////ALGORITMO DE COMPRESION DE IMAGENES CON PERDIDAS//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 public void AlgoritCompres(String infile) throws IOException {
    
    mIn = new BufferedReader(new FileReader(infile));
    mOut = new PrintWriter(new BufferedWriter(new FileWriter(infile+".lz77")));
    
    int nextChar;
    String actualtMatch = "";
    int matchIndice = 0; 
    int tempIndice = 0;

    
    while ((nextChar = mIn.read()) != -1) {
      
      tempIndice = BusquedaBuffer.indexOf(actualtMatch + (char)nextChar);
      
      if (tempIndice != -1) {
	actualtMatch += (char)nextChar;
	matchIndice = tempIndice;
      } else {
	
	String codedString = 
	  ""+matchIndice+"["+actualtMatch.length()+"]"+(char)nextChar;
	String concat = actualtMatch + (char)nextChar;
	
	if (codedString.length() <= concat.length()) {
	  mOut.print(codedString);
	  BusquedaBuffer.append(concat); 
	  actualtMatch = "";
	  matchIndice = 0;
	} else {
	  
	  actualtMatch = concat; matchIndice = -1;
	  while (actualtMatch.length() > 1 && matchIndice == -1) {
	    mOut.print(actualtMatch.charAt(0));
	    BusquedaBuffer.append(actualtMatch.charAt(0));
	    actualtMatch = actualtMatch.substring(1, actualtMatch.length());
	    matchIndice = BusquedaBuffer.indexOf(actualtMatch);
	  }
	}
	
	trimBusquedaBuffer();
      }
    }
    if (matchIndice != -1) {
      String codedString = 
	"["+matchIndice+"]"+actualtMatch.length();
      if (codedString.length() <= actualtMatch.length()) {
	mOut.print("["+matchIndice+"]"+actualtMatch.length());
      } else {
	mOut.print(actualtMatch);
      }
    }
    mIn.close();
    mOut.flush(); mOut.close();
  }
  
  public static void main(String [] args) {
    AlgoritSinPerdidas lz = new AlgoritSinPerdidas();
    String file = "C:/Users/Usuario/Documents/ganado/0.csv";
    try {
	lz.AlgoritCompres(file);
    } catch (FileNotFoundException f) {
      System.err.println("File not found: "+file);
    } catch (IOException e) {
      System.err.println("Problem processing file: "+file);
    }
  }
}