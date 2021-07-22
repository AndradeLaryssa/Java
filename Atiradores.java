package Estudar;

import javax.swing.*;

public class Atiradores{

    private String nome;
    private String sexo;
    private double distancia;

    //cadastrar atiradores
    public void cadastrarAtiradores() {

        this.nome = JOptionPane.showInputDialog("Digite aqui o nome do atirador:");
        this.sexo = JOptionPane.showInputDialog( "Digite aqui o sexo do atirador[M/F]:");
        this.distancia= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite aqui a distância(em centímetros) em relação ao alvo:"));

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}


