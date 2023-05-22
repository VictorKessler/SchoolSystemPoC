package org.victor_kessler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int control = -1;

        while (control != 0) {
            System.out.println("""
                                       Indique qual ação deseja executar:\s
                                       1 - Novo cadastro
                                       2 - Remover cadastrado
                                       3 - Ver cadastros realizados
                                       4 - Atualizar dados cadastrais
                                       0 - Sair

                                       """);

            int option = scanner.nextInt();

            switch (option) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 0:
                    ++control;
                    break;
            }

        }

    }
}