package entidades;

public class Nota {
	private Materia materia;
	private Double nota;

	public Materia getMateria() {
		return materia;
	}
	
	public String toString() {
		return materia.getNome() + " - " + nota;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	

}
