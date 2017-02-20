/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controle.AlunoCtr;
import entidade.Aluno;
import entidade.Disciplina;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Aluno
 */
public class AlunoPO {

    
    AlunoCtr alunoControl;

    public AlunoPO() {
        alunoControl = new AlunoCtr();
    }

    public Iterator listarComArraylist(String urlArquivo) {
        ArrayList<Aluno> listaDeAlunos  = new ArrayList<>();
        try {
            FileReader fr = new FileReader(urlArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                Aluno objetoAluno = alunoControl.populaAluno(linha);
                listaDeAlunos.add(objetoAluno);
            }

            Collections.sort(listaDeAlunos);
        } catch (Exception erro) {
            System.out.println("Erro ao abrir o arquivo." + erro.getMessage());
        }
        return listaDeAlunos.iterator();
    }
    
        public Iterator listarComFila(String urlArquivo) {
            LinkedList<Aluno> listaDeAlunos = new LinkedList<>();
        try {
            FileReader fr = new FileReader(urlArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                Aluno objetoAluno = alunoControl.populaAluno(linha);
                listaDeAlunos.offer(objetoAluno);
            }

            Collections.sort(listaDeAlunos);
        } catch (Exception erro) {
            System.out.println("Erro ao abrir o arquivo." + erro.getMessage());
        }
        return listaDeAlunos.iterator();
    }

//    public ArrayList<Aluno> abrirArquivo(String urlArquivo) {
//        try {
//            FileReader fr = new FileReader(urlArquivo);
//            BufferedReader br = new BufferedReader(fr);
//            String linha;
//            while ((linha = br.readLine()) != null) {
//                Aluno objetoAluno = alunoControl.populaAluno(linha);
//                listaDeAlunos.add(objetoAluno);
//            }
//
//            Collections.sort(listaDeAlunos);
//        } catch (Exception erro) {
//            System.out.println("Erro ao abrir o arquivo." + erro.getMessage());
//        }
//        return listaDeAlunos;
//    }
}
