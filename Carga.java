
public class Carga
{
    private String tipo;
    private int numeroRastreio;
    private double peso;
    private static int contador;
    
    static {
        Carga.contador = 0;
    }
    
    public Carga(final String tipo, final double peso) {
        this.tipo = tipo;
        this.peso = peso;
        ++Carga.contador;
        this.numeroRastreio = Carga.contador;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }
    
    public int getNumeroRastreio() {
        return this.numeroRastreio;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(final double peso) {
        this.peso = peso;
    }
}
