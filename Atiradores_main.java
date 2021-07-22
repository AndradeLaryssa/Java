package Estudar;

import Estudar.Atiradores;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        //opções
        Object[] options = {"Cadastrar Atirador", "Percentual de Policiais  com Título de Atirador de Elite", "Atirador que Realizou o Melhor Disparo", "Atirador que Realizou o Pior Disparo", "Quantidade de Homens que Acertaram o Alvo", "Média da Distância Obtida pelas Mulheres", "Sair"};

        //listas
        List<Atiradores> lista_atiradores = new ArrayList<>();
        List<Double> lista_homens = new ArrayList<>();
        List<Double> lista_mulheres = new ArrayList<>();



        //variáveis
        double atiradores_elite = 0;
        double homens_elite = 0;
        double pior_atirador = Integer.MIN_VALUE;
        String pior_nome = "";
        String pior_sexo = "";
        double melhor_atirador = Integer.MAX_VALUE;
        String melhor_nome = "";
        String melhor_sexo = "";
        int opc;

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de participantes:"));

        while (true){
            opc = JOptionPane.showOptionDialog(null, "Escolha uma opção abaixo:", "", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);

            switch (opc) {

                case 0:
                    //cadastro cidade
                    Atiradores atiradores = new Atiradores();
                    atiradores.cadastrarAtiradores();
                    lista_atiradores.add(atiradores);
                    lista_homens.add(atiradores.getDistancia());
                    lista_mulheres.add(atiradores.getDistancia());

                    if (atiradores.getDistancia() < 1) {
                       atiradores_elite += 1;
                       if (atiradores.getSexo().equals("M")){
                           homens_elite += 1;
                       }
                    }

                    if (atiradores.getSexo().equals("F")){
                        lista_mulheres.add(atiradores.getDistancia());
                    }

                    if (atiradores.getSexo().equals("M")){
                        lista_homens.add(atiradores.getDistancia());
                    }


                    if(pior_atirador < atiradores.getDistancia()) {
                        pior_atirador = atiradores.getDistancia();
                        pior_nome = atiradores.getNome();
                        pior_sexo = atiradores.getSexo();
                    }

                    if(melhor_atirador > atiradores.getDistancia()) {
                        melhor_atirador = atiradores.getDistancia();
                        melhor_nome = atiradores.getNome();
                        melhor_sexo = atiradores.getSexo();
                    }

                    break;

                case 1:
                    //percentual de policiais  com título de atirador de elite
                    JOptionPane.showMessageDialog(null, "O percentual de policiais que alcançaram o título de atiradores de elite foi de" + (atiradores_elite/lista_atiradores.size()));
                    break;

                case 2:
                    //atirador que realizou o melhor disparo
                    JOptionPane.showMessageDialog(null, "Atirador que realizou o melhor disparo:" + melhor_nome + " Sexo do atirador:" + melhor_sexo + " Distância do alvo:" + melhor_atirador);
                    break;

                case 3:
                    //atirador que realizou o pior disparo
                    JOptionPane.showMessageDialog(null, "Atirador que realizou o pior disparo:" + pior_nome + " Sexo do atirador:" + pior_sexo + " Distância do alvo:" + pior_atirador);
                    break;

                case 4:
                    //quantidade de homens que acertaram o alvo
                    JOptionPane.showMessageDialog(null, "Quantidade de Homens que Acertaram o Alvo:" + homens_elite);
                    break;
                case 5:
                    //media da distância obtida pelas mulheres
                    double sum = 0;
                    for (double cont : lista_mulheres) {
                        sum += cont;
                    }
                    JOptionPane.showMessageDialog(null, "Média da Distância Obtida pelas Mulheres" + (sum/lista_mulheres.size()));
                    break;
            }

        if (opc == 6){
            break;
        }
        }

        }
    }

