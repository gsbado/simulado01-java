package simulado01;

public class Grau {
	
	//atributos obtidos na questão da prova
    protected String dataInicio;
    protected String dataFim;
    
    //construtor que recebe parâmetros para inicializar todos os atributos
	public Grau(String dataInicio, String dataFim) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	//construtor que não recebe parâmetros, inicializando as datas com null
    public Grau(){
        this.dataInicio = null;
        this.dataFim = null;
    }
	
	//getters e setters
	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
    
	public double calculaNotaFinalGrau(){
        return 0.0;
    }
    
    //método to String
    public String toString (){
        return "Data de início do Grau: " +dataInicio+ 
        "\n Data de finalização do Grau: " +dataFim;
    }
}
