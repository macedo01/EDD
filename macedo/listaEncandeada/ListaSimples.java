package listaEncadeada.macedo.listaEncandeada;

public class ListaSimples {

	No inicio = null;
	int tamanho = 0;

	public void inserirInicio(String info) {
		// cria um novo no
		No no = new No();
		// coloca a info passada de paramentro para o novo no
		no.info = info;
		// faz o novo no apontar para o onde o inicio esta apontando (para null se estiver vazio ou para o seguinte)
		no.proximo = inicio;
		// faz o inicio apontar para o novo no (atual)
		inicio = no;
		// incrementa o tamanho
		tamanho++;

	}

	// sobrescevendo o toString para percorrer os nos
	public String toString() {
		String str = "(" + tamanho + ")";
		// cria uma variavel aux para apontar para o mesmo lugar que o inicio
		No local = inicio;
		// faz um loop para percorrer os nos
		while(local != null) {
			//adiciona a string str a info do no local
			str += local.info + " ";
			// aponta para o proximo no
			local = local.proximo;
		}
		return str;
	}

	
	public void inserirFim(String info) {
		// cria um novo No
		No no = new No();
		// coloca a info passada de paramentro para o novo no
		no.info = info;
		// se o inicio for null, ou seja não está apontando para nenhum no, ele diz q o inicio agora é o novo no (no atual) e que o proximo desse no é null
		if(inicio == null) {
			inicio = no;
			no.proximo = null;
			// caso o inicio nao seja null, cria uma variavel aux para apontar para o mesmo lugar do inicio
			// faz um loop para enquanto o proximo do no local for not equals null ele continuar indo atras do ultimo
		}else {
			No local = inicio;
			while(local.proximo != null) {
				local = local.proximo;
			}

			local.proximo = no;
			no.proximo = null;
			tamanho++;

		}	

	}

	// retorna o tamanho da lista
	public String tamanhoLista() {
		return "Tamanho da Lista = " + tamanho;
	}

	public String retirarInicio(){
		// se o inicio equals null then return null pq nao da para tirar o inicio se nao tiver nada
		if(inicio == null){
			return null;
		}else {
			// se nao for igual a null seta uma string info para o info do inicio atual
			String info = inicio.info;
			// seta que o inicio agora vai ser o proximo
			inicio = inicio.proximo;
			// diminui 1 do tamanho
			tamanho--;
			// retorna o info para poder printar por exemplo qual foi retirado
			return (info);
		}
	}

	public String retirarFim(){
		// se o inicio equals null then return null pq nao da para tirar o fim se nao tiver nada
		if(inicio == null){
			return null;
		}
		// cria uma no local apontando para o mesmo lugar do inicio
		No local = inicio;
		// faz um loop para percorrer os nos enquanto for not equals null
		while(local.proximo != null){
			// faz um no aux para apontar no mesmo lugar do local atual
			No aux = local;
			// agora o local vai apontar para o proximo do local que é null
			local = local.proximo;
			if(local.proximo == null){
			aux.proximo = null;
			tamanho--;
			return local.info;
			}
		}
		inicio = null;
		tamanho--;
		return local.info;
	}





	
	public String removerPosicao(int posicao) {
		if(posicao < 0 || posicao >= tamanho || inicio == null ) {
			return null;
		}else if (posicao == 0) {
			return retirarInicio();
		}else if (posicao == tamanho - 1) {
			return retirarFim();
		}
		
		No local = inicio;
		for(int i = 0; i < posicao - 1; i++) {
			local = local.proximo;
		}
		
		String info = local.proximo.info;
		local.proximo = local.proximo.proximo;
		tamanho--;
		return info;
	}
	
	
	

}

