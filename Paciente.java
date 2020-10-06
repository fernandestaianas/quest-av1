/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

import java.util.ArrayList;

/**
 *
 * @author One For All
 */
public class Paciente {
    public static ArrayList listaPaciente = new ArrayList();
    private String nome;
    private int sexo;
    private int peso;
    private int idade;
    private Double altura;

    public Paciente() {
    }

    public Paciente(String nome, int sexo, int peso, int idade, Double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }

    public static ArrayList getListaPaciente() {
        return listaPaciente;
    }

    public static void setListaPaciente(ArrayList listaPaciente) {
        Paciente.listaPaciente = listaPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public void InserirPaciente (Paciente pPacienteCadastrado){
        try {
            Paciente.listaPaciente.add(pPacienteCadastrado);
        } 
        catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
