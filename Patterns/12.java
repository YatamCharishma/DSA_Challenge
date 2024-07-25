// Input Format: N = 6
// Result:   
// 1          1
// 12        21
// 12       321
// 1234    4321
// 12345  54321
// 123456654321

public class Main
{
	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n;i++){
		    //numbers
		    for(int j=1; j<=i; j++){
		        System.out.print(j);
		    }
		    //spaces
		    for(int j = 0; j<2*(n-i);j++){
		        System.out.print(" ");
		    }
		    //numbers
		    for(int j=i; j>=1; j--){
		        System.out.print(j);
		    }
		    System.out.print("\n");
		}
	}
}
