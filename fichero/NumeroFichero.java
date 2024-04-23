
/**
 * Write a description of class NumeroFichero here.
 * 
 * @author Mario Quispe 
 * @version 20240410
 */
public class NumeroFichero {
    private int valor;

    public NumeroFichero(int valorInicial) {
        this.valor = valorInicial;
    }

    
    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        valor--;
    }

    public int valor() {
        return valor;
    }

    
    public static void main(String[] args) {
        NumeroFichero numero = new NumeroFichero(10); 
        System.out.println("Valor inicial: " + numero.valor()); 
        
        numero.incrementar(); 
        System.out.println("Después de incrementar: " + numero.valor()); 
        
        numero.decrementar();
        System.out.println("Después de decrementar: " + numero.valor()); 
    }
}
