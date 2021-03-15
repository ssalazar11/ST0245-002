
/**
 * Laboratorio 2 de Estructuras de Datos 1
 * 
 * @author Samuel Salazar Salazar/Carla Sofía Rendón
 * @version 1
 */

import java.util.Arrays;

public class Laboratorio2
{

  
  // Sorts an array using Insertion Sort
  public static void InsertionSort(int[] arr)
  {
    int temp,j;
        for(int i=0; i<arr.length; i++){
            j=i;
            while(j>0 && arr[j-1]>arr[j]){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
  }

      // Sorts an array using Merge Sort
	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}

        // Sorts an array using Merge Sort
	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}
	}

    // Merges two sorted arrays
    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
	    int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    
            tmp[k++] = a[left++];

        while(right <= rightEnd)  
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
    }
  
  public static void main(String[] args)
  {
      int[] A = {1,5,3,2,6};
      int[] B = {1,5,3,2};
      int[] C = {1,5,2,6};
      int[][] Arrays = {A,B,C};  
      for (int[] X : Arrays)
      {        
        Laboratory1.mergeSort(X);
        Laboratory1.InsertionSort(X);     
      }
  }
  
}
