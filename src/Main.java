import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("GitTest");

        while (true) {
            System.out.println("Введите название задачи (для завершения введите 'end'):");
            System.out.println("1. Добавить задачу\n2. Вывести список задач\n3. Удалить задачу\n0. Выход");
            int input = scanner.nextInt();
            int count = 0;
            switch (input) {

                case 1:

                    System.out.println("Введите задачу для планирования(для  завершения введите end)");
                    String task = scanner.next();
                    if  ("end".equals(input)) {
                        for (int i=0; i< list.size(); i++){
                            System.out.println(list.get(i)+ "\n");
                        }
                        return;
                    }
                    list.add (task);
                    count++;
                    break;


                case 2:
                    System.out.println("\n");
                    System.out.println("Список задач:");
                    System.out.println("\n");
                    for (int i=0; i< list.size(); i++){
                        System.out.println((count++) +". "+ list.get(i)+ "\n");
                    }
                    break;

                case 3:
                    System.out.println("введите номер задачи, которую необходимо удалить");
                    int taskDel = scanner.nextInt();
                    list.remove(taskDel);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Неверно указано значение");
                    break;
            }


        }
    }
}