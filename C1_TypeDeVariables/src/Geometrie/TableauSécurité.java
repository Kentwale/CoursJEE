package Geometrie;

// pour la s�curit�
public class TableauS�curit� {
	//param�tre
	private Form2D[] tab;

	public Form2D[] getTab() {
		return tab;
	}

	public void setTab(Form2D[] tab) {
		this.tab = tab;
	}
	//constructeur
	public TableauS�curit�() {
		// TODO Auto-generated constructor stub
	{
		this.tab=null;
	}
		
	}
	public TableauS�curit� (int n){
		this.tab=new Form2D[n];
	}
	
	public void ajoutAuBout(Form2D maForme) {
		Form2D[] tableauRetour = new Form2D[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			tableauRetour[i] = tab[i];
		}
		tableauRetour[tab.length] = maForme;
		
	
}}
