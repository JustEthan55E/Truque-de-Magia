import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){

        int meuNumero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");

        meuNumero = scanner.nextInt();
        scanner.close();
		
		int passoUm = meuNumero * meuNumero;
		int passoDois = passoUm + meuNumero;
		int passoTres = passoDois / meuNumero;
		int passoQuatro = passoTres + 17;
		int passoCinco = passoQuatro - meuNumero;
		int passoSeis = passoCinco / 6;
		
		System.out.println(passoSeis);
		
	}		
}
