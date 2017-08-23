package controllers;

import banco.BancoDadosInstituicao;
import models.Aluno;

public class AlunosController {
    
    public static void adicionarAluno(int codigo, String nome, String cpf){
        // criei o objeto para ir para o banco
        Aluno a = new Aluno();
        
        // Preenchendo o objeto
        a.setCodigo(codigo);
        a.setNome(nome);
        a.setCpf(cpf);
        
        BancoDadosInstituicao.getTabelaAluno().add(a);
    }
    
    public static Aluno buscarPorCodigo(int codigo){
        
        for(Aluno a : BancoDadosInstituicao.getTabelaAluno()){
            if(a.getCodigo() == codigo){
                return a;
            }
        }
        
        return null;
    }
}
