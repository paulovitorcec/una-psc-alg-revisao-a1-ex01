import java.util.Scanner;
//Autor: Paulo Vítor Amorim de Oliveira RA 323114192

public class PesquisaInfluenza { 

public static void main(String[] args) {
    
    
        Scanner scanner = new Scanner(System.in);

        String nome, cartaoVacina, sintomas,contato,viagem;
        int idade;
        int porcentagem =0;
        int tentativas =0;

        System.out.println("Informe seu nome:");
        nome = scanner.nextLine();

        System.out.println("Informe sua idade:");
        idade = scanner.nextInt();



            System.out.println("RESPONDA APENAS COM ''SIM OU NAO'' ");


            System.out.println("\nSeu cartão de vacina está em dia?");
            cartaoVacina = scanner.next();
            
            while(!cartaoVacina.equalsIgnoreCase("Sim") && !cartaoVacina.equalsIgnoreCase("Nao")) {
                tentativas++;
                if (tentativas == 3) {

                System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                return;
            }
                
                System.out.println("Seu cartão de vacina está em dia?");
                cartaoVacina = scanner.next();
        }
                if(cartaoVacina.equalsIgnoreCase("Nao")) {
                    porcentagem +=10;
                }


            System.out.println("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
            sintomas = scanner.next();

            while(!sintomas.equalsIgnoreCase("Sim") && !sintomas.equalsIgnoreCase("Nao")) {
                tentativas++;
                if(tentativas == 3) {

                    System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                    return;
                }
            
            System.out.println("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
            sintomas = scanner.next();
            }

            if(sintomas.equalsIgnoreCase("Sim")) {
                porcentagem +=30;
            }


            System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias?");
            contato = scanner.next();

            while(!contato.equalsIgnoreCase("Sim") && !contato.equalsIgnoreCase("Nao")) {
                tentativas++;
                if(tentativas == 3) {

                    System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                    return;
                }

            System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias?");
            contato = scanner.next();
            }

            if(!sintomas.equalsIgnoreCase("Sim") && !sintomas.equalsIgnoreCase("Nao")) {
                porcentagem +=30;
            }


            System.out.println("Está retornando de viagem realizada no exterior?");
            viagem = scanner.next();

            while(!viagem.equalsIgnoreCase("Sim") && !viagem.equalsIgnoreCase("Nao")) {
                tentativas++;
                if(tentativas == 3) {

                    System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                    return;
                }
            
            System.out.println("Está retornando de viagem realizada no exterior?");
            viagem = scanner.next();
            }

            if(sintomas.equalsIgnoreCase("Sim")) {
                porcentagem +=30;
            }
// Resultado do diagnóstico

            System.out.println("\nDIAGNÓSTICO:");

            System.out.println("\nNome:" +  nome);

            System.out.println("\nIdade:" +  idade);

            System.out.println("\nSeu cartão está em dia?" +  cartaoVacina);

            System.out.println("Teve algum dos sintomas recentemente?" +  sintomas);

            System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias?" +  contato);
            

            if(viagem.equalsIgnoreCase("Sim")) {
                System.out.println("Viajou recentemente para o exterior?" +  viagem +  ". \n Você ficará em observação durante 5 dias.");
            }
            
            else {
                System.out.println("Viajou recentemente para o exterior?" +  viagem);
            }

        System.out.println("A probabilidade de infecção é:" +   porcentagem + ("%"));
        if(porcentagem <= 30)
        {
            System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        }

        if(porcentagem <=60)
        {
            System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
        }

        if(porcentagem >=90)
        {
            System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado!");
        }

        scanner.close();

    }
}
