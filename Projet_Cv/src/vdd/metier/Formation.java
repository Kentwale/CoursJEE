package vdd.metier;

import java.text.DateFormat;

public class Formation {

	private String dateFormation;
	private String lieuFormation;
	private String domaineFormation;
	private ListeEtudiant listeEtudiant;
	private int idFormation;
	
	public Formation(){
		dateFormation="";
		lieuFormation="";
		domaineFormation="";
		listeEtudiant= new ListeEtudiant();
	}
	
	public Formation(String dateFormation, String lieuFormation, String domaineFormation, ListeEtudiant listeEtudiant){
		this.dateFormation=dateFormation;
		this.lieuFormation=lieuFormation;
		this.domaineFormation=domaineFormation;
		this.listeEtudiant= listeEtudiant;
	}
	public Formation(String dateFormation, String lieuFormation, String domaineFormation){
		this.dateFormation=dateFormation;
		this.lieuFormation=lieuFormation;
		this.domaineFormation=domaineFormation;
		listeEtudiant = new ListeEtudiant();
	
	}
	public Formation (int idFormation,String dateFormation, String lieuFormation, String domaineFormation){
		this.idFormation=idFormation;
		this.dateFormation=dateFormation;
		this.lieuFormation=lieuFormation;
		this.domaineFormation=domaineFormation;
		listeEtudiant = new ListeEtudiant();
	}
	
	
	
	
	public String getDateFormation() {
		return dateFormation;
	}
	public void setDateFormation(String dateFormation) {
		this.dateFormation = dateFormation;
	}
	public String getLieuFormation() {
		return lieuFormation;
	}
	public void setLieuFormation(String lieuFormation) {
		this.lieuFormation = lieuFormation;
	}
	public String getDomaineFormation() {
		return domaineFormation;
	}
	public void setDomaineFormation(String domaineFormation) {
		this.domaineFormation = domaineFormation;
	}

	public ListeEtudiant getListeEtudiant() {
		return listeEtudiant;
	}

	public void setListeEtudiant(ListeEtudiant listeEtudiant) {
		this.listeEtudiant = listeEtudiant;
	}

	public int getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}

	
}
