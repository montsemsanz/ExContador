
/**
 * Modela un contador
 * 
 * @author - mprog1920
 * @version 
 */
public class Contador {
    private int valor;

    /**
     * Constructorde la clase Contador
     */
    public Contador()   {  
       valor = 0;
    }
    
    /**
     * accesor
     */
    public int getContador()    {
        return valor;
    }
    
    /**
     * mutador, incrementa en uno el contador
     */
    public void incrementar()   {
         valor = valor + 1;
    }
    
    /**
     * mutador, decrementa en uno el contador
     */
    public void decrementar()   {
        valor = valor - 1;
    }
    
  
     /**
     * mutador, inicializa (hace un reset)
     * a 0 el contador
     */
    public void reset()    {
            valor = 0;
    }
    
    
    
    
}
