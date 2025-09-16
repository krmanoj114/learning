package com.test.array;

public class ElementFrequencyCount {
	
	public static void main(String args[]) {
		
		int a[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};
		
		int frequency[]= new int[a.length];
		
		int visited = -1;
		
		for(int i=0; i<a.length;i++) {
			 int count =1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					frequency[j]=visited;
				}
				
			}
			if(frequency[i]!= visited) {
			frequency[i]= count;
			}
			
		}
		
		for(int k=0; k<frequency.length; k++) {
			if(frequency[k]!= visited) {
			System.out.println(""+a[k]+"->"+frequency[k]);
			}
		}
		
		
	}

}
