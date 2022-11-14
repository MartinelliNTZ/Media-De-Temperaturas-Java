/**
 * @author Matheus Martinelli
 * 14-11-2022
 */
public class Temperatura {
    private int valor;
    private String mes;

    public Temperatura(int valor, String mes) {
        this.valor = valor;
        this.mes = mes;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "valor=" + valor +
                ", mes='" + mes + '\'' +
                '}';
    }
}
