
public class Problem2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=7;
		int i;
		int j;
		int k;
		for(i=1;i<=num;i++){
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		for(i=num;i>=1;i--){
			for(k=1;k<i;k++){
				System.out.print(k+" ");
			}
			System.out.println("");
		}

	}

}
