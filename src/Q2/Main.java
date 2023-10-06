package Q2;

public class Main {
    public static void main(String[] args) {

        int[][] estante = new int[40][40];
        int[] produtos = {1, 2, 3, 4, 5, 0};
        int[] quantidade = {0, 0, 0, 0, 0, 0};
        int i, j;
        for (i = 0; i < estante.length; i++) {
            for (j = 0; j < estante[i].length; j++) {
                estante[i][j] = produtos[(int) (Math.random() * produtos.length)];
                System.out.print(estante[i][j] + "\t");
            }
            System.out.println("");
        }
        for (i = 0; i < estante.length; i++) {
            for (j = 0; j < estante[i].length; j++) {
                switch (estante[i][j]) {
                    case 1:
                        quantidade[0]++;
                        break;
                    case 2:
                        quantidade[1]++;
                        break;
                    case 3:
                        quantidade[2]++;
                        break;
                    case 4:
                        quantidade[3]++;
                        break;
                    case 5:
                        quantidade[4]++;
                        break;
                    case 0:
                        quantidade[5]++;
                        break;
                }
            }
        }
        System.out.println("\nQuantidade de Xampu: " + quantidade[0]);
        System.out.println("Quantidade de Condicionador: " + quantidade[1]);
        System.out.println("Quantidade de Hidratante: " + quantidade[2]);
        System.out.println("Quantidade de Tintura: " + quantidade[3]);
        System.out.println("Quantidade de Demaquiante: " + quantidade[4]);
        System.out.println("Quantidade de Vazio: " + quantidade[5]);
    }
}
