package vdd.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import vdd.metier.Formation;
import vdd.metier.ListeFormation;




public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.init();
		m.chargeXml();

	}

	private void init() {
		
		
	}
	private void chargeXml() {
		ListeFormation listeFormation=new ListeFormation(null);
		File file=new File("DevFormation/workspace/ProjectWebHtml/WebContent/WEB-INF/xml/formation.xml");
		BufferedReader buf= null;
		try {
			buf = new BufferedReader(new FileReader(file));
					String line = buf.readLine();
					while(line !=null){
						if (line.contains("<formation")){
							String dateCharge=extraitAtt(line,"dateFormation='");
							String lieuCharge=extraitAtt(line,"lieuFormation='");
							String domaineCharge=extraitAtt(line,"domaineFormation='");
							
							Formation a=new Formation(dateCharge,lieuCharge,domaineCharge);
							listeFormation.add(a);
							
					
							
						}else if(line.contains("</formation>")){
							for (Formation formation : listeFormation) {
								System.out.println(formation.toString());
							}
							
						}
						line = buf.readLine();
						
					}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				buf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public String extraitAtt(String line, String ch) { //ch correspond à nomStock='
		String res="";
		String newLine=line.replace("\"","'"); //tabulation, c'est \t
		int deb=newLine.indexOf(ch);
		int fin=newLine.indexOf("'",deb+ch.length());
		res=newLine.substring(deb+ch.length(),fin);
		return res;
	}
}
