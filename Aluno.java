
public class Aluno extends Pessoa {
	
	
	
	 private double[] nota11=new double[1];
	 private double[] nota12=new double[0];
	 private double[] nota13=new double[0];
	 private String nomeProfessor;
	 private  String nome;
	 private  int anoLetivo;
	 private  int idade;
	 private  String historico;
	 
	public void adicionarNota(double nota, int unidade, String prof){
		   this.nomeProfessor= prof;
		
		   if(unidade == 1){
		    	 nota11[unidade]=nota;
		     }
		     else if(unidade == 2){
		    	 nota11[unidade]=nota;
		     }
		     else if(unidade==3) {
		    	
			    	 nota11[unidade]=nota;
			     
		     }
		
		
	}
    
    



}
