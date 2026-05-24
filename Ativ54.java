import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;

public class Ativ54 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int mat = 0;
        String alun = "";

        HashMap<Integer, String> alunos = new HashMap();
        
        alunos.put(1, "Queijovaldo");
        alunos.put(2, "Presuntilda");
        
        do{
            
            System.out.println("Menu 1: Cadastrar Aluno");
            System.out.println("Menu 2: Buscar Aluno");
            System.out.println("Menu 3: Remover Aluno");
            System.out.println("Menu 4: Listar Alunos");
            System.out.println("Menu 5: Sair");
            
            menu = sc.nextInt();
            
        switch(menu){
                case 1:
                    System.out.println("Informe matrícula");
                    mat = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Informe Nome do Aluno");
                    alun = sc.nextLine();
                    alunos.put(mat, alun);  
                    mat = 0;
                    alun = "";
                    break;
                case 2:
                    System.out.println("Informe Matrícula");
                    mat = sc.nextInt();
                    System.out.println(alunos.get(mat));
                    mat=0;
                    break;
                case 3:
                    System.out.println("Informe Matrícula");
                    mat = sc.nextInt();
                    alunos.remove(mat);
                    mat=0;
                    break;
                case 4:
                    System.out.println("Lista: ");
                    
                    for(Map.Entry<Integer, String> listy:alunos.entrySet()){
                            System.out.println("Matrícula: "+listy.getKey());
                            System.out.println("Nome: "+listy.getValue());
                            System.out.println("------------------");
                        }
                    break;
                        
        }
    }while(menu!=5);
        sc.close();
 
    
}
}