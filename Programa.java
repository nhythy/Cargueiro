import java.awt.Component;
import javax.swing.JOptionPane;


public class Programa
{
    public static void main(final String[] args) {
        final AviaoCargueiro aviao = new AviaoCargueiro();
        boolean encerrarPrograma = false;
        do {
            final double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da carga"));
            final String tipo = JOptionPane.showInputDialog("Digite o tipo da carga (simples|preciosa)");
            final Carga carga = new Carga(tipo, peso);
            aviao.armazenar(carga);
            final String enviarOutra = JOptionPane.showInputDialog("Deseja armazenar outra caixa? (s|n)");
            if (enviarOutra.equalsIgnoreCase("n")) {
                encerrarPrograma = true;
            }
        } while (!encerrarPrograma);
        if (aviao.getPesoTotal() >= 500.0) {
            JOptionPane.showMessageDialog(null, String.format("Cargueiro pronto para decolar com %s Kg", aviao.getPesoTotal()));
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("Cargueiro n\u00e3o pode decolar com apenas %s Kg", aviao.getPesoTotal()));
        }
    }
}
