package banco;
public class Obra{

	private int cod;
	private String emp;
	private Municipio mun;
	private Executor exe;
	private Estagio est;

	public void setCod(int cod){
		this.cod = cod;
	}

	public void setEmp(String emp){
		this.emp = emp;
	}

	public void setMun(Municipio mun){
		this.mun = mun;
	}

	public void setExe(Executor exe){
		this.exe = exe;
	}

	public void setEst(Estagio est){
		this.est = est;
	}

	public int getCod(){
		return this.cod;
	}

	public String getEmp(){
		return this.emp;
	}

	public Municipio getMun(){
		return this.mun;
	}

	public Executor getExe(){
		return this.exe;
	}

	public Estagio getEst(){
		return this.est;
	}
}