
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int k = 0;
        int f = 8;
        	 for(int i =0; i <= 9; i=i+2) {
       	 for(int j = 3; j >= 0 + k;j--) {
       		 System.out.print("   ");
       	 }
       	 k++;
       	 for (int c =0; c < 9-f; c++) {
       		 System.out.print(" * ");
       	 }
       	 f=f-2;
       	 System.out.println();
        }
	}
}