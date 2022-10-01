import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Aviao {

    private Integer id;
    private String companhaAerea;
    private Integer assentos;
    private Set<String> assentosPreenchidos = new HashSet<>();

    public Aviao(){
        this.id = 109;
        this.companhaAerea = "arrombados air line";
        this.assentos = 50;
    }

    public Integer getId() {
        return id;
    }

    public String getCompanhaAerea() {
        return companhaAerea;
    }

    public Integer getAssentos() {
        return assentos;
    }

    public Set<String> getAssentosPreenchidos() {
        return assentosPreenchidos;
    }

    public void setAssentosPreenchidos(String assentosLivres) {
        this.assentosPreenchidos.add(assentosLivres);
    }
}
