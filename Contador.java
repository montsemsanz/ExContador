
/**
 * Modela un contador
 * 
 * @author - montseaweb
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
        this.valor++;
         
    }
    
    /**
     * mutador, decrementa en uno el contador
     */
    public void decrementar()   {
        this.valor--;
             
    }
    
  
     /**
     * mutador, inicializa (hace un reset)
     * a 0 el contador
     */
    public void reset()    {
            valor = 0;
    }
    
    /**
     * 
     */
    public String toString() {
        return String.format("Contador: %4d", this.valor);
        
    }

    public static void main(String[] args) {
        Contador c = new Contador();
        for(int i = 1; i <= 10; i++) {
            c.incrementar();
        }
        System.out.println(c);
    }
    
    
    
}
