package entidade;

public class Matricula {

    private int ano;
    private int periodo;
    private int curso;
    private int codigo;

    public Matricula(int ano, int periodo, int curso, int codigo) {
        this.ano = ano;
        this.periodo = periodo;
        this.curso = curso;
        this.codigo = codigo;
    }

    public String getNomeDoCurso() {
        if (curso == 28) {
            return "Ciencia da Computação";
        } else if (curso == 33) {
            return "Engenharia da Computação";
        } else if (curso == 48) {
            return "Engenharia de Software";
        } else {
            return "Curso não cadastrado!";
        }
    }

    public Matricula() {}

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return ano + "." + periodo + "." + curso + "." + codigo;
    }
 
}
