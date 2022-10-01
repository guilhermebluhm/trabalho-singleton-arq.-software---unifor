public class EntryPoint {

    public static void main(String[] args) {

        /*

        geração de instância única utilizando o padrão singleton a fim de manter a mesma referencia
        de memória, com o intuito proposto para o modelo de assento de avião dado que deve haver unicidade

        utilizei da estratégia de divisão em camadas por conta da questão da boa prática, no método da inserção
        dos elementos fiz uma garantia de checagem por conta dos beneficios trazidos pelo singleton tornando a
        seguinte linha de código possivel:

        if(aviao.getAssentosPreenchidos().stream().anyMatch(x -> x.equals(cadeira))){
            throw new RuntimeException("erro");
        }
        aviao.setAssentosPreenchidos(cadeira);

        checa se já existe uma string para o fluxo daquela referência de memória única, caso haja simplesmente
        gera um estouro e não permite sua inclusão.

        foi utilizado como detalhe adiciona a estrutura set a fim de reforçar a questão de não redundância e
        ordenação das posições

         */

        Aviao instanciaAviao = SingletonAviao.getInstance();
        AviaoImpl impl = new AviaoImpl();
        impl.inserirNovoAssento(instanciaAviao, "ACS1210");
        impl.inserirNovoAssento(instanciaAviao, "ACS1212");
        impl.inserirNovoAssento(instanciaAviao, "ACS1001");
        impl.listarAssentosCriados(instanciaAviao);

    }

}
