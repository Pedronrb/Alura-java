
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicional");
		int idade = 15;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		} else {
			if(quantidadePessoas >=2) {
				System.out.println("Você não tem 18,mas pode entrar,"
						+ " pois está acompanhada(o)");
			} else {
			System.out.println("Infelizmente vocÊ não pode entrar :( ");
			}
		}
			
	}
	
}
