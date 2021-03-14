package banco;
public class Municipio{

	private int cod;
	private String nome;
	private Estado estado;

        public Municipio(){
            this.cod = -1;
            this.nome = " ";
            this.estado = null;
        }
        
	public void setCod(int cod){
		this.cod = cod;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setEstado(Estado estado){
		this.estado = estado;
	}

	public Estado getEstado(){
		return this.estado;
	}	

	public int getCod(){
		return this.cod;
	}

	public String getNome(){
		return this.nome;
	}
}