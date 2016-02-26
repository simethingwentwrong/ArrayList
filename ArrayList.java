import java.util.Arrays;
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayList
{
    // instance variables - replace the example below with your own
   private int[] listaLista;
    /**
     * Constructor for objects of class ArrayList
     */
    public ArrayList()
    {
     listaLista = new int [0];
    }

    /**
     *  añade un elemento a la colección al final de la misma.
     */
    public void add(int elemento)
    {
     int[] listaTonta = listaLista;
     listaLista = new int[listaTonta.length + 1];
     for( int count = 0; count < listaTonta.length; count++)
     {
      listaLista[count] = listaTonta[count];   
     }
     listaLista[listaTonta.length] = elemento;
    }
    
    /**
     * añade un elemento a la colección en la posición especificada por el parámetro index.
     * Si el valor de index no es válido, entonces no hace nada. 
     * Los elementos a continuación del añadido se desplazan una posición.
     */
    public void add(int index, int elemento)
    {
        
    }
    
    /**
     * vacía la colección
     */
    public void clear()
    {
        
    }
    
    /**
     * devuelve true si la colección contiene ese elemento, false en cualquier otro caso.
     */
    public void contains(int elemento)
    {
        
    }
    
    /**
     *  devuelve el elemento existente en la posición indicada. 
     *  Si el valor de index no es válido, entonces devuelve -1.
     */
    public void get(int index)
    {
        
    }
    
    /**
     * reemplaza el elemento en la posición index con el valor de element.
     * Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element)
    {
        
    }
    
    /**
     *  devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public void indexOf(int elemento)
    {
        
    }
    
    /**
     * devuelve true si la lista no contiene elementos.
     */
    public void isEmpty()
    {
        
    }
    
    /**
     * elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento.
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public void remove(int index)
    {
        
    }
    
    /**
     * devuelve el número de elementos de la colección.
     */
    public void size()
    {
        
    }
}
