package vdd.sql;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import metier.Formation;
import metier.ListeFormation;

public class MainSQL {

	public static void main(String[] args) {
		MainSQL m = new MainSQL();
		m.init();
		// m.createEtudiant();
		// m.insertEtudiant();

		// m.lireDom();

	}

	private void init() {
	//	ListeFormation listeFormation = lireDom();
	//	insert(listeFormation);
		selectFormation();

	}

	private void selectFormation() {
		Connection con = null;
		ResultSet res = null;
		Statement statement = null;
		String requete = "";

		String login = "Active";
		String password = "VDDMichel";
	//	String login = "root";
		//String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String urlBDD = "jdbc:mysql://localhost/bddcv";
		String urlBDD = "jdbc:mysql://www.psyeval.fr/bddCV";
		try {
			con = DriverManager.getConnection(urlBDD, login, password);
			statement = con.createStatement();
			//requete = "SELECT*FROM formation where dateFormation LIKE 'mars-avril';";
			requete = "SELECT*FROM formation where dateFormation LIKE '%avril%';";
			statement.executeQuery(requete);
			res=statement.getResultSet();
			boolean encore=res.first();
			while (encore) {
				String id=res.getString(1);
				String date= res.getString("dateFormation");
				String lieu= res.getString("lieuFormation");
				String domaine= res.getString("domaineFormation");
				System.out.println(id+" "+date+" "+lieu+" "+domaine);
				encore=res.next();
			}
					
			
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	

	private void insert(ListeFormation listeFormation) {
		Connection con = null;
		ResultSet res = null;
		Statement statement = null;
		String requete = "";

		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String urlBDD = "jdbc:mysql://localhost/bddcv";
		try {
			con = DriverManager.getConnection(urlBDD, login, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < listeFormation.size(); i++) {
			Formation formation = listeFormation.get(i);

			requete = "INSERT INTO formation" + //
					" (dateFormation,lieuFormation,domaineFormation)" + //
					" VALUES (" + //
					" '" + formation.getDateFormation() + "'," + //
					" '" + formation.getLieuFormation() + "'," + //
					" '" + formation.getDomaineFormation() + "'" + //

					");";
			try {
				statement = con.createStatement();
				statement.executeUpdate(requete); // pour faire une mise à jour
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private ListeFormation lireDom() {

		File fLecture = new File("C:/DevFormation/workspace/ProjectSQL/src/vdd/sql/formation.xml");
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;

		ListeFormation listeFormation = new ListeFormation();

		try {
			documentBuilder = factory.newDocumentBuilder();
			Document document = documentBuilder.parse(fLecture);

			Element racine = document.getDocumentElement();

			NodeList liste = racine.getChildNodes();
			int nbList = liste.getLength();
			for (int i = 0; i < nbList; i++) {
				if (liste.item(i).getNodeType() == Node.ELEMENT_NODE) {
					Element eFormation = (Element) liste.item(i);

					String dateFormation = eFormation.getAttribute("dateFormation");
					String lieuFormation = eFormation.getAttribute("lieuFormation");
					String domaineFormation = eFormation.getAttribute("domaineFormation");

					Formation form = new Formation(dateFormation, lieuFormation, domaineFormation);

					System.out.println(dateFormation + " " + lieuFormation + " " + domaineFormation);
					listeFormation.add(form);
				}
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listeFormation;

	}

	private void insertEtudiant() {
		Connection con = null;
		ResultSet res = null;
		Statement statement = null;
		String requete = "";

		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String urlBDD = "jdbc:mysql://localhost/bddcv";
		try {
			con = DriverManager.getConnection(urlBDD, login, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		requete = "INSERT INTO etudiant" + //
				"(id, nom, prenom, metier, mail)" + //
				"VALUES (" + //
				"'1'," + //
				"'nom'," + //
				"'prenom'," + //
				"'metier'," + //
				"'mail'" + //
				");";
		try {
			statement = con.createStatement();
			statement.executeUpdate(requete); // pour faire une mise à jour
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO Auto-generated method stub

	private void createEtudiant() {

		Connection con = null;
		ResultSet res = null;
		Statement statement = null;
		String requete = "";

		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String urlBDD = "jdbc:mysql://localhost/bddcv";
		try {
			con = DriverManager.getConnection(urlBDD, login, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		requete = "CREATE TABLE etudiant" + //
				" (id INT NOT NULL PRIMARY KEY," + //
				" nom VARCHAR(30)," + //
				" prenom VARCHAR(30)," + //
				" metier VARCHAR(30)," + //
				" mail VARCHAR(30)" + //
				");";
		try {
			statement = con.createStatement();
			statement.executeUpdate(requete); // pour faire une mise à jour
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
