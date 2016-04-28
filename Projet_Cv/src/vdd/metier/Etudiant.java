package vdd.metier;

public class Etudiant {
	private String nom;
    private String prenom;
    private String metier;
    private String email;
    private String commentaire;
    private Formation formation;
   private int IdEtudiant;
   private ListeExperience listeExperience;
   private ListeCompetence listeCompetence;
   private ListeFormationScolaire listeFormationScolaire;
    
    
    public Etudiant(String nom, String prenom, String metier, String email, String commentaire, Formation formation, int IdEtudiant ) {
        this.nom = nom;
        this.prenom = prenom;
        this.metier = metier;
        this.email = email;
        this.commentaire = commentaire;
        this.formation = formation;
        this.IdEtudiant = IdEtudiant;
        this.listeExperience = new ListeExperience();
        this.listeCompetence = new ListeCompetence();
        this.listeFormationScolaire = new ListeFormationScolaire();
        
    }
    
    public Etudiant(String nom, String prenom, String metier, String email, String commentaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.metier = metier;
        this.email = email;
        this.commentaire = commentaire;
        this.listeExperience = new ListeExperience();
        this.listeCompetence = new ListeCompetence();
        this.listeFormationScolaire = new ListeFormationScolaire();
        
    }

    public Etudiant(String nom2, String prenom2, String metier2, String email2, Formation formation2,
			int idEtudiants) {
    	 this.nom = nom2;
         this.prenom = prenom2;
         this.metier = metier2;
         this.email = email2;   
         this.formation = formation2;
         this.IdEtudiant = idEtudiants;
         this.listeExperience = new ListeExperience();
         this.listeCompetence = new ListeCompetence();
         this.listeFormationScolaire = new ListeFormationScolaire();
	}

	public Etudiant(String sNom, String sPrenom, String sMail,  String sMetier, Formation formation2) {
		this.nom = sNom;
        this.prenom = sPrenom;
        this.metier = sMetier;
        this.email = sMail;   
        this.formation = formation2;
    
        this.listeExperience = new ListeExperience();
        this.listeCompetence = new ListeCompetence();
        this.listeFormationScolaire = new ListeFormationScolaire();
	}

	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }


	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public int getIdEtudiant() {
		return IdEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		IdEtudiant = idEtudiant;
	}

	public ListeExperience getListeExperience() {
		return listeExperience;
	}

	public void setListeExperience(ListeExperience listeExperience) {
		this.listeExperience = listeExperience;
	}

	public ListeCompetence getListeCompetence() {
		return listeCompetence;
	}

	public void setListeCompetence(ListeCompetence listeCompetence) {
		this.listeCompetence = listeCompetence;
	}

	public ListeFormationScolaire getListeFormationScolaire() {
		return listeFormationScolaire;
	}

	public void setListeFormationScolaire(ListeFormationScolaire listeFormationScolaire) {
		this.listeFormationScolaire = listeFormationScolaire;
	}

}
