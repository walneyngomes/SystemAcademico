
public class AlunoSystem extends System{
	
	
	public Pessoa abrirPortal(String pessoa){
		Pessoa pesso=null;
		
		if(pessoa.equals("a")){
			pesso= new Aluno();
		}
		return pesso;
		
		
	}

}
