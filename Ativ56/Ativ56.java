package Ativ56;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ativ56 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> library = new ArrayList<>();
        int cont = 0;
        
        int menu = -1;

        do{
            System.out.println("----------------------------");
            System.out.println("Menu");
            System.out.println();
            System.out.println("1- Cadastrar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Emprestar Livro");
            System.out.println("4 - Devolver Livro");
            System.out.println("0- Sair");
            System.out.println("----------------------------");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1:
                    Livro livro = new Livro();

                    library.add(livro);
                    System.out.println("Informe o nome do livro");
                    library.get(cont).tit = sc.nextLine();
                    System.out.println("Informe o código do livro");
                    library.get(cont).cod = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Informe o autor do livro");
                    library.get(cont).aut = sc.nextLine();
                    library.get(cont).ava = true;
                    cont++;
                    break;

                case 2:
                    if(library.isEmpty()==true){
                        System.out.println("Insira um Livro");
                    }else{
                    for(Livro lista : library){
                        System.out.println("Título : "+lista.tit);
                        System.out.println("Código : "+lista.cod);
                        System.out.println("Autor : "+lista.aut);
                        if(lista.ava==true){
                            System.out.println("Disponível : Sim");
                        }else{
                            System.out.println("Disponível : Não");
                        }
                        System.out.println("----------------------------");
                    }
                }
                break;
                case 3:
                    System.out.println("Informe código do livro: ");
                    int cod = sc.nextInt();
                    for(Livro lista: library){
                        if(lista.cod == cod){
                            if(lista.ava==true){
                            lista.ava = false;
                            }else{
                                System.out.println("Livro indisponível");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Informe código do livro: ");
                    int codi = sc.nextInt();
                    for(Livro lista: library){
                        if(lista.cod == codi){
                            lista.ava = true;
                        }
                    }
                    break;


            }
        }while(menu != 0);
        sc.close();

    }// Leanin
}