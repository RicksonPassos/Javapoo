package gerenciado;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	
	public Aluno(String string, int numeroMatricula) {
		// TODO Auto-generated constructor stub
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}


	@Override
	public String toString() {
		return "[Aluno: " + this.nome + " , matricula" + this.numeroMatricula + "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	@Override
	private void equails() {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.nome.hashCode();
	}
}
