package simulado01;

public class Aluno {
	//atributos
    protected String nome;
    protected GrauA ga;
    protected GrauB gb;

    //construtor que recebe parâmetros para inicializar todos os atributos
    public Aluno (String nome){
        this.nome = nome;
        this.ga = new GrauA();
        this.gb = new GrauB();
    }
    
    //getters e setters
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public GrauA getGa(){
        return ga;
    }
    
    public void setGa(GrauA ga){
        this.ga = ga;
    }
    
    public GrauB getGb(){
        return gb;
    }
    
    public void setGb(GrauB gb){
        this.gb = gb;
    }
    
    //método para calcular nota final do aluno
    public double calculaNotaFinal() {
        double notaGrauA = ga.calculaNotaFinalGrau();
        double notaGrauB = gb.calculaNotaFinalGrau();
        double notaFinal = (notaGrauA * 0.33) + (notaGrauB * 0.67);
        return notaFinal;
    }
    
    //método to String
    @Override
    public String toString (){
        return "Nome do aluno: " +nome+
        "\n\n Grau A: " +ga+
        "\n\n Grau B: " +gb;
    }
}

