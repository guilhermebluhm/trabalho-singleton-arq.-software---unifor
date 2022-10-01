import java.util.Arrays;

public class AviaoImpl implements AviaoService {

    @Override
    public void inserirNovoAssento(Aviao aviao, String cadeira) {

        if(aviao.getAssentosPreenchidos().stream().anyMatch(x -> x.equals(cadeira))){
            throw new RuntimeException("erro");
        }

        aviao.setAssentosPreenchidos(cadeira);

    }

    @Override
    public void listarAssentosCriados(Aviao aviao) {

        aviao.getAssentosPreenchidos().forEach(x -> System.out.println("Assento: " + x));

    }

}
