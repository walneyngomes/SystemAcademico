
public  abstract class System {
	public Pessoa criarPortal(String pessoa){
		Pessoa pesso=null;
		pesso= abrirPortal(pessoa);
		
		return pesso;
		
		
	}
	public abstract Pessoa abrirPortal(String pessoa);
	

}
