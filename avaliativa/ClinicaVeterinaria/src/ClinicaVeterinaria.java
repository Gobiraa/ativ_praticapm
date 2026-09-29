import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClinicaVeterinaria {
    public static void main(String[] args) {
        Veterinario vet1 = new Veterinario("Dr. Carlos", "111.222.333-44", "Cirurgião", "31999999999");

        Sala salaCirurgia = new Sala(101, "Bloco A", 2, "Cirúrgica", vet1);

        Procedimento castracao = new Procedimento("Castração", LocalTime.of(1, 30), 450.00, "Média");
        Procedimento limpezaTartaro = new Procedimento("Limpeza de Tártaro", LocalTime.of(0, 45), 200.00, "Baixa");

        Atendimento at1 = new Atendimento("ATD001", "Rex", "Cachorro", "João", LocalDate.now(), LocalTime.of(14, 0),
                castracao);
        Atendimento at2 = new Atendimento("ATD002", "Miau", "Gato", "Maria", LocalDate.now(), LocalTime.of(15, 30),
                castracao);
        Atendimento at3 = new Atendimento("ATD003", "Bolinha", "Cachorro", "Pedro", LocalDate.now(),
                LocalTime.of(17, 0), limpezaTartaro);


        System.out.println("- Menu -\n");
        System.out.println("\n1 - Cadastrar Atendimento");
        System.out.println("\n2 - Associar veterinario");
        System.out.println("\n3 - Atribuir atendimentos a uma sala");
        System.out.println("\n4 - Atendimentos atribuidos a uma sala");
        System.out.println("\n5 - Atendimentos totais de uma sala ");
        System.out.println("\n6 - Buscar atendimentos por status");
        System.out.println("\n7 - Detalhes de um atendimento\n");

        Atendimento atend = new Atendimento(null, null, null, null, null, null, limpezaTartaro);

        int opc;
        switch(opc) {
            case 1:
                atend.cadastrarAtendimento(null);
            break;
            case 2:
            
            break;
            case 3:

            break;

            case 4:
                salaCirurgia.listarAtendimentos();
            break;
            case 5:

            break;

            case 6:

            break;

            case 7:

            break;

        }


    }

}
