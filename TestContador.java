public class TestContador {
    public static void main(String[] args) {
        Contador contador = new Contador();
        int i = 1;
        while (i <= 5) {
            contador.incrementar();
            i++;
        }
        contador.decrementar();
        System.out.println(contador.getContador());
    }
    
}
