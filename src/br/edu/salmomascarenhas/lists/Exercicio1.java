package br.edu.salmomascarenhas.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * @autor Salmo Mascarenhas
 * Faça um programa que receba a temperatura média dos 6
 * primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e
 * mostre todas as temperaturas acima desta média, e em que
 * mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
 * – Fevereiro e etc).
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> temperaturaSemestral = new ArrayList<Integer>();
        List<String> mesesDoAno = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho");
        int media = 0;
        int soma = 0;

        System.out.println("Digite a média do mês de janeiro: ");
        temperaturaSemestral.add(in.nextInt());

        System.out.println("Digite a média do mês de fevereiro: ");
        temperaturaSemestral.add(in.nextInt());

        System.out.println("Digite a média do mês de março: ");
        temperaturaSemestral.add(in.nextInt());

        System.out.println("Digite a média do mês de abril: ");
        temperaturaSemestral.add(in.nextInt());

        System.out.println("Digite a média do mês de maio: ");
        temperaturaSemestral.add(in.nextInt());

        System.out.println("Digite a média do mês de junho: ");
        temperaturaSemestral.add(in.nextInt());

        System.out.println("Digite a média do mês de julho: ");
        temperaturaSemestral.add(in.nextInt());

        if (temperaturaSemestral.isEmpty())
            System.exit(0);

        // Soma todas a temperaturas.
        for (int temperatura : temperaturaSemestral) {
            soma += temperatura;
        }

        media = soma / temperaturaSemestral.size();

        for (int i = 0; i < temperaturaSemestral.size(); i++) {
            if (temperaturaSemestral.get(i) > media) {
                System.out.println((i + 1) + " - " + mesesDoAno.get(i));
            }
        }

        in.close();
    }
}
