package banco;

import java.util.ArrayList;
import java.util.List;
import models.Aluno;

public class BancoDadosInstituicao {
    
    private static List<Aluno> tabelaAluno;

    public static List<Aluno> getTabelaAluno() {
        return tabelaAluno;
    }
    
    public static void inicializarBanco(){
        tabelaAluno = new ArrayList<Aluno>();
    }
    
}
