
public class Professor extends Pessoa {
	private String formacao;
	private int anoEntrada;
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String nome;
	
    public String nome(){
    	return this.nome;
    }
    public void addcionarNotas(Aluno aluno,int unidade, double nota){
    	   aluno.adicionarNota(nota, unidade, getNome());
    	   
     	
    }
    
    
     
}
