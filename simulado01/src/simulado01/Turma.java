package simulado01;

public class Turma {
	protected String codigoTurma;
    protected Aluno[] alunos;

    //construtor que recebe parâmetros para inicializar todos os atributos
    public Turma(String codigoTurma, int maxAlunos) {
        this.codigoTurma = codigoTurma;
        this.alunos = new Aluno[maxAlunos];
    }

    //getters e setters
    public String getCodigoTurma(){
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma){
        this.codigoTurma = codigoTurma;
    }

    public Aluno[] getAluno(){
        return alunos;
    }

    public void setAluno(Aluno[] alunos){
        this.alunos = alunos;
    }

    //método para inserir aluno na primeira posição livre do array
    public boolean insereAluno(Aluno novoaluno){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){ //verifica se a posição está livre
                alunos[i] = novoaluno;
                return true; //significa que a inserção foi bem-sucedida
            }
        }
        return false; //significa que não há posições livres para inserir aluno
    }

    //método para calcular a média de notas finais de todos os alunos presentes no array
    public double mediaNotasTurma(){ 
        double somaNotas = 0.0; //contador de notas
        double mediaAlunos;
        int quantidadeAlunos = 0; //contador de alunos

        for(int i=0; i<alunos.length; i++){
            somaNotas += alunos[i].calculaNotaFinal();
            quantidadeAlunos++;
        }

        if (quantidadeAlunos > 0) {
            mediaAlunos = somaNotas / quantidadeAlunos;
            return mediaAlunos;
        }
        else {
            return -1; 
        }
    }

    //método para alterar notas do Grau A
    public void alteraNotasGrauA (String nome, double notaProva, double notaTrabalho){
        for(int i=0; i < alunos.length; i++){
            if (alunos[i] != null && alunos [i].getNome().equalsIgnoreCase(nome)) {
                if (alunos[i].getGa() instanceof GrauA) {
                    GrauA ga = (GrauA) alunos[i].getGa();
                    ga.setNotaTrabalho(notaTrabalho);
                    ga.setNotaProva(notaProva);
                    break; //encerra o loop após encontrar o aluno
                }
            }
        }
    }

    //método para alterar notas do Grau B
    public void alteraNotasGrauB (String nome, double notaAtividade, double notaSeminario, double notaParticipar){
        for(int i=0; i < alunos.length; i++){
            if (alunos[i] != null && alunos [i].getNome().equalsIgnoreCase(nome)) {
                if (alunos[i].getGb() instanceof GrauB) {
                    GrauB gb = (GrauB) alunos[i].getGb();
                    gb.setNotaAtividade (notaAtividade);
                    gb.setNotaSeminario(notaSeminario);
                    gb.setNotaParticipar(notaParticipar);
                    break; //encerra o loop após encontrar o aluno
                }
            }
        }
    }
}
