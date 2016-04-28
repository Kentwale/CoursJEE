import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LireDom {
    public static void main(String[] args) {
        LireDom lireDom = new LireDom();
        lireDom.lectureDom();
    }

    private void lectureDom() {
        File fLecture = new File("Donnees/Etudiants.xml");
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(fLecture);// effectue
            // l'ensemble de la lecture du fichier
            // ligne 26 et 27 permet d'obtenir la fabrique

            Element racine = document.getDocumentElement();
            // permet de chercher les elements du document
            NodeList liste = racine.getChildNodes();
            int nbList = liste.getLength();
            for (int i = 0; i < nbList; i++) {
                if (liste.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element eFormation = (Element) liste.item(i);
                    NodeList lFormation = eFormation.getChildNodes();
                    eFormation.getAttribute("id");
                    // recupere chaque element du fichier xml

                    for (int j = 0; j < lFormation.getLength(); j++) {
                        if (lFormation.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element eEtudiant = (Element) lFormation.item(j);
                            String nom = eEtudiant.getAttribute("nom");
                            String prenom = eEtudiant.getAttribute("prenom");
                            String metier = eEtudiant.getAttribute("metier");
                            String mail = eEtudiant.getAttribute("mail");
                            String commentaire = eEtudiant.getTextContent();
                            System.out.println(nom + " " + prenom + " " + metier + " " + mail + " " + commentaire);
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

}