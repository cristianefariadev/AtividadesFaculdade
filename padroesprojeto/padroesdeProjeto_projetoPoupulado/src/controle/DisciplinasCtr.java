package controle;

import entidade.*;
import java.util.ArrayList;

public class DisciplinasCtr {

    public ArrayList<Disciplina> criarDisciplinas(String disciplinas) {
        if (disciplinas != null) {
            ArrayList<Disciplina> listDisciplinas = new ArrayList<>();
            String[] dados = disciplinas.split("  ");
            for (String dado : dados) {
                listDisciplinas.add(criarDisciplina(dado));
            }
            return listDisciplinas;
        } else {
            return null;
        }
    }

    private Disciplina criarDisciplina(String dados) {
        if (dados != null) {
            String[] dis = dados.split("-");
            if (dis.length == 2) {
                return new Disciplina(dis[0], dis[1]);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
