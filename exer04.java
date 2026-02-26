package revisao;

/*Supondo que x = 2 e y = 3, o que cada um destas instruções exibe?
a. System.out.printf( "x = %d\n", x );
b. System.out.printf( "Value of %d + %d is %d\n", x, x, (x + x) );
c. System.out.printf( "x =" );
d. System.out.printf( "%d %d\n", (x + y ), ( y + x) ); */

public class exer04 {
		public static void main(String[] args) {
			//Questão 4
			int x = 2, y = 3;
			System.out.printf("x = %d\n", 2);
		    System.out.printf("Value of %d + %d is %d\n", 2, 2, (2 + 2));
			System.out.printf("x = " );
			System.out.printf("%d %d\n", (2 + 3), (3 + 2));
		}

}
