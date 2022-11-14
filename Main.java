import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*@author Matheus Martinelli
*14-11-2022
*/
public class Main {
    public static void main(String[] args) {
        List<Temperatura> temps = new ArrayList<>(){{
            add(new Temperatura(39, "Janeiro"));
            add(new Temperatura(40, "Fevereiro"));
            add(new Temperatura(35, "Março"));
            add(new Temperatura(21, "Abril"));
            add(new Temperatura(13, "Maio"));
            add(new Temperatura(20, "Junho"));
        }};

        int total = 0;
        for (Temperatura t:temps             ) {
            total+= t.getValor();
        }
        Integer media = total/temps.size();
        System.out.println("Média = "+media);
        System.out.println("\nMeses acima da média");

        for (Temperatura t:temps             ) {
            if (media <=t.getValor()) {
                System.out.println("Mês: "+t.getMes()+".\t Temperatura: "+t.getValor());
            }
        }
    }
}
