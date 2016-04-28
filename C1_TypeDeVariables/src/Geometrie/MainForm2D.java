package Geometrie;

public class MainForm2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainForm2D mainForm2D = new MainForm2D();
		mainForm2D.init();
	}

	private void init() {
		
		essai();
	//	float surfaceGlobale=calculerLaSurfaceGlobale;
	
		
		
		//exercice
		
		

	
		
		// TODO Auto-generated method stub
		
	
	//private float calculerLaSurfaceGlobale(){
		// TODO Auto-generated method stub
		Form2D [] tableauFormes=new Form2D[29];
		int i=0;
		float lng=(float)(Math.random()*10);
		float larg=(float)(Math.random()*10);
		float surfaceGlobale=0;
		for(i=0; i<tableauFormes.length;i++){
		int numeroForme = (int)(Math.random()*5);
		
		
		
		switch (numeroForme){
		case 0: 
			Cercle cercle1 = new Cercle(lng,larg);
			tableauFormes [i]= cercle1;
			surfaceGlobale+= cercle1.surface();
			break;
		case 1:
			Rectangle rectangle1= new Rectangle(lng,larg);
			tableauFormes [i]= rectangle1;
			surfaceGlobale+= rectangle1.surface();
			break;
		case 2:
			Carré carré1= new Carré(lng,larg);
			tableauFormes [i]= carré1;
			surfaceGlobale+= carré1.surface();
			break;
		case 3:
			TriangleRectangle triangeRectangle1 = new TriangleRectangle(lng,larg);
			tableauFormes [i]= triangeRectangle1;
			surfaceGlobale+= triangeRectangle1.surface();
			break;
		case 4:
			TriangleIsocele triangleIsocele1 = new TriangleIsocele(lng,larg);
			tableauFormes [i]= triangleIsocele1;
			surfaceGlobale+= triangleIsocele1.surface();
			break;
		case 5:
			TriangeEquilaterale triangleEquilateral = new TriangeEquilaterale(lng,larg);
			tableauFormes [i]= triangleEquilateral;
			surfaceGlobale+= triangleEquilateral.surface();
			break;
		
		}
		
		}
		System.out.println("La surface globale est de " +surfaceGlobale+ " pieds");
		//System.out.println(numeroForme.toString());
	//	return surfaceGlobale;
		}
	

	private void essai() {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(4f,7f);
		System.out.println(rectangle.perimetre());
		System.out.println(rectangle.surface());
		
		TriangleIsocele triangle=new TriangleIsocele(4f,7f);
		System.out.println(triangle.perimetre());
		
		Cercle cercle=new Cercle(4f,0f);
		System.out.println(cercle.surface());
		
	}
	
	}



