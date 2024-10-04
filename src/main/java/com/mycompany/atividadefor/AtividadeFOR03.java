/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadefor;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeFOR03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabela de quadrados: ");
        int numero = scanner.nextInt();  // Recebe o número digitado pelo usuário

        System.out.println("Tabela de quadrados de 1 até " + numero + ":");

        for (int i = 1; i <= numero; i++) {  // Loop que vai de 1 até o número informado pelo usuário
            int quadrado = i * i;  // Calcula o quadrado do número atual
            System.out.println(i + "² = " + quadrado);  // Imprime o número e seu quadrado
        }

        scanner.close();  // Fecha o scanner 
    }
}
