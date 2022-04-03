package listaEncadeada.macedo.listaEncandeada;

public class Main {

	public static void main(String[] args) {


		//stanciando lista vazia
		ListaSimples i = new ListaSimples();
		
		// inicio da lista vazia
		System.out.println(i);
		
		//inserir aluno no inicio da lista 
		i.inserirInicio("Hamilton Sobrinho");
		System.out.println(i);
		
		// inserirFim no fim da lista
		i.inserirFim("Pedro Macedo");
		System.out.println(i);
		i.inserirFim("Matheus Barreto");
		System.out.println(i);
		i.inserirFim("Valentin Almeida");
		System.out.println(i);
		i.inserirFim("Julia Valu");
		System.out.println(i);


		i.retirarInicio();
		i.retirarFim();



		i.removerPosicao(2);
		
		// tamanho da lista no momento
		System.out.println(i.tamanhoLista());
		
		
		// printar oque sobrou
		System.out.println(i);
		
		
		
	}

}
