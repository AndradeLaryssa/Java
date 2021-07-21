package Estudar;

import Estudar.Cidade;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        //opções
        Object[] options = {"Cadastrar Cidade", "Indice de Acidentes", "Média de Carros", "Média de Motos", "Média de Acidentes com mais de 2000 carros", "Média de Acidentes com mais de 1000 motos", "Sair"};

        //listas
        List<Cidade> lista_cidades = new ArrayList<>();
        List<Double> lista_acidentes2000 = new ArrayList<>();
        List<Double> lista_acidentes1000 = new ArrayList<>();
        List<Double> lista_carros = new ArrayList<>();
        List<Double> lista_motos = new ArrayList<>();


        //variáveis
        double maior_indice = Integer.MIN_VALUE;
        String maior_cidade = "";
        double menor_indice = Integer.MAX_VALUE;
        String menor_cidade = "";
        int opc;


        while (true){
            opc = JOptionPane.showOptionDialog(null, "Escolha uma opção abaixo:", "", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);

            switch (opc) {

                case 0:
                    //cadastro cidade
                    Cidade cidade = new Cidade();
                    cidade.cadastrarCidade();
                    lista_cidades.add(cidade);
                    lista_carros.add(cidade.getCarro());
                    lista_motos.add(cidade.getMoto());

                    if (cidade.getCarro() > 2000) {
                        lista_acidentes2000.add(cidade.getAcidente());
                    }

                    if (cidade.getMoto() > 1000) {
                        lista_acidentes1000.add((cidade.getAcidente()));
                    }

                    if (maior_indice < cidade.getIndice()) {
                        maior_indice = cidade.getIndice();
                        maior_cidade= cidade.getNome();
                    }

                    if(menor_indice > cidade.getIndice()) {
                        menor_indice = cidade.getIndice();
                        menor_cidade = cidade.getNome();
                    }

                    break;

                case 1:
                    //indice de acidentes
                    JOptionPane.showMessageDialog(null, "Maior índice de acidentes:" + maior_indice + " Cidade com o maior índice de acidentes:" + maior_cidade);
                    JOptionPane.showMessageDialog(null, "Menor índice de acidentes:" + menor_indice + " Cidade com o menor índice de acidentes:" + menor_cidade);
                    break;

                case 2:
                    //media de carros
                    double sum = 0;
                    for (double contador : lista_carros) {
                        sum += contador;
                    }
                    JOptionPane.showMessageDialog(null, "Média de carros:" + (sum/lista_carros.size()));
                    break;

                case 3:
                    //media de motos
                    double sum2 = 0;
                    for (double contador : lista_motos) {
                        sum2 += contador;
                    }
                    JOptionPane.showMessageDialog(null, "Média de motos:" + (sum2/lista_motos.size()));
                    break;

                case 4:
                    //media de acidentes em cidades com mais de 2000 carros
                    double sum3 = 0;
                    for (double contador : lista_acidentes2000) {
                        sum3 += contador;
                    }
                    JOptionPane.showMessageDialog(null, "Média de acidentes em cidades com mais de 2000 carros:" + (sum3/lista_acidentes2000.size()));
                    break;

                case 5:
                    //media de acidentes em cidades com mais de 1000 motos
                    double sum4 = 0;
                    for (double contador : lista_acidentes1000) {
                        sum4 += contador;
                    }
                    JOptionPane.showMessageDialog(null, "Média de acidentes em cidades com mais de 1000 motos:" + (sum4/lista_acidentes1000.size()));
                    break;
            }

        if (opc == 6){
            break;
        }

        }
    }
}
