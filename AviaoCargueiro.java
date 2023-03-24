import java.awt.Component;
import javax.swing.JOptionPane;


public class AviaoCargueiro
{
    private Compartimento compartimentoPrincipal;
    private Compartimento compartimentoAuxiliar;
    private Compartimento compartimentoPrecioso;
    
    public AviaoCargueiro() {
        this.compartimentoPrincipal = new Compartimento(833.0, "Compartimento Principal");
        this.compartimentoAuxiliar = new Compartimento(222.0, "Compartimento Auxiliar");
        this.compartimentoPrecioso = new Compartimento(21.0, "Compartimento Precioso");
    }
    
    public void armazenar(final Carga carga) {
        if (carga.getTipo().equals("simples")) {
            if (this.compartimentoPrincipal.temEspaco(carga)) {
                this.compartimentoPrincipal.armazenar(carga);
            }
            else if (this.compartimentoAuxiliar.temEspaco(carga)) {
                this.compartimentoAuxiliar.armazenar(carga);
            }
            else {
                JOptionPane.showMessageDialog(null, "Espa\u00e7o esgotado");
            }
        }
        else if (this.compartimentoPrecioso.temEspaco(carga)) {
            this.compartimentoPrecioso.armazenar(carga);
        }
        else {
            JOptionPane.showMessageDialog(null, "Espa\u00e7o esgotado");
        }
    }
    
    public double getPesoTotal() {
        final double pesoTotalPrincipal = this.compartimentoPrincipal.getPeso();
        final double pesoTotaAux = this.compartimentoAuxiliar.getPeso();
        final double pesoTotalPrecioso = this.compartimentoPrecioso.getPeso();
        return pesoTotalPrincipal + pesoTotaAux + pesoTotalPrecioso;
    }
}
