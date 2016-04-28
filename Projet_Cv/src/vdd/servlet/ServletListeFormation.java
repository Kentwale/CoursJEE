package vdd.servlet;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import vdd.metier.Etudiant;
import vdd.metier.Formation;
import vdd.metier.ListeEtudiant;
import vdd.metier.ListeFormation;

/**
 * Servlet implementation class ServletListeFormation
 */
@WebServlet("/ListeFormationPatrick")
public class ServletListeFormation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	//private ListeFormation listeFormation;
	//private ListeEtudiant listeEtudiant;

	public ServletListeFormation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */

	public void init(ServletConfig config) throws ServletException {

		//listeFormation = new ListeFormation();
		// ListeFormation listeFormation=new ListeFormation();
	//	listeEtudiant = new ListeEtudiant();

	//	File file = new File("../workspace/Projet_Cv/WebContent/WEB-INF/xml/formation.xml");
	//	File file2 = new File("C:/DevFormation/workspace/Projet_Cv/WebContent/WEB-INF/xml/listeEtudiant.xml");

		//listeFormation = lectureListeFormation();

		//listeEtudiant = lectureEtudiant();
	}

	public ListeFormation lectureListeFormation() {
		ListeFormation listeFormation = new ListeFormation();
		File file = new File("../workspace/Projet_Cv/WebContent/WEB-INF/xml/formation.xml");
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new FileReader(file));
			String line = buf.readLine();
			while (line != null) {
				if (line.contains("<Formation ")) {
					String dateCharge = extraitAtt(line, "dateFormation='");
					String lieuCharge = extraitAtt(line, "lieuFormation='");
					String domaineCharge = extraitAtt(line, "domaineFormation='");

					Formation a = new Formation(dateCharge, lieuCharge, domaineCharge);
					listeFormation.add(a);

				} else if (line.contains("</formation>")) {
					for (Formation formation : listeFormation) {
						System.out.println(formation.toString());
					}

				}
				line = buf.readLine();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return listeFormation;
	}

	private String extraitAtt(String line, String ch) { // ch correspond à
														// nomStock='
		String res = "";
		String newLine = line.replace("\"", "'"); // tabulation, c'est \t
		int deb = newLine.indexOf(ch);
		int fin = newLine.indexOf("'", deb + ch.length());
		res = newLine.substring(deb + ch.length(), fin);
		return res;

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// récupération des parmaetres utilisateurs
		// contrôle des parmaetres utilisateurs
		// créer un flux de sortie
		// charger la page html à afficher
		// envoyer cette page dans le flux de sortie

		HttpSession session=request.getSession();
	
		ListeFormation listeFormation = lectureListeFormation();
		lectureEtudiant(listeFormation);
		session.setAttribute("listForm", listeFormation);
		
		PrintWriter out = response.getWriter();
		// out.println("Hello World");

		File file = new File("../workspace/Projet_Cv/WebContent/WEB-INF/page/pageListeFormation.html");
		BufferedReader buf = new BufferedReader(new FileReader(file));

		String line = buf.readLine();
		try {
			while (line != null) {
				if (line.contains("%%date%%") || line.contains("%%lieu%%") || line.contains("%%domaine")
						|| line.contains("%%nom%%") || line.contains("%%valeur")) {
					affListeFormation(out, line, listeFormation);
				} else {
					out.println(line);
				}
				line = buf.readLine();
			}
			line = buf.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (buf != null) {
					buf.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private void affListeFormation(PrintWriter out, String line, ListeFormation listeFormation) {

		for (int i = 0; i < listeFormation.size(); i++) {
			Formation formation = listeFormation.get(i);
			String ligneAAfficher = line;
			// out.println("<tr>");
			// out.println("<td style=\"width: 5%\">sel</td>");
			// out.println("<td style=\"width: 40%\">" +
			// formation.getDateFormation() + "</td>");
			// out.println("<td style=\"width 50%\">" +
			// formation.getLieuFormation() + "</td>");
			// out.println("<td style=\"width: 30%\">" +
			// formation.getDomaineFormation() + "</td>");
			// out.println("</tr>");
			ligneAAfficher = ligneAAfficher.replace("%%name%%", "boutonFormation");
			ligneAAfficher = ligneAAfficher.replace("%%valeur%%", Integer.toString(i));
			ligneAAfficher = ligneAAfficher.replace("%%date%%", formation.getDateFormation());
			ligneAAfficher = ligneAAfficher.replace("%%lieu%%", formation.getLieuFormation());
			ligneAAfficher = ligneAAfficher.replace("%%domaine%%", formation.getDomaineFormation());

			out.println(ligneAAfficher);
		}

	}

	

	public void lectureEtudiant(ListeFormation listeFormation) {
		
		File file2 = new File("C:/DevFormation/workspace/Projet_Cv/WebContent/WEB-INF/xml/listeEtudiant.xml");
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder documentBuilder = factory.newDocumentBuilder();
			Document document = documentBuilder.parse(file2);

			Element racine = document.getDocumentElement();
			NodeList list = racine.getChildNodes();
			int nbList = list.getLength();
			for (int i = 0; i < nbList; i++) {
				if (list.item(i).getNodeType() == Node.ELEMENT_NODE) {
					Element eFormation = (Element) list.item(i);
					NodeList lFormation = eFormation.getChildNodes();
					String sId = eFormation.getAttribute("id");
					Formation form = listeFormation.get(Integer.valueOf(sId).intValue());
					for (int j = 0; j < lFormation.getLength(); j++) {
						if (lFormation.item(j).getNodeType() == Node.ELEMENT_NODE) {

							Element eEtudiant = (Element) lFormation.item(j);
							String nom = eEtudiant.getAttribute("nom");
							String prenom = eEtudiant.getAttribute("prenom");
							String metier = eEtudiant.getAttribute("metier");
							String email = eEtudiant.getAttribute("email");
							String commentaire = eEtudiant.getTextContent();
							Etudiant e =null; // new Etudiant(nom, prenom, metier, email, commentaire, form);
							//listeEtudiant.add(e);
							ListeEtudiant lstEtudiant = form.getListeEtudiant();
							lstEtudiant.add(e);

							System.out.println(nom + " " + prenom + " " + metier + " " + email + " " + commentaire);
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		ListeFormation listeFormation = (ListeFormation)session.getAttribute("listForm");
		
		System.out.println("je passe par ici");
		String sIdFormation = req.getParameter("boutonFormation");
		System.out.println(sIdFormation);
		int idFormation = Integer.valueOf(sIdFormation).intValue();
		if (idFormation >= 0 && idFormation < listeFormation.size()) {
			Formation form = listeFormation.get(idFormation);
			ListeEtudiant lstEtudiant = form.getListeEtudiant();
			PrintWriter out = resp.getWriter();
			File file = new File("C:/DevFormation/workspace/Projet_Cv/WebContent/WEB-INF/page/pageListeEtudiant.html");
			BufferedReader buf = new BufferedReader(new FileReader(file));
			String line = buf.readLine();
			while (line != null) {
				if (line.contains("%%nom%%")) {
					for (int i = 0; i < lstEtudiant.size(); i++) {
						String ligneAAfficher = line;
						ligneAAfficher=ligneAAfficher.replace("%%name%%", "boutonCV");
						ligneAAfficher=ligneAAfficher.replace("%%valeur%%", Integer.toString(i));
						ligneAAfficher=ligneAAfficher.replace("%%nom%%", lstEtudiant.get(i).getNom());
						ligneAAfficher=ligneAAfficher.replace("%%prenom%%", lstEtudiant.get(i).getPrenom());
						ligneAAfficher=ligneAAfficher.replace("%%metier%%", lstEtudiant.get(i).getMetier());
						ligneAAfficher=ligneAAfficher.replace("%%mail%%", lstEtudiant.get(i).getEmail());

						out.println(ligneAAfficher);
					}

				} else {
					out.println(line);
				}
				line = buf.readLine();
			}
			line=buf.readLine();
		}

	}
}
