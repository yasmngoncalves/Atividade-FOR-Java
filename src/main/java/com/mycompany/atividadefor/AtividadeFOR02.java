/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadefor;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeFOR02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a sua tabuada: ");
        int numero = scanner.nextInt();  // Recebe o número digitado pelo usuário

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {  // Laço que vai de 1 a 10
            int resultado = numero * i;  // Calcula o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + resultado);  // Imprime o resultado
        }

        scanner.close();  // Fecha o scanner   
    }
}
