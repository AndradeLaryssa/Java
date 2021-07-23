package Estudar;

import Estudar.Estados;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        //opções
        Object[] options = {"Cadastrar Estados", "Média de Óbitos", "Estado com o Maior Número de Casos Positivos", "Percentual de Óbitos do Primeiro Estado Cadastrado", "Sair"};

        //listas
        List<Estados> lista_estados = new ArrayList<>();
        List<Double> lista_obitos = new ArrayList<>();

        //variáveis
        int opc;
        double maior_casos = Integer.MIN_VALUE;
        String maior_estado = "";

        while (true){
            opc = JOptionPane.showOptionDialog(null, "Escolha uma opção abaixo:", "", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);

            switch (opc) {

                case 0:
                    //cadastar estados
                    Estados estados = new Estados();
                    estados.cadastrarEstados();
                    lista_estados.add(estados);
                    lista_obitos.add(estados.getObitos());

                    if(maior_casos < estados.getPacientes()){
                        maior_casos = estados.getPacientes();
                        maior_estado = estados.getNome();
                    }

                    break;

                case 1:
                   //média de óbitos nos estados
                    double sum = 0;
                    for (double contador : lista_obitos){
                        sum += contador;
                    }
                    JOptionPane.showMessageDialog(null,"Média de Óbitos nos Estados Cadastrados:" + sum/lista_obitos.size());
                    break;

                case 2:
                    //estado com o maior número de casos positivos
                    JOptionPane.showMessageDialog(null, "Estado com o Maior Número de Casos Positivos:" + maior_estado);
                    break;

                case 3:
                    //percentual de obitos do primeiro estado cadastrado
                    double sum2 = 0;
                    for (double cont : lista_obitos){
                        sum2 += cont;
                    }
                    JOptionPane.showMessageDialog(null, "Percentual de Óbitos do Primeiro Estado Cadastrado:" + sum2/lista_obitos.get(0) + "%");
                    break;
            }

        if (opc == 4){
            break;
        }

        }



    }
}
