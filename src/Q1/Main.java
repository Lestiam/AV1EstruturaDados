package Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Stack pilha = new Stack();
        Scanner sc;

        sc = new Scanner(new File("src/docs/links.txt"));
        while (sc.hasNextLine()) {
            pilha.push(sc.nextLine());
        }

        System.out.println("Pilha de links: " + pilha);
        System.out.println("Tamanho da Pilha: " + pilha.size());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite um link para exclusão: ");
        String link = sc2.nextLine();
        if (pilha.contains(link)) {
            pilha.remove(link);
            System.out.println("Link removido com sucesso!");
        } else {
            System.out.println("Link Inexistente!");
        }
        System.out.println("Tamanho da Pilha: " + pilha.size());
        System.out.println("Pilha de links: " + pilha);

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Digite um link para consulta: ");
        String link2 = sc3.nextLine();
        if (pilha.contains(link2)) {
            System.out.println("Link Encontrado!");
        } else {
            System.out.println("Link não Encontrado!");

        }
    }
}
