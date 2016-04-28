package equileader;

import java.util.TreeMap;

import distinct.Distinct;

public class Equileader {

	public static void main(String[] args) {
		Equileader e=new Equileader();
		e.init();

	}public void init(){
		Distinct t=new Distinct();
        int[]A={4,3,4,4,4,2};
        System.out.println(t.solution(A));
	}
	class Solution1 {
	    public int solution(int[] A) {
	    	
			return 0;
	    }
}
	class Solution {
	    public int solution(int[] A) {
	    	int r=0;
	    	TreeMap<Integer, Integer> map0 = new TreeMap<Integer,Integer>();
	    	TreeMap<Integer, Integer> map1 = new TreeMap<Integer,Integer>();
	    	for (int i = 0; i < A.length; i++) {
	    		if (map1.containsKey(A[i])) {
	    			
					
				}
				
			}
			return 0;
	    	}
	    }
}
