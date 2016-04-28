
public class ChocolatesByNumbers {

	public static void main(String[] args) {
		ChocolatesByNumbers p = new ChocolatesByNumbers();
		p.init();

	}

   private void init() {
		int N = 10;
		int M = 4;

	
	}
	
		

	
	public int solution2(int N, int M) {
		
		int cpt = 1;
		int i =0;
		while ((i+M)%N != 0) {
			int  m = (i+ M) % N ;
	        i = m;
	        cpt++;
		}
			
				
		
		
		return cpt;
		

	}
	
	}

