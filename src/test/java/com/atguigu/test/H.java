package com.atguigu.test;

public class H {
	public static void main(String[] args) {
		int[] i,a = new int[]{-1,5,2,6,0,3,9,1,7,4};
		
		heapSort(a,9);
		System.out.println(a);
	}

	private static void heapSort(int[] k, int n) {
		int i;
		for(i=n/2; i>0; i--) {
			HeapAdjust(k,i,n);
		}
		
	}

	private static void HeapAdjust(int[] k, int s, int n) {
		
		int i,temp;
		temp = k[s];
		for(i=2*s; i<=n; i*=2) {
			if (i<n&&k[i]<k[i+1]) {
				i++;
			}
			if (temp>=k[i]) {
				break;
			}
			k[s] = k[i];
			s = i;
		}
		k[s]=temp;
	}
	
	
}
	