/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvmapa;

import java.util.Scanner;

/**
 *
 * @author amanda.de.lima.Elbadawy
 */
public class AtvMapa {

    public static void main(String[] args) {
        RegistroCarro registroCarro = new RegistroCarro();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n********* BEM VINDO *********");
        System.out.println("\nVAMOS DESCOBRIR QUANTO VOCÊ IRÁ ECONOMIZAR ");
        
        System.out.print("Digite a marca do carro: ");
        registroCarro.setMarca(sc.nextLine());
        System.out.print("Digite o modelo do carro: ");
        registroCarro.setModelo(sc.nextLine());
        System.out.print("Digite o ano de fabricação do carro: ");
        registroCarro.setAnoFabricacao(sc.nextInt());
        System.out.print("Digite velocidade maxima do carro: ");
        registroCarro.setVelocidadeMaxima(sc.nextInt());
        System.out.print("Digite o tempo de carregamento do carro: ");
        registroCarro.setTempoCarregamento(sc.nextInt());
        System.out.print("Digite a autonomia do carro: ");
        registroCarro.setAutonomia(sc.nextInt());
        System.out.print("Digite o preço da energia: ");
        registroCarro.setPrecoEnergia(sc.nextDouble());
        
        System.out.println("------------------------------------------\n");
        
        registroCarro.valorPorKmRodado(registroCarro.getPrecoEnergia(), registroCarro.getTempoCarregamento(), registroCarro.getAutonomia());
        registroCarro.valorEconomizadoPorMes(registroCarro.getPrecoEnergia(), registroCarro.getTempoCarregamento(), registroCarro.getAutonomia());
    }
}
