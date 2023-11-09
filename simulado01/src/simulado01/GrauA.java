package simulado01;

public class GrauA extends Grau {
	
	//atributos obtidos na questão da prova
    protected double notaProva;
    protected double notaTrabalho;

    //construtor que não recebe parâmetros, inicializando as notas com 0.0
    public GrauA () {
        super ();
        this.notaProva = 0.0;
        this.notaTrabalho = 0.0;
    }
    
    //construtor que recebe parâmetros para inicializar todos os atributos
	public GrauA(String dataInicio, String dataFim, double notaProva, double notaTrabalho) {
		super(dataInicio, dataFim);
		this.notaProva = notaProva;
		this.notaTrabalho = notaTrabalho;
	}
	
	//getters e setters
	public double getNotaProva() {
		return notaProva;
	}

	public void setNotaProva(double notaProva) {
		this.notaProva = notaProva;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
    
	//método para calcular nota final do grau
    public double calculaNotaFinalGrau() {
        double notaFinalGrauA = (notaProva * 0.7) + (notaTrabalho * 0.3);
        return notaFinalGrauA;
    }

    //método to String
    @Override
    public String toString (){
        return 
        "\n Data do início do Grau A: " +dataInicio+
        "\n Data do fim do Grau A: " +dataFim+
        "\n Nota da prova do Grau A: " +notaProva+ 
        "\n Nota do trabalho do Grau A: " +notaTrabalho;
    }
}
