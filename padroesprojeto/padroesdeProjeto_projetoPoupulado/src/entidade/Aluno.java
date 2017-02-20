package entidade;

import java.util.ArrayList;

public class Aluno implements Comparable<Aluno> {

    private Matricula matricula;
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(Matricula matricula, String nome, ArrayList<Disciplina> disciplinas) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public Aluno() {
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public int compareTo(Aluno t) {
        return nome.compareTo(t.getNome());
    }
    
    @Override
    public String toString() {
        return ("Matricula " + getMatricula() + ", Nome " + getNome() + "Disciplinas " + getDisciplinas());
    }
}
