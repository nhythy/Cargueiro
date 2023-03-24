import java.awt.Component;
import javax.swing.JOptionPane;


public class Compartimento
{
    private String nome;
    private double capacidade;
    private Carga[] cargas;
    private int index;
    private double peso;
    
    public Compartimento(final double capacidade, final String nome) {
        this.cargas = new Carga[20];
        this.index = 0;
        this.peso = 0.0;
        this.capacidade = capacidade;
        this.nome = nome;
    }
    
    public void armazenar(final Carga carga) {
        if (this.temEspaco(carga)) {
            this.cargas[this.index] = carga;
            ++this.index;
            this.capacidade -= carga.getPeso();
            final String resposta = String.format("Carga de %s Kg armazenada em %s \n N\u00famero de rastreamento: %s \n Capacidade dispon\u00edvel: %s", carga.getPeso(), this.nome, carga.getNumeroRastreio(), this.capacidade);
            JOptionPane.showMessageDialog(null, resposta);
            this.peso += carga.getPeso();
        }
    }
    
    public boolean temEspaco(final Carga carga) {
        return this.capacidade >= carga.getPeso();
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getCapacidade() {
        return this.capacidade;
    }
    
    public double getPeso() {
        return this.peso;
    }
}
