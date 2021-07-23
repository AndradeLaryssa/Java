package Estudar;

import javax.swing.*;

public class Estados{

    private String codigo;
    private String nome;
    private double pacientes;
    private double obitos;

    public void cadastrarEstados(){
        this.codigo = JOptionPane.showInputDialog("Digite aqui o código do estado:");
        this.nome = JOptionPane.showInputDialog("Digite aqui o nome do estado:");
        this.pacientes = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o número de pacientes que testaram positivo:"));
        this.obitos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o número de óbitos:"));
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPacientes() {
        return pacientes;
    }

    public void setPacientes(double pacientes) {
        this.pacientes = pacientes;
    }

    public double getObitos() {
        return obitos;
    }

    public void setObitos(double obitos) {
        this.obitos = obitos;
    }
}
