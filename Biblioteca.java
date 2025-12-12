
public class Biblioteca {
	private String titulo;
	private String autor;
	private int ano;
	private String categoria; // adulto,adolescente ou infantil
	private int posiEstante; // 1 a 5
	private int posiPrateleira; // 1 a 5
	private boolean emprestado;
	public Biblioteca(String titulo, String autor, int ano, String categoria, int posiEstante, int posiPrateleira,
			String emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.categoria = categoria;
		this.posiEstante = posiEstante;
		this.posiPrateleira = posiPrateleira;
		this.emprestado = false;
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPosiEstante() {
		return posiEstante;
	}
	public void setPosiEstante(int posiEstante) {
		this.posiEstante = posiEstante;
	}
	public int getPosiPrateleira() {
		return posiPrateleira;
	}
	public void setPosiPrateleira(int posiPrateleira) {
		this.posiPrateleira = posiPrateleira;
	}
	
	public void setEmprestado(String emprestado) {
		this.emprestado = false;
	}
	public String exibirLivros() {
	return titulo +"(" + ano + ") autor:"+ autor + " categoria:" + categoria + " Status:" + (emprestado ? "indisponivel" : "Disponível"); // true = indisponivel e false = disponivel
	}
	
	public boolean emprestar() {
        if (!this.emprestado) { // se ele for diferente de false, ou seja se ele nao esta disponivel, ele vai ser emprestado
            this.emprestado = true; // retornara true(indisponivel)
            return true;
        }
        return false; // disponivel 
    }	   
	 public boolean devolver() {
	        if (this.emprestado) { 
	            this.emprestado = false;
	            return true;
	        }
	        return false;
	    }
}
	


