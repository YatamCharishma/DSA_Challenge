// Input Format: N = 5
// Result:   
// 1
// 01
// 101
// 0101
// 10101

public class Main
{
	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++){
		    for(int j=0;j<=i;j++){
		        if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0)){
		            System.out.print(1+" ");
		        }
		        else{
		            System.out.print(0+" ");
		        }
		    }
		    System.out.print("\n");
		}
	}
}
