package banco; 
public class Estagio{

	private int cod;
	private String nivel;

        public Estagio(){
            this.cod = -1;
            this.nivel = " ";
        }
        
	public void setCod(int cod){
		this.cod = cod;
	}

	public void setNivel(String nivel){
		this.nivel = nivel;
	}

	public int getCod(){
		return this.cod;
	}

	public String getNivel(){
		return this.nivel;
	}
}