package entidade;

public class Disciplina {
    private String codigo;
    private String turma;
    
    public Disciplina(String codigo, String turma){
        this.codigo = codigo;
        this.turma = turma;
    }
    
    public Disciplina() { }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return codigo + "-" + turma;
    }
}