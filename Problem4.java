package pro;
public class Problem4 {
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
			for(k=i-1;k>=1;k--){
				System.out.print(k+" ");
			}
				System.out.println("");
		}
		
	}

}
