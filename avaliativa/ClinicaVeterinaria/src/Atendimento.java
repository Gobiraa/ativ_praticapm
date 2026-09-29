import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum StatusAtendimento {
AGENDADO, EM_ANDAMENTO, FINALIZADO
}

class Atendimento {
    private String codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private LocalDate data;
    private LocalTime horario;
    private StatusAtendimento status;
    private String observacoes;
    private Procedimento procedimento;

    public Atendimento(String codigo, String nomeAnimal, String especie, String nomeTutor,
            LocalDate data, LocalTime horario, Procedimento procedimento) {
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.horario = horario;
        this.status = StatusAtendimento.AGENDADO; 
        this.procedimento = procedimento;
    }

        public void cadastrarAtendimento(Scanner scanner) {
        System.out.println("Codigo atendimento: ");
        codigo = scanner.nextLine().trim();
        System.out.println("\nNome animal: ");
        nomeAnimal = scanner.nextLine().trim();
        System.out.println("\nEspecie: ");
        especie = scanner.nextLine().trim();
        System.out.println("\nNome tutor: ");
        nomeTutor = scanner.nextLine().trim();
        System.out.println("\nData: ");
        data = scanner.nextDouble();
        System.out.println("\nHora: ");
        data = scanner.nextInt();
        System.out.println("\nData: ");
        String StatusAtendimento = scanner.nextLine().trim();
        System.out.println("\nObservacoes: ");
        observacoes = scanner.nextLine().trim();
        System.out.println("\nProcedimento: ");
        procedimento = scanner.nextLine().trim();

    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public StatusAtendimento getStatus() {
        return status;
    }

    public void setStatus(StatusAtendimento status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }
}