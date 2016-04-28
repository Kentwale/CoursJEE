package vdd.metier;

public class Competence {
	private String type;
	private String detail;
	private String niveau;
	private int idEtudiant;
	private Etudiant etudiant;

	public Competence() {
		idEtudiant=-1;
		type = "";
		detail = "";
		niveau = "";
	}

	public Competence(int idEtudiant,String type, String detail, String niveau) {
		this.idEtudiant=idEtudiant;
		this.type = type;
		this.detail = detail;
		this.niveau = niveau;
	}

	public Competence(int id, String type, String detail, String niveau, Etudiant etudiant) {
		this.idEtudiant=id;
		this.type = type;
		this.detail = detail;
		this.niveau = niveau;
		this.etudiant=etudiant;
	}

	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

}
