import java.io.File;

public class LireXML {
	
	public void lireXML(){
		File file=new File("=../DevFormation/workspace/ProjetMarchand/donnees");
		if (file.isDirectory()) {
			String[] ls = file.list();

			for (int i = 0; i < ls.length; i++) {
				System.out.println(ls[i]);
			}

		}
	}

}
