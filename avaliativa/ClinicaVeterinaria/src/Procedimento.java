import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Procedimento {
    private String nome;
    private LocalTime duracaoEstimada;
    private double valor;
    private String nivelComplexidade;

    public Procedimento(String nome, LocalTime duracaoEstimada, double valor, String nivelComplexidade) {
        this.nome = nome;
        this.duracaoEstimada = duracaoEstimada;
        this.valor = valor;
        this.nivelComplexidade = nivelComplexidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(LocalTime duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNivelComplexidade() {
        return nivelComplexidade;
    }

    public void setNivelComplexidade(String nivelComplexidade) {
        this.nivelComplexidade = nivelComplexidade;
    }

    public String getNome() {
        return nome;
    }

}
