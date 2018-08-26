package Aula_16_09_2014_Exercicio_04;

public class HomeTheater {
	private String som;
	private String video;
	
	private SistemaDeSom sistemasom[];
	private SistemaDeVideo sistemavideo[];
	
	
	public HomeTheater(){
		SistemaDeSom sissom = new SistemaDeSom();
		SistemaDeVideo sisvideo=new SistemaDeVideo();		
	}
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomeTheater [som=");
		builder.append(som);
		builder.append(", video=");
		builder.append(video);
		builder.append(", getSom()=");
		builder.append(getSom());
		builder.append(", getVideo()=");
		builder.append(getVideo());
		builder.append("]");
		return builder.toString();
	}

}
