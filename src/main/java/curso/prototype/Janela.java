package curso.prototype;

public class Janela implements Prototype<Janela> {
	
	private String titulo;
	
	private int largura;
	private int altura;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Janela clone() {
		
		Janela janela = new Janela();
		
		//criar a cópia a partir do objeto
		janela.setTitulo(getTitulo());
		janela.setAltura(getAltura());
		janela.setLargura(getLargura());
		
		return janela;
	}
	
}
