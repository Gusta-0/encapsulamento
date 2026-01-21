package Encapsulamento;

public class Elevador {

    int andarAtual;
    int totalAndares = 10;
    Double capacidade = 680.0;
    int pessoasPresentes;

    public Elevador(int totalAndares, Double capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public Boolean Entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            return true;
        } else {
            return false;
        }
    }

    public Boolean Sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            return true;
        } else {
            return false;
        }
    }

    public Boolean Subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            return true;
        } else {
            return false;
        }
    }

    public Boolean Descer() {
        if (andarAtual > 0) {
            andarAtual--;
            return true;
        } else {
            return false;
        }
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
