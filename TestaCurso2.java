package gerenciado;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes",
				"Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com arreylist",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		System.out.println(javaColecoes.getAulas());

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
