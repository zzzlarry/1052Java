package EX;
import java.util.Scanner;
public class ex2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	  Scanner scn=new Scanner(System.in);
	  int a=scn.nextInt();
	  int b=scn.nextInt();
	  int arr[][]=new int[a][b];
	  int c=a*b;
	  for(int i=0;i<a;i++){
		  for(int j=0;j<b;j++){
			 arr[i][j]=c;
			 c--;
		  }
	  }
	  arr[1][0]=arr[1][3];
	  arr[1][1]=arr[1][2];
	  arr[1][2]=arr[1][2]+1;
	  arr[1][3]=arr[1][2]+1;
	  for(int i=0;i<a;i++){
		  for(int j=0;j<b;j++){
			System.out.print(arr[i][j]+"\t");
		  }
		  System.out.println();
	  }

		}

	}

