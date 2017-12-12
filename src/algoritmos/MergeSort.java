/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author Bryan
 */
public class MergeSort implements Algoritmo{
    // Fusiona dos subrays del array [].
    // El primer subarray es arr [l..m]
    // El segundo subarray es arr [m + 1..r]
    public void merge(int arr[], int l, int m, int r){
       // Encuentre tamaños de dos subárboles que se fusionarán
       int n1 = m - l + 1;
       int n2 = r - m;
       
       //crear arreglos temporales
        int L[] = new int [n1];
        int R[] = new int [n2];
       //copiar datos a arreglos temporales
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        //mezclar arreglos temporales
        //inicializar indices para el primer y segundo subarreglos
        int i = 0, j = 0;
         // Índice inicial del array de subarray fusionado
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        
        }
        // Copiar los elementos restantes de L [] si los hay 
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copiar los elementos restantes de R[] si los hay 
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Función principal que ordena arr [l..r] usando merge()
     public void sort(int arr[], int l, int r){
        if (l < r){
            // Encuentra el punto medio
            int m = (l+r)/2;
 
            // Clasificar las primeras y segundas mitades
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Combinar las mitades ordenadas
            merge(arr, l, m, r);
            
        }
      
    }
   public static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    @Override
    public void ordenar(double[] arreglo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTiempo_total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
