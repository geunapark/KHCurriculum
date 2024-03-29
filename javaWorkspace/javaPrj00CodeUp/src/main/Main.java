package main;

public class Main {
	
	
	public static void main(String[] args) {
		
		RecursionTest x =  new RecursionTest();
		x.m01(0);
	}
}	


//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int [] arr1=new int[n];
//		for(int i=0;i<n;i++) {
//			int y=sc.nextInt();
//			arr1[i]=y;
//		}
//		
//		int m=sc.nextInt();
//		int [] arr2=new int[m];
//		for(int i=0;i<m;i++) {
//			int y=sc.nextInt();
//			arr2[i]=y;
//		}	
//		int arr3[]=new int[arr2.length];
//		
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==arr2[j]) {
//					if(arr3[j]==0) {
//						arr3[j]++;
//					}
//				}
//			}
//		}
//		for(int i=0;i<arr3.length;i++) {
//			System.out.print(arr3[i]+" ");
//		}
// 
//
//	}
//}
///*
 
// 
// int n=sc.nextInt();
//		int [] arr1=new int[n];
//		for(int i=0;i<n;i++) {
//			int y=sc.nextInt();
//			arr1[i]=y;
//		}
//		
//		int m=sc.nextInt();
//		int [] arr2=new int[m];
//		for(int i=0;i<m;i++) {
//			int y=sc.nextInt();
//			arr2[i]=y;
//		}	
//		int arr3[]=new int[arr2.length];
//		
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==arr2[j]) {
//					if(arr3[j]==0) {
//						arr3[j]++;
//					}
//				}
//			}
//		}
//		for(int i=0;i<arr3.length;i++) {
//			System.out.print(arr3[i]+" ");
//		}
// 
 
 
 
 
 
 
/*
int arr[]=new int[23];
int n=sc.nextInt();


//0으로 초기화
for(int i=0;i<arr.length;i++) {
	arr[i]=0;
}

 
for(int i=0;i<n;i++) {
	int y=sc.nextInt();
	for(int j=0;j<arr.length;j++) {
		if(y==j+1) {
			arr[j]=y;
		}
	}
	
}

for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
} 
*/