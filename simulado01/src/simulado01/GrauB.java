package simulado01;

public class GrauB extends Grau {

	//atributos obtidos na questão da prova
	protected double notaAtividade;
    protected double notaSeminario;
    protected double notaParticipar;
    
    //construtor que recebe parâmetros para inicializar todos os atributos
	public GrauB(String dataInicio, String dataFim, double notaAtividade, double notaSeminario, double notaParticipar) {
		super(dataInicio, dataFim);
		this.notaAtividade = notaAtividade;
		this.notaSeminario = notaSeminario;
		this.notaParticipar = notaParticipar;
	}
	
	//construtor que não recebe parâmetros, inicializando as notas com 0
    public GrauB (){
        super();
        this.notaAtividade = 0.0;
        this.notaSeminario = 0.0;
        this.notaParticipar = 0.0;
    }

    //getters e setters
	public double getNotaAtividade() {
		return notaAtividade;
	}


	public void setNotaAtividade(double notaAtividade) {
		this.notaAtividade = notaAtividade;
	}


	public double getNotaSeminario() {
		return notaSeminario;
	}


	public void setNotaSeminario(double notaSeminario) {
		this.notaSeminario = notaSeminario;
	}


	public double getNotaParticipar() {
		return notaParticipar;
	}


	public void setNotaParticipar(double notaParticipar) {
		this.notaParticipar = notaParticipar;
	}
	
	//método para calcular nota final do grau
    public double calculaNotaFinalGrau() {
        double notaFinalGrauB = (notaAtividade * 0.3) + (notaSeminario * 0.6) + (notaParticipar * 0.1);
        return notaFinalGrauB;
    }
    
    //método to String
    @Override
    public String toString (){
        return 
        "\n Data do início do Grau B: " +dataInicio+
        "\n Data do fim do Grau B: " +dataFim+
        "\n Nota da atividade do Grau B: " +notaAtividade+ 
        "\n Nota do seminário do Grau B: " +notaSeminario+
        "\n Nota de participação do Grau B: " +notaParticipar;
    }
    
    
}
