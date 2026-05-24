package Ativ57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;

import Ativ56.Livro;

import java.util.List;
import java.util.ArrayList;

public class Ativ57 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pedido> fome = new ArrayList<>();
        
        int cont = 0;
        int menu = -1;
        double valor = 0.0;

        do{
            System.out.println("----------------------------");
            System.out.println("Menu");
            System.out.println();
            System.out.println("1- Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status de um pedido");
            System.out.println("4 - Buscar pedido pelo número");
            System.out.println("5 - Mostrar valor total dos pedidos");
            System.out.println("0- Sair");
            System.out.println("----------------------------");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1:
                    Pedido pedido = new Pedido();

                    fome.add(pedido);
                    fome.get(cont).npedido = cont;
                    System.out.println("Informe o nome do Cliente");
                    fome.get(cont).nomclien = sc.nextLine();
                    System.out.println("Informe o item do pedido");
                    fome.get(cont).itpedido = sc.nextLine();
                    System.out.println("Informe o valor do pedido:");
                    System.out.print("R$: ");
                    fome.get(cont).valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.println();
                    fome.get(cont).status = "PENDENTE";
                    cont++;
                    break;

                case 2:
                    if(fome.isEmpty()==true){
                        System.out.println("0 pedidos");
                    }else{
                    for(Pedido lista : fome){
                        System.out.println("Código : "+lista.npedido);
                        System.out.println("Cliente : "+lista.nomclien);
                        System.out.println("Item : "+lista.itpedido);
                        System.out.println("Valor : R$ "+lista.valor);
                        System.out.println("Status : "+lista.status);
                        System.out.println("----------------------------");
                    }
                }
                break;
                case 3:
                    System.out.println("Informe código do pedido: ");
                    int cod = sc.nextInt();
                    for(Pedido lista : fome){
                        if(lista.npedido == cod){
                            int menu2 = -1;
                            System.out.println("Informe Status do pedido:"); 
                            System.out.println("1- PENDENTE"); 
                            System.out.println("2 - PREPARANDO"); 
                            System.out.println("3- FINALIZADO"); 
                            System.out.println("0- Cancelar");

                            menu2 = sc.nextInt();

                            switch (menu2){
                                case 1:
                                    fome.get(cod).status = "PENDENTE";
                                    break;
                                case 2:
                                    fome.get(cod).status = "PREPARANDO";
                                    break;
                                case 3:
                                    fome.get(cod).status = "FINALIZADO";
                                    break;
                            }
                        }else{
                            System.out.println("Pedido não existe");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Informe código do pedido: ");
                    int codi = sc.nextInt();
                    for(Pedido lista : fome){
                        if(lista.npedido == codi){
                        System.out.println("Código : "+lista.npedido);
                        System.out.println("Cliente : "+lista.nomclien);
                        System.out.println("Item : "+lista.itpedido);
                        System.out.println("Valor : R$ "+lista.valor);
                        System.out.println("Status : "+lista.status);
                        System.out.println("----------------------------");
                        }
                    }
                    break;
                case 5:
                    for(Pedido lista : fome){
                        valor += lista.valor;
                    }
                    System.out.println("Valor total dos pedidos: R$ "+valor);
                    valor = 0;

            }
        }while(menu != 0);
        sc.close();

}
}