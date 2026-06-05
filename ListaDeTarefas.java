import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== LISTA DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = sc.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + " - " + tarefas.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Número da tarefa para remover: ");
                    int indice = sc.nextInt();

                    if (indice > 0 && indice <= tarefas.size()) {
                        tarefas.remove(indice - 1);
                        System.out.println("Tarefa removida!");
                    }
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
