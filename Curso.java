package gerenciado;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	 
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		
		for(Aula aula: aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
		
	}
	
	@Override
	public String toString() {
		return "[Curso:"+ this.getNome()+", tempo total:"
				+ this.getTempoTotal()+ ", aulas: [" + this.aulas +"] ]";
	}

}
