package distinct;

import java.util.ArrayList;

public class Distinct {

	public static void main(String[] args) {
		
		Distinct t=new Distinct();
		t.init();
	}
	
	private void init(){
		Distinct t=new Distinct();
        int[] a={1,1,1,2,-1};
        System.out.println(t.solution(a));
        
	}
	public int solution(int[] A){
		int[][] compteur = new int[A.length][2];
        int distinct = 0;
        
        for(int i=0; i< A.length; i++) {
            boolean newValue = true;
            for(int j=0; j< distinct; j++) {
                if(A[i] == compteur[j][0] && compteur[j][1] != 0) {
                    newValue = false;
                }
            }
            
            if(newValue) {
                compteur[distinct][0] = A[i];
                compteur[distinct][1] = 1;
                distinct++;
            }
        }
        return distinct;
		
	
	}
	public int solution1(int[] A){
		
        
	 long result = 0;
     ArrayList<Integer> monArray = new ArrayList<Integer>();
     for (int i = 0; i < A.length; i++) {
         if (!monArray.contains(Integer.valueOf(A[i]))) {
             monArray.add(A[i]);
             result++;
         }
     }
     return (int) result;
}
}
