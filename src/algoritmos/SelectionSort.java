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
public class SelectionSort implements Algoritmo{
    private double tiempo_inicial;
    private double tiempo_final;
    private double tiempo_total;
    private int intercambios;
    private int comparaciones;
    
    public SelectionSort(){
        this.tiempo_inicial = 0;
        this.tiempo_final = 0;
        this.tiempo_total = 0;
        this.comparaciones = 0;
        this.intercambios = 0;
    }
    public void ordenar(double[] arreglo){
          double menor, tmp;
          int pos;
          this.tiempo_inicial = System.currentTimeMillis();
          for (int i = 0; i < arreglo.length - 1; i++) { // tomamos como menor el primero
                menor = arreglo[i]; // de los elementos que quedan por ordenar
                pos = i; // y guardamos su posición
                
                for (int j = i + 1; j < arreglo.length; j++){ // buscamos en el resto
                         this.comparaciones++;
                      if (arreglo[j] < menor) { // del array algún elemento
                          menor = arreglo[j]; // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){ // si hay alguno menor se intercambia
                    this.comparaciones++;
                    this.intercambios++; 
                    tmp = arreglo[i];
                    arreglo[i] = arreglo[pos];
                    arreglo[pos] = tmp;
                }
          }
           //ya termino 
          this.tiempo_final = System.currentTimeMillis();
          this.tiempo_total = this.tiempo_final - this.tiempo_inicial;
    }

    @Override
    public double getTiempo_total() {
        return tiempo_total;
    }
    
}
