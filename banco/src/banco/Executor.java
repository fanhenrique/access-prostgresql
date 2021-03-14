package banco;
public class Executor{

	private int cod;
	private String nome;

        public Executor(){
            this.cod = -1;
            this.nome = " ";
        }
        
        
	public void setCod(int cod){
		this.cod = cod;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getCod(){
		return this.cod;
	}

	public String getNome(){
		return this.nome;
	}

}