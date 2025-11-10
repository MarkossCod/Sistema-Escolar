import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Digite o curso do aluno: ");
        String curso = sc.nextLine();

        // Cria o objeto Aluno
        Aluno aluno = new Aluno(nome, idade, curso);

        // Pergunta se está matriculado
        System.out.print("O aluno está matriculado em algum curso? (s/n): ");
        char resposta = sc.next().toLowerCase().charAt(0);

        if (resposta == 's') {
            aluno.Matricular();
        } else {
            aluno.cancelarMatricula();
        }

        // Cadastro das notas
        System.out.print("Digite o valor da primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite o valor da segunda nota: ");
        double nota2 = sc.nextDouble();

        aluno.cadastrarNotas(nota1, nota2);

        // Exibe informações do aluno
        System.out.println("\n===== INFORMAÇÕES DO ALUNO =====");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Matriculado: " + (aluno.getMatriculado() ? "Sim" : "Não"));

        double media = aluno.CalcularMedia();
        if(media != -1) {
            System.out.println("Média: " + media);
        }

        // Verifica se é maior de idade
        aluno.VerificarMaioridade();

        // Verifica se foi aprovado
        aluno.verificarAprovacao();

        sc.close();
    }
}
