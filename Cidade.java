package Estudar;

import javax.swing.*;

public class Cidade{

    private String nome;
    private double carro;
    private double moto;
    private double acidente;
    private double indice;

    //cadastrar cidades
    public void cadastrarCidade() {

        this.nome = JOptionPane.showInputDialog("Digite aqui o nome da cidade:");
        this.carro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o número de carros de passeios da cidade:"));
        this.moto = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite aqui o número de motocicletas da cidade:"));
        this.acidente = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o número de acidentes de trânsito em 2018:"));
        this.indice = this.acidente/(this.carro + this.moto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCarro() {
        return carro;
    }

    public void setCarro(double carro) {
        this.carro = carro;
    }

    public double getMoto() {
        return moto;
    }

    public void setMoto(double moto) {
        this.moto = moto;
    }

    public double getAcidente() {
        return acidente;
    }

    public void setAcidente(double acidente) {
        this.acidente = acidente;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }
}


