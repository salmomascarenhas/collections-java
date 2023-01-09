package br.edu.salmomascarenhas.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Utilizando listas, faça um programa que faça 5 perguntas para uma
* pessoa sobre um crime. As perguntas são:
* 
* "Telefonou para a vítima?"
* 
* "Esteve no local do crime?"
* 
* "Mora perto da vítima?"
* 
* "Devia para a vítima?"
* 
* "Já trabalhou com a vítima?"
* 
* Se a pessoa responder positivamente a 2 questões ela deve ser
* classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
* "Assassina". Caso contrário, ela será classificado como "Inocente".
*/

public class Exercicio0 {

    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Perguntas: ");

        System.out.print("\nTelefonou para vítima? ");
        respostas.add(in.next().toLowerCase());

        System.out.print("Esteve no local do crime? ");
        respostas.add(in.next().toLowerCase());

        System.out.print("Mora perto da vítima? ");
        respostas.add(in.next().toLowerCase());

        System.out.print("Devia para vítima? ");
        respostas.add(in.next().toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        respostas.add(in.next().toLowerCase());

        int counter = 0;

        for (String resposta : respostas) {
            if (resposta.equals("s"))
                counter++;
        }

        switch (counter) {
            case 2:
                System.out.println(">> SUSPEITA <<");
                break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASSINO <<");
                break;
            default:
                System.out.println(">> INOCENTE <<");
                break;
        }
    }
}
