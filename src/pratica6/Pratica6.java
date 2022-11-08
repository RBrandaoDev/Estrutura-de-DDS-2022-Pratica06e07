package pratica6;

import java.util.Scanner;

public class Pratica6 {
    

    public static void main(String[] args) {
	Scanner le = new Scanner(System.in);
	Tree arv[] = new Tree[2];
        arv[0] = new Tree();
        arv[1] = new Tree();
	int opcao;
	long x;
	System.out.print("\n Programa Arvore binaria de long");
	do {
            System.out.print("\n***********************************");
            System.out.print("\nEntre com a opcao:");
            System.out.print("\n ----1: Inserir");
            System.out.print("\n ----2: Excluir");
            System.out.print("\n ----3: Pesquisar");
            System.out.print("\n ----4: Exibir");
            System.out.print("\n ----5: Mostrar Arvore");
            System.out.print("\n ----6: Comparar Arvores");
            System.out.print("\n ----7: Sair do programa");
            System.out.print("\n Obj: 0 para sair do comando.");
            System.out.print("\n***********************************");
            System.out.print("\n-> ");
            opcao = le.nextInt();
            switch (opcao) {
		case 1: {
                    do{
                        System.out.print("\n Informe o valor (long) -> ");
                        x = le.nextLong();
                        arv[0].inserir(x);
                    }while(x != 0);
                    break;
		}
		case 2: {
                    do{
                        System.out.print("\n Informe o valor (long) -> ");
                        x = le.nextLong();
                        if (!arv[0].remover(x))
                            System.out.print("\n Valor nao encontrado!");
                    }while( x != 0 );
                    break;
		}
		case 3: {
                    do{
                        System.out.print("\n Informe o valor (long) -> ");
                        x = le.nextLong();
                        if (arv[0].buscar(x) != null)
                            System.out.print("\n Valor Encontrado");
                        else
                            System.out.print("\n Valor nao encontrado!");
                    }while(x != 0);
                    break;
		}
		case 4: {
                    arv[0].caminhar();
                    break;
		}
                case 5: { 
                    arv[0].status();
                    break;
                }
                case 6:{
                    System.out.print("\nDigite a segunta arvore para comparacao");
                    do{
                        System.out.print("\n Informe o valor (long) -> ");
                        x = le.nextLong();
                        arv[1].inserir(x);
                    }while(x != 0);
                    
                    if(arv[0].getAltura() == arv[1].getAltura() && arv[0].getNos() == arv[0].getNos())
                        System.out.print("\nAs arvores são iguais");
                    else
                        System.out.print("\nAs arvores são iguais");
                    
                    break;
                }
            } // fim switch
	} while (opcao != 7);
    }
}
