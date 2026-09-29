import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sala {
    private int numero;
    private String bloco;
    private int capacidadeMaxima;
    private String tipoSala;
    private Veterinario veterinarioResponsavel;
    private List<Atendimento> atendimentos;

    public Sala(int numero, String bloco, int capacidadeMaxima, String tipoSala, Veterinario veterinarioResponsavel) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidadeMaxima = capacidadeMaxima;
        this.tipoSala = tipoSala;
        this.veterinarioResponsavel = veterinarioResponsavel;
        this.atendimentos = new ArrayList<>();
    }

    public void agendarAtendimento(Atendimento novoAtendimento) {
        // Verifica capacidade
        if (atendimentos.size() >= capacidadeMaxima) {
            System.out.println("Capacidade maxima atingida");
        }

        // Verifica se o procedimento eh o mesmo dos atendimentos
        if (!atendimentos.isEmpty()) {
            Procedimento procedimentoDaSala = ((Atendimento) atendimentos).getProcedimento();
            if (!procedimentoDaSala.equals(novoAtendimento.getProcedimento())) {
                System.out.println("Sala bloqueada para atendimento");
            }
        }

        atendimentos.add(novoAtendimento);
        System.out.println(
                "Atendimento agendano na Sala: " + numero);
    }
    //lista atenimentos
    public void listarAtendimentos() {
        System.out.println(
                "\n Atendimentos na Sala " + numero + " (Resp: " + veterinarioResponsavel.getNome() + ")");
        if (atendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento agendado");
            return;
        }
        for (Atendimento a : atendimentos) {
            System.out.println("Animal: " + a.getNomeAnimal() + " | Procedimento: " + a.getProcedimento().getNome()
                    + " | Status: " + a.getStatus());
        }
    }
}