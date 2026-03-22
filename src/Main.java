import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu");
            System.out.println("1. addFirst");
            System.out.println("2. addLast");
            System.out.println("3. insertAt");
            System.out.println("4. removeFirst");
            System.out.println("5. removeLast");
            System.out.println("6. removeAt");
            System.out.println("7. deleteItem");
            System.out.println("8. get");
            System.out.println("9. find");
            System.out.println("10. set");
            System.out.println("0. Sair");
            System.out.print("Digite apenas o número: ");

            option = sc.nextInt();

            MyArrayList m = new MyArrayList();
            int[] list = {10, 20, 30, 40, 50};

            System.out.print("\nLista atual: ");
            display(list);

            switch (option) {
                case 1:
                    System.out.print("Valor para addFirst: ");
                    int item1 = sc.nextInt();
                    list = m.addFirst(item1, list);
                    System.out.print("Resultado: ");
                    display(list);
                    break;
                case 2:
                    System.out.print("Valor para addLast: ");
                    int item2 = sc.nextInt();
                    list = m.addLast(item2, list);
                    System.out.print("Resultado: ");
                    display(list);
                    break;
                case 3:
                    System.out.print("Posição: ");
                    int pos3 = sc.nextInt();
                    System.out.print("Valor: ");
                    int val3 = sc.nextInt();
                    list = m.insertAt(list.length - 1, pos3, val3, list);
                    System.out.print("Resultado: ");
                    display(list);
                    break;
                case 4:
                    list = m.removeFirst(list);
                    System.out.print("Resultado: ");
                    display(list);
                    break;
                case 5:
                    list = m.removeLast(list);
                    System.out.print("Resultado: ");
                    display(list);
                    break;
                case 6:
                    System.out.print("Posição para removeAt: ");
                    int pos6 = sc.nextInt();
                    list = m.removeAt(list, pos6);
                    System.out.print("Resultado: ");
                    display(list);
                    break;
                case 7:
                    System.out.print("Valor para deletar: ");
                    int val7 = sc.nextInt();
                    list = m.deleteItem(val7, list);
                    System.out.print("Resultado: ");
                    display(list);
                    break;
                case 8:
                    System.out.print("Posição para get: ");
                    int pos8 = sc.nextInt();
                    System.out.println("Valor: " + m.get(list, pos8));
                    break;
                case 9:
                    System.out.print("Posição para find: ");
                    int pos9 = sc.nextInt();
                    System.out.println("Valor: " + m.find(list, pos9));
                    break;
                case 10:
                    System.out.print("Posição: ");
                    int pos10 = sc.nextInt();
                    System.out.print("Novo valor: ");
                    int val10 = sc.nextInt();
                    list = m.set(val10, pos10, list);
                    System.out.print("Resultado: ");
                    display(list);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);

        sc.close();
    }

    static void display(int[] list) {
        System.out.print("[ ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i < list.length - 1) System.out.print(", ");
        }
        System.out.println(" ]");
    }
}