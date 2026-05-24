import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Ativ55{

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        
        int menu = 0;

        do{
            System.out.println("----------------------------");
            System.out.println("Menu");
            System.out.println("----------------------------");
            System.out.println("1- Próximo Cliente");
            System.out.println("2- Adicionar Cliente");
            System.out.println("3- Exibir Fila");
            System.out.println("4 - Sair");
            menu = sc.nextInt();

            switch(menu){
                    case 1:
                    System.out.println("----------------------------");
                    System.out.println("Próximo: "+fila.peek());
                    System.out.println("1 - Atender");
                    System.out.println("2 - Sair");
                    System.out.println("----------------------------");
                    int menu2 = sc.nextInt();
                        switch (menu2){
                            case 1:
                                if(fila.isEmpty()==false){
                                fila.remove();
                                }else{
                                    System.out.println("Fila vazia");
                                }
                                break;
                            case 2:
                                break;
                            }
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Informe o cliente: ");
                        System.out.println();
                        fila.add(sc.nextLine());
                        break;
                    case 3:
                        for(String ordem:fila){
                            System.out.println(ordem);
                        }
            }
        }while(menu != 4);
        sc.close();
        
        
    }
}