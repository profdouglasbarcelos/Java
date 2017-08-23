package aula2311_camadas;

import banco.BancoDadosInstituicao;
import views.AlunoView;

public class Aula2311_Camadas {

    public static void main(String[] args) {
        BancoDadosInstituicao.inicializarBanco();

        AlunoView alunoView = new AlunoView();
        
        while (true) {
            alunoView.exibirMenuAluno();
        }
    }
}
