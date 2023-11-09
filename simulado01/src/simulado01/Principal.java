package simulado01;

public class Principal {
	public static void main(String[] args){
		System.out.println("*****BEM VINDO AO SISTEMA DE CÁLCULO DE GRAU DO SEMESTRE*****");
		
		//criação de uma turma com código sendo solicitado pelo teclado e capacidade máxima definida por sorteio, entre 1 e 50 alunos
        String codigoTurma = Teclado.leString("\n Por favor, digite o código da turma: ");
        int maxAlunos = (int)((Math.random()*50)+1);
        Turma turma = new Turma (codigoTurma, maxAlunos);

        //gerar número aleatório de alunos
        int quantidadeAlunos = (int)((Math.random()*100)+1);

        for (int i = 0; i < quantidadeAlunos; i++) {
            String nomeAluno = "Aluno " + (i + 1); //criar nome do aluno
            if (i < maxAlunos) {
                Aluno aluno = new Aluno("Aluno "+(i+1)); //criação de um aluno utilizando os atributos já declarados
                turma.insereAluno(aluno); //chamar o método para inserir aluno na turma
                turma.alteraNotasGrauA("Aluno "+(i+1), (Math.random() * 100) + 1, (Math.random() * 100) + 1); //gerar notas aleatórias de alunos entre 1 e 100
                turma.alteraNotasGrauB("Aluno "+(i+1), (Math.random() * 100) + 1, (Math.random() * 100) + 1, (Math.random() * 100) + 1); //gerar notas aleatórias de alunos entre 1 e 100
                System.out.println("Aluno " + nomeAluno + " inserido na turma " + turma.getCodigoTurma() + " com sucesso!\n");

            } else {
                System.out.println("\n" + nomeAluno + " não foi inserido na turma.");
            }
        }

        //calcular média das notas da turma
        double mediaNotasTurma = turma.mediaNotasTurma();
        System.out.printf("\n\nEssa foi a média de notas da turma: %.2f\n" , mediaNotasTurma);

        //verificar aprovação do aluno
        Aluno[] alunos = turma.getAluno();
        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = alunos [i];
            if (aluno != null) {
                double notaFinal = aluno.calculaNotaFinal();
                if (notaFinal >= 60) {
                    System.out.printf("\n Aluno " + turma.getAluno()[i].getNome() + ": Passou por média! Sua nota final foi %.2f.\n " , turma.getAluno()[i].calculaNotaFinal());
                } else {
                    System.out.printf("\n Aluno " + alunos[i].getNome() + ": Ficou em Grau C. Sua nota final foi %.2f.\n " , turma.getAluno()[i].calculaNotaFinal());
                }
            }
        }
    }
}
        