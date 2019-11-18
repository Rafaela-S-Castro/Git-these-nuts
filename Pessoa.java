package TrabalhoC3;

public abstract class Pessoa {

protected String nome;
protected String dataNascimento;
protected int codigo;
protected char genero;
@Override
public String toString() {
	return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", codigo=" + codigo + ", genero=" + genero
			+ "]";
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public char getGenero() {
	return genero;
}
public void setGenero(char genero) {
	this.genero = genero;
}
public Pessoa(String nome, String dataNascimento, int codigo, char genero) {
	super();
	this.nome = nome;
	this.dataNascimento = dataNascimento;
	this.codigo = codigo;
	this.genero = genero;
}
public Pessoa() {
	super();
}




	
	
	
	
}
