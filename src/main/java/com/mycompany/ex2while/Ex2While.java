package com.mycompany.ex2while;

import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta, escreva a mensagem "senha inválida".
Quando a senha for informada corretamente deve ser impressa a mensagem ""Acesso permitido"
e o algoritimo encerrado.
Considere a senha correta como 2002.
 */

public class Ex2While {

    public static void main(String[] args) {
        System.out.println("Digite a Senha:");
        
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();

        while (x != 2002) {

            System.out.println("Senha incorreta!");
            x = teclado.nextInt();

        }
        System.out.println("Acesso permitido!");

        teclado.close();
    }
}
