/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvmapa;

/**
 *
 * @author amanda.de.lima.Elbadawy
 */
public class RegistroCarro {
    String marca, modelo;
    int anoFabricacao, velocidadeMaxima, tempoCarregamento, autonomia;

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    double precoEnergia;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getTempoCarregamento() {
        return tempoCarregamento;
    }

    public void setTempoCarregamento(int tempoCarregamento) {
        this.tempoCarregamento = tempoCarregamento;
    }

    public double getPrecoEnergia() {
        return precoEnergia;
    }

    public void setPrecoEnergia(double preco) {
        this.precoEnergia = preco;
    }
    
    public void valorPorKmRodado(double pE,int tC, int au ){
        double valor = precoEnergia * tempoCarregamento;
        double valorGasto = valor / autonomia;
        String formt = String.format("%.2f", valorGasto);
        System.out.println("Valor por Km rodado no mês: R$" + formt);
    }
    public void valorEconomizadoPorMes(double pE,int tC, int au){
        double valor = precoEnergia * tempoCarregamento;
        double valorGasto = valor / autonomia;
        double valorKmRodado = valorGasto * 400;
        double valorEconomizado = 200 - valorKmRodado;
        String formt = String.format("%.2f", valorEconomizado);
        if(valorEconomizado > 0){
        System.out.println("Valor economizado é de: R$" + formt);
        }else{
            System.out.println("Não há economia");
        }
    }
    
}
