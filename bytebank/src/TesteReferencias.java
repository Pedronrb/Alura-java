
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 100;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são as mesmas contas");
		} 
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
