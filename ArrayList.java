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
        if (index <= listaLista.length && index >=0 )
        {
            int[] listaTonta = listaLista;
            listaLista = new int[listaTonta.length + 1];
            for (int count = 0; count < listaTonta.length; count ++)
            {
                if (index < count)
                {
                    listaLista[count] = listaTonta[count];
                }
                else 
                {
                    listaLista[count + 1] = listaTonta[count];
                }
             }
             listaLista[index] = elemento;
         }
    }
    
    /**
     * vacía la colección
     */
    public void clear()
    {
        listaLista = new int [0];
    }
    
    /**
     * devuelve true si la colección contiene ese elemento, false en cualquier otro caso.
     */
    public boolean contains(int elemento)
    {
        boolean objeto = false;
        int cont = 0;
        while(!false && cont < listaLista.length)
        {
            if (listaLista[cont] == elemento)
            {
                objeto = true;
            }
            cont++;
        }
        return objeto;
    }
    
    /**
     *  devuelve el elemento existente en la posición indicada. 
     *  Si el valor de index no es válido, entonces devuelve -1.
     */
    public int get(int index)
    {
        int objeto = 0;
        if (index < listaLista.length && index > 0)
        {
            objeto = listaLista[index];
        }
        else
        {
            objeto = -1;
        }
        return objeto;
    }
    
    /**
     * reemplaza el elemento en la posición index con el valor de element.
     * Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element)
    {
        if (index < listaLista.length && index >= 0)
        {
            listaLista[index] = element;
        }
    }
    
    /**
     *  devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {
        int index = 0;
        int cont = 0;
        if (contains(elemento))
        {
            while (cont < listaLista.length)
            {
                if (listaLista[cont] == elemento)
                {
                    index = cont;
                }
                cont++;
            }
        }
        else
        {
            index = -1;
        }
        return index;
    }
    
    /**
     * devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        return listaLista.length == 0;
    }
    
    /**
     * elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento.
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index)
    {
        int eliminado = 0;
        if (index <= listaLista.length && index >=0)
        {
            int[] listaTonta = listaLista;
            listaLista = new int[listaTonta.length - 1];
            for (int count = 0; count < listaLista.length; count ++)
            {
                if (index < count)
                {
                    listaLista[count] = listaTonta[count];
                }
                else 
                {
                    listaLista[count] = listaTonta[count + 1];
                }
             }
             eliminado = listaTonta[index];
         }
         else
         {
             eliminado = -1;
            }
        return eliminado;
    }
    
    /**
     * devuelve el número de elementos de la colección.
     */
    public int size()
    {
        return listaLista.length;
    }
}
