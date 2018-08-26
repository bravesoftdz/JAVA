package Aula_16_09_2104_Exercicio_02;

public class CD extends Midia{
	private int faixas;
	private String artista;
	private String album;
	
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", getFaixas()=");
		builder.append(getFaixas());
		builder.append(", getArtista()=");
		builder.append(getArtista());
		builder.append(", getAlbum()=");
		builder.append(getAlbum());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
