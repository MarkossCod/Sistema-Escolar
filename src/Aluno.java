import java.util.random.RandomGenerator;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private boolean matriculado;
    private  double nota1;
    private  double nota2;

    public Aluno(String nome,int idade, String curso ){
        this.nome=nome;
        this.idade=idade;
        this.curso=curso;
        this.matriculado=false;// começa sem estar matriculado
        this.nota1=0.0;
        this.nota2=0.0;
    }

    // Métodos getters e setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // get e set de idade
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //  get e set de curso
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    //get e set de matriculado
    public boolean getMatriculado(){
        return this.matriculado;
    }
    public void setMatriculado(boolean matriculado){
        this.matriculado=matriculado;
    }

    //get e set de nota1
    public double getNota1(){
        return this.nota1;
    }
    public void setNota1(double nota1){
        this.nota1=nota1;
    }

    //get e set de nota2
    public double getNota2(){
        return this.nota1;
    }
    public void setNota2(double nota2){
        this.nota2=nota2;
    }

    public void Matricular(){
        if (!this.matriculado) {
            this.matriculado = true;
            System.out.println("Aluno matriculado com sucesso!.");
        } else {
            System.out.println("Aluno já esta matriculado!");
            System.out.println("matricula cancelada!");
        }
    }

    public void cancelarMatricula(){
        if (!this.matriculado) {
            this.matriculado = true;
            System.out.println("Matricula cancelada");
        } else {
            System.out.println("Aluno já esta com a matricula inativa!");
        }
    }

    public void VerificarMaioridade(){
        if(this.idade<=18){
            System.out.println("Aluno é maior de idade!");
            System.out.println("Já esta disponivel para assinar contratos de outros cursos!");
        } else {
            System.out.println("Aluno é menor de idade!");
            System.out.println("Precisa de autorizão de um responsável!");
        }
    }

    public void cadastrarNotas(double n1, double n2){
        this.nota1=n1;
        this.nota2=n2;
        System.out.println("Notas cadastradas!!");
    }

    public double CalcularMedia() {
        if (this.nota1 <= 0 || this.nota2 <= 0) {
            System.out.println("As notas devem ser maiores que zero!");
            return 0;
        } else {
            double media = (this.nota1 + this.nota2) / 2;
            return media; // Retorna a média
        }
    }

    public void verificarAprovacao() {
        double media = CalcularMedia();
        if (media == -1) {
            System.out.println("Notas não cadastradas!");
        } else if (media >= 6) {
            System.out.println("Aluno aprovado para fazer o curso!!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }


}
