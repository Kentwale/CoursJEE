
public class TestString {


	public static void main(String[] args){

	
	TestString testString = new TestString();
	testString.init();
}

public void init(){
	String s1= "Mon premier String";
	String s2= "mon premier String";
	int lng=s1.length();
	int lng2="Mon premier String".length();
	boolean b1 = s1.equals("mon premier String");
	int comp1 = "A".compareTo ("a");
	System.out.println(comp1);
	char[] tab=s1.toCharArray();
	System.out.println(tab);
	int majuscule = 'A';
	int minuscule = 'a';
	System.out.println(majuscule+" "+ minuscule+" "+(majuscule-minuscule));
	System.out.println(s1.toUpperCase().replace("PRE","PER").substring(3,7));
	
	s1=s1.replace("String", "coucou");
	System.out.println(s1);
	if (s1.contains("PRE")){
		System.out.println("Perdu");
	}else{
		System.out.println("gagné");
		
		int ind1=s1.indexOf("c");
		int ind2=s1.lastIndexOf("c");
		System.out.println(ind1+" "+ind2);
		byte[] b=s1.getBytes();
		System.out.println(b.length);
		System.out.println(s1.substring(4,11));
		
		int i=Integer.valueOf("4567");
		System.out.println(i);
		String sI=Integer.toString(i);
		System.out.println(sI);
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toBinaryString(i));
		
		int j=new Integer (5).intValue();
		
		Integer i1= new Integer(5);
		Integer i2 = new Integer(5);
		int a=4;
		System.out.println(a);
		if (i1.equals(i2)){
			System.out.println("perdu");
		}else{
			System.out.println("gagné");
		}
		int k=i1.intValue();
		float f=i1.floatValue();
		int m=i1.parseInt("32");
		
		
		}
	}
}

