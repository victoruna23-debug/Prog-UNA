
package notificação;

import java.util.Scanner;
public class Notificação {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        NotificacaoEmail email = new NotificacaoEmail();
        NotificacaoSMS SMS = new NotificacaoSMS();
        NotificacaoWhatsApp zapzap = new NotificacaoWhatsApp();
        
        
        int menu = -1;
        
        do{
            System.out.println("Menu");
            System.out.println("1 - E-mail");
            System.out.println("2 - SMS");
            System.out.println("3 - WhatsApp");
            System.out.println("0 - Sair");
            
            menu = sc.nextInt();
            sc.nextLine();
            
            switch(menu){
                
                case 1:
                    System.out.print("Digite a mensagem:");
                    email.enviar(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Digite a mensagem:");
                    SMS.enviar(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Digite a mensagem:");
                    zapzap.enviar(sc.nextLine());
                    break;
            }
        }while(menu != 0);
    }
    
}
