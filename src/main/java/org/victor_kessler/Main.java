package org.victor_kessler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int control = -1;

        while (control != 0) {
            System.out.println("Indique qual ação deseja executar: " +
                    "\n1 - Novo cadastro" +
                    "\n2 - Remover cadastrado" +
                    "\n3 - Ver cadastros realizados" +
                    "\n4 - Atualizar dados cadastrais" +
                    "\n0 - Sair\n\n");

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