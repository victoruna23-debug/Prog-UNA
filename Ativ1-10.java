import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menuativ = -1;
		
		while(menuativ != 0)
		{
		    System.out.println("Atividade:");
		    System.out.println("0 - Sair.");
		    System.out.println(" ");
		    
		    System.out.println("Exercício 1: Par ou Ímpar");
		    System.out.println("Exercício 2: Maior de Dois");
		    System.out.println("Exercício 3: Calculadora com Menu");
		    System.out.println("Exercício 4: Validação de Entrada");
		    System.out.println("Exercício 5: Sentinela (parada no 0)");
		    System.out.println("Exercício 6: Simulador de Caixa");
		    System.out.println("Exercício 7: Desconto por Categoria");
		    System.out.println("Exercício 8: Contagem de Valores");
		    System.out.println("Exercício 9: Soma de 1 até N");
		    System.out.println("Exercício 10: Contagem regressiva e soma");
		    
		    menuativ = sc.nextInt();
		    
		        if(menuativ < 0 || menuativ > 10)
		        {
		        System.out.println("Opção Inválida");
		        
		        menuativ = -1;
		        System.out.println("Pressione ENTER para retornar ao Menu");
		            try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		        
		        }
		        if(menuativ == 1)
		        {
		            System.out.println("Exercício 1: Par ou Ímpar");
		            System.out.println(" ");
		            System.out.println("Digite um número: ");
		            
		            int npi = sc.nextInt();
		            
		            if((npi % 2) == 0)
		            {
		                System.out.println("Número "+npi+" é Par");
		            
		                System.out.println("Pressione ENTER para retornar ao Menu");
		            try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            else
		            {
		                System.out.println("Número "+npi+" é Ímpar");
		            
		                System.out.println("Pressione ENTER para retornar ao Menu");
		            try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		        }
		        if(menuativ == 2)
		        {
		            System.out.println("Exercício 2: Maior de dois");
		            System.out.println(" ");
		            
		            System.out.println("Digite o 1º Número: ");
		            int st_n = sc.nextInt();
		            
		            System.out.println("Digite o 2º Número: ");
		            int nd_n = sc.nextInt();
		            
		            if(st_n > nd_n)
		            {
		                System.out.println(st_n+" é maior que "+nd_n);
		                System.out.println("Pressione ENTER para retornar ao Menu");
		            try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            if(nd_n > st_n)
		            {
		                System.out.println(nd_n+" é maior que "+st_n);
		                System.out.println("Pressione ENTER para retornar ao Menu");
		            try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            if(st_n == nd_n)
		            {
		               System.out.println("Número iguais");
		                System.out.println("Pressione ENTER para retornar ao Menu");
		            try{
		            System.in.read();
		            }
		            catch(Exception e){
		            } 
		            }
		            }
		          if(menuativ == 3)
		          {
		            System.out.println("Exercício 3: Calculadora com Menu");
		            System.out.println(" ");
		            
		            int menucalc = -1;  // "Calc" is short for "Calculator", chat.
		            double ncalc1 = 0.0; // By the way, if anyone joined the stream recently, "calc" stands for "calculator". I'm just using slang.
		            double ncalc2 = 0.0; // And chat, if you are new to the stream, and you just joined, "calc" is short for "calculator". I'm just using slang, guys.
		            double ncalcres = 0.0;
		            
		            while(menucalc != 0) 
		            {
		            System.out.println("1- Soma.");
		            System.out.println("2- Subtração.");
		            System.out.println("3- Multiplicação.");
		            System.out.println("4- Divisão.");
		            System.out.println(" ");
		            System.out.println("0 - Sair.");
		            
		            menucalc = sc.nextInt();
		            
		            
		            if (menucalc < 0 || menucalc > 4) 
		            {
		                System.out.println("Opção Inválida");
		        
		            menucalc = -1;
		            System.out.println("Pressione ENTER para retornar ao Menu");
		            try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            if (menucalc == 1)
		            {
		                System.out.println("Soma");
		                System.out.println(" ");
		                System.out.println("Digite primeiro número: ");
		                ncalc1 = sc.nextDouble();
		                System.out.println("Digite segundo número: ");
		                ncalc2 = sc.nextDouble();
		                
		                ncalcres = ncalc1 + ncalc2;
		                
		                System.out.println(ncalc1 + " + " + ncalc2 + " = " + ncalcres);
		                System.out.println("Pressione ENTER para retornar ao Menu");
		            try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            if (menucalc == 2){
		                System.out.println("Subtração");
		                System.out.println(" ");
		                System.out.println("Digite primeiro número: ");
		                ncalc1 = sc.nextDouble();
		                System.out.println("Digite segundo número: ");
		                ncalc2 = sc.nextDouble();
		                
		                ncalcres = ncalc1 - ncalc2;
		                
		                System.out.println(ncalc1 + " - " + ncalc2 + " = " + ncalcres);
		                System.out.println("Pressione ENTER para retornar ao Menu");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            if (menucalc == 3){
		                System.out.println("Multiplicação");
		                System.out.println(" ");
		                System.out.println("Digite primeiro número: ");
		                ncalc1 = sc.nextDouble();
		                System.out.println("Digite segundo número: ");
		                ncalc2 = sc.nextDouble();
		                
		                ncalcres = ncalc1 * ncalc2;
		                
		                System.out.println(ncalc1 + " * " + ncalc2 + " = " + ncalcres);
		                System.out.println("Pressione ENTER para retornar ao Menu");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            if (menucalc == 4){
		                System.out.println("Divisão");
		                System.out.println(" ");
		                System.out.println("Digite primeiro número: ");
		                ncalc1 = sc.nextDouble();
		                System.out.println("Digite segundo número: ");
		                ncalc2 = sc.nextDouble();
		                
		                if(ncalc2 == 0){
		                    System.out.println("n/a, Divisão por 0");
		                    System.out.println("Pressione ENTER para retornar ao Menu");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		                }
		                else{
		                ncalcres = ncalc1 / ncalc2;
		                
		                System.out.println(ncalc1 + " / " + ncalc2 + " = " + ncalcres);
		                System.out.println("Pressione ENTER para retornar ao Menu");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            }
		            }
		          }
		          if (menuativ == 4){
		            System.out.println("Exercício 4: Validação de Entrada");
		            System.out.println(" ");
		            int nvalid = 0;
		            do{
		            
		            System.out.println("Digite um número entre 0 e 100: ");
		            nvalid = sc.nextInt();
		            
		                if(nvalid < 0 || nvalid > 100){
		                System.out.println("Valor Inválido");
		                System.out.println("Pressione ENTER para tentar novamente");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            else{
		                System.out.println("Valor válido");
		                System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		          }while(nvalid < 0 || nvalid > 100);
		        }
		        if (menuativ == 5){
		            System.out.println("Exercício 5: Sentinela (parada no 0)");
		            System.out.println(" ");
		            
		            int cont = 1;
		            int nbig = 0;
		            int nsmol = 69; // Não mudar o valor de nsmol. Só funciona com "69" (nice)
		            int nsent = -1;
		            
		            do{
		                System.out.println("Digite número " + cont);
		                nsent = sc.nextInt();
		                
		                cont ++;
		                
		                if(nsent > nbig && nsent != 0){
		                    nbig = nsent;
		                }
		                if(nsent != 0 && nsent < nsmol){
		                    nsmol = nsent;
		                }
		                
		            }while(nsent != 0);
		            System.out.println("Maior número: "+nbig);
		            System.out.println("Menor número: "+nsmol);
		            System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		        }
		        if (menuativ == 6){
		            System.out.println("Exercício 6: Simulador de Caixa");
		            System.out.println(" ");
		            
		            int menuatm = -1;
		            double accbal = 1000.0;
		            double accdep = 0.0;
		            double accext = 0.0;
		            
		            while(menuatm != 4){
		                System.out.println("Caixa Eletrônico");
		                System.out.println(" ");
		                
		                System.out.println("1 - Depósito");
		                System.out.println("2 - Saque");
		                System.out.println("3 - Saldo");
		                System.out.println("4 - Sair");
		                
		                menuatm = sc.nextInt();
		                
		                if(menuatm == 1){
		                    
		                    System.out.println("Depósito");
		                    System.out.println("Saldo atual: R$ "+accbal);
		                    
		                    System.out.print("Valor a depositar: R$");
		                    accdep = sc.nextDouble();
		                    accbal = accbal + accdep;
		                    
		                }
		                if(menuatm == 2 && accbal <= 0.0){
		                    System.out.println("Saque indisponível");
		                    System.out.println("Pressione ENTER para continuar");
		                    try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		                }
		                if(menuatm == 2 && accbal > 0.0){
		                    System.out.println("Saque");
		                    System.out.println("Saldo atual: R$ "+accbal);
		                    
		                    System.out.print("Valor a sacar: R$");
		                    accext = sc.nextDouble();
		                    accbal = accbal - accext;
		                    if (accbal < 0){
		                        accbal = accbal + accext;
		                        System.out.println("Valor inválido");
		                        System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		                    }
		                    if (accbal > 0){
		                    }
		                }
		                if(menuatm == 3){
		                    System.out.println("Saldo atual: R$ "+accbal);
		                    System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		                }
		                
		            }
		        }
		        if(menuativ == 7){
		            System.out.println("Exercício 7: Desconto por Categoria");
		            System.out.println(" ");
		            
		            double sale_cost = 0;
		            double sale_total = 0;
		            double disc1 = 0.05;
		            double disc2 = 0.10;
		            double disc3 = 0.15;
		            int disc_menu = -1;
		            int sale_menu = -1;
		            
		            while(sale_menu != 3){
		            System.out.println("Menu");
		            System.out.println(" ");
		                
		            System.out.println("1 - Compra");
		            System.out.println("2 - Descontos");
		            System.out.println("3 - Sair");
		            
		            sale_menu = sc.nextInt();
		            
		            if(sale_menu == 1){
		                
		                System.out.println("Menu Compra");
		                System.out.println(" ");
		                System.out.print("Valor da Compra: ");
		                
		                sale_cost = sc.nextDouble();
		                
		                System.out.println("Valor da compra: R$ "+sale_cost);
		                System.out.println(" ");
		                System.out.println("Selecione opção de desconto: ");
		                System.out.println("1 - Sem desconto");
		                System.out.println("2 - Desconto Comum "+disc1+"%");
		                System.out.println("3 - Desconto Premium "+disc2+"%");
		                System.out.println("4 - Desconto Funcionário "+disc3+"%");
		                
		                disc_menu = sc.nextInt();
		                
		                if(disc_menu == 1){
		                    
		                    sale_cost = sale_cost;
		                }
		                
		                if(disc_menu == 2){
		                    sale_cost = sale_cost - (sale_cost * disc1);
		                }
		                if(disc_menu == 3){
		                    sale_cost = sale_cost - (sale_cost * disc2);
		                }
		                if(disc_menu == 4){
		                    sale_cost = sale_cost - (sale_cost * disc3);
		                }
		                if(disc_menu < 0 || disc_menu > 4){
		                    System.out.println("Opção Inválida");
		                        System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		                }
		                
		                System.out.println("Valor final da compra: R$ "+sale_cost);
		                System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            
		                    }
		            if(sale_menu == 2){
		                System.out.println("Desconto Comum "+(disc1*100)+"%");
		                System.out.println("Desconto Premium "+(disc2*100)+"%");
		                System.out.println("Desconto Funcionário "+(disc3*100)+"%");
		                System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            		            if(sale_menu < 0 || sale_menu > 3){
		                    System.out.println("Opção Inválida");
		                        System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            }
		        }
		        if(menuativ == 8){
		            System.out.println("Exercício 8: Contagem de Valores");
		            System.out.println(" ");
		            
		            int n_pos = 0;
		            int n_neg = 0;
		            int n_null = 0;
		            
		            for (int i = 0; i < 10; i++){
		                
		                System.out.println("Informe n"+(i+1)+" :");
		                int num = sc.nextInt();
		                
		                if(num > 0){
		                    n_pos++;
		                }
		                if(num < 0){
		                    n_neg++;
		                }
		                if(num == 0){
		                    n_null++;
		                }
		            }
		            System.out.println("Números Positivos: "+n_pos);
		            System.out.println("Números Negativos: "+n_neg);
		            System.out.println("Zeros: "+n_null);
		            
		            System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		                
		            }
		            if(menuativ == 9){
		            System.out.println("Exercício 9: Soma de 1 até N");
		            System.out.println(" ");
		            
		            int sumtt = 0;
		            
		            System.out.println("Informe n:");
		            int sumtiln = sc.nextInt();
		            
		            while(sumtiln > 0){
		                sumtt+=sumtiln;
		                sumtiln--;
		            }
		            System.out.println("Valor total: "+sumtt);
		            System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		            if(menuativ == 10){
		            System.out.println("Exercício 10: Contagem regressiva e soma");
		            System.out.println(" ");
		            
		            int sumtt = 0;
		            
		            System.out.println("Informe n:");
		            int sumtiln = sc.nextInt();
		            
		            while(sumtiln > 0){
		                
		                System.out.print(sumtiln+" ");
		                sumtt+=sumtiln;
		                sumtiln--;
		            }
		            System.out.println(" ");
		            System.out.println("Valor total: "+sumtt);
		            System.out.println("Pressione ENTER para continuar");
		                try{
		            System.in.read();
		            }
		            catch(Exception e){
		            }
		            }
		}
	}
}