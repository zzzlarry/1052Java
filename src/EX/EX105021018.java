package EX;
import java.util.Scanner;
public class EX105021018 {

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
  for(int i=0;i<a;i++){
	  for(int j=0;j<b;j++){
		System.out.print(arr[i][j]+"\t");
	  }
	  System.out.println();
  }

	}

}
