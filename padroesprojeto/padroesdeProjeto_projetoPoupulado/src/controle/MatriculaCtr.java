package controle;

import entidade.Matricula;

public class MatriculaCtr {

    public Matricula criarMatricula(String matricula) {
        
        if ( matricula != null){
            String[] mat = matricula.split("\\.");
            if(mat.length == 4){
                return new Matricula(Integer.parseInt(mat[0]),
                        Integer.parseInt(mat[1]),
                        Integer.parseInt(mat[2]),
                        Integer.parseInt(mat[3]));
            }else{
                return null;
            }
        }else{
            return null;
        }
    }
}
