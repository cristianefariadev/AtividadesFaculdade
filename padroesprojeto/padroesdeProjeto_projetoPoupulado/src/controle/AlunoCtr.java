package controle;

import entidade.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoCtr {

    List<Aluno> listAlunos;
    DisciplinasCtr disciplinasCtr;
    MatriculaCtr matriculaCtr;

    public AlunoCtr() {
        listAlunos = new ArrayList<>();
        disciplinasCtr = new DisciplinasCtr();
        matriculaCtr = new MatriculaCtr();
    }
    
    public Aluno populaAluno(String linha){
        String[] dados = linha.split(";");
        Matricula matricula = matriculaCtr.criarMatricula(dados[0]);
        String nome = dados[1];
        ArrayList<Disciplina> disciplinas = disciplinasCtr.criarDisciplinas(dados[2]);
        
        return new Aluno(matricula, nome, disciplinas);
    }
}