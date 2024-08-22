package crud;

public class Animes {

	private int Id;
	private String Nome;
	private int Episodios;
	private String Genero;
	
	public Jogos() {
		this.Id = -1;
		this.Nome = "";
		this.Episodios = "";
		this.Genero = "";
	}
	
	public Jogos(int id, String nome, int episodios, String genero) {
		this.Id = id;
		this.Nome = nome;
		this.Episodios = episodios ;
		this.Genero =  genero;
	}
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEpisodios() {
		return Episodios;
	}

	public void setEpisodios(String episodios) {
		Episodios = episodios;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	@Override
	public String toString() {
		return "Jogos [Id=" + Id + ", Nome=" + Nome + ", Episodios=" + Episodios + ", Genero=" + Genero + "]";
	}

	
	
}
