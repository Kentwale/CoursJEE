

	import java.io.File;

	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.ParserConfigurationException;
	import javax.xml.transform.OutputKeys;
	import javax.xml.transform.Transformer;
	import javax.xml.transform.TransformerConfigurationException;
	import javax.xml.transform.TransformerException;
	import javax.xml.transform.TransformerFactory;
	import javax.xml.transform.dom.DOMSource;
	import javax.xml.transform.stream.StreamResult;

	import org.w3c.dom.Comment;
	import org.w3c.dom.Document;
	import org.w3c.dom.Element;

	public class EcrireDom {

	    public static void main(String[] args) {
	        EcrireDom ecrireDom = new EcrireDom();
	        ecrireDom.init();
	    }

	    private void init() {
	        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder documentBuilder;
	        try {
	            documentBuilder = factory.newDocumentBuilder();
	            Document document;
	            document = documentBuilder.newDocument();

	            Element racine = document.createElement("lireEtudiant");
	            document.appendChild(racine);

	            Comment commentaire = document.createComment("Ceci est la liste des étudants");
	            racine.appendChild(commentaire);

	            for (int i = 0; i < 3; i++) {
	                Element form = document.createElement("formation");
	                racine.appendChild(form);
	                form.setAttribute("id", Integer.toString(i));

	                for (int j = 0; j < 5; j++) {
	                    Element etudiants = document.createElement("etudiant");
	                    form.appendChild(etudiants);
	                    // ajoute un noeud à la fin du document
	                    etudiants.setAttribute("nom", "etudiant" + Integer.toString(j));
	                    etudiants.setAttribute("prenom", "prenom" + Integer.toString(j));
	                    etudiants.setAttribute("metier", "metier" + Integer.toString(j));
	                    etudiants.setAttribute("mail", "mail" + Integer.toString(j) + ".gmail.com");
	                    etudiants.setTextContent("ceci est une exemple : " + i);
	                }
	            }
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            DOMSource source = new DOMSource(document);
	            StreamResult sortie = new StreamResult(new File("Donnees/creEtudiants.xml"));
	            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

	            transformer.transform(source, sortie);

	        } catch (ParserConfigurationException e) {

	            e.printStackTrace();

	        } catch (TransformerConfigurationException e) {
	            e.printStackTrace();

	        } catch (TransformerException e) {

	            e.printStackTrace();
	        }
	    }

	}


