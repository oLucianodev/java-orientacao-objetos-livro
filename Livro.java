import java.util.Scanner;
public class Livro {
   public static void main(String[] args) {
	   Scanner teclado = new Scanner(System.in);
	   Biblioteca l1,l2,l3,l4,l5; //livros ; l1 = livro 1 ....
	   l1 = new Biblioteca ("pequeno principe","Juninho",2000,"infantil",2,3,"disponivel");
	   l2 = new Biblioteca ("Ney o caos","luciano",2003,"adolescente",4,5,"disponivel");
	   l3 = new Biblioteca ("Messi pipoca","duda",1990,"adulto",3,1,"disponivel");
	   l4 = new Biblioteca ("Cr7 o rei","gena",2020,"infantil",4,5,"disponivel");
	   l5 = new Biblioteca ("alice no pais das maravilhas","ellen",1999,"adulto",1,1,"disponivel");
	   int opcao;
	   
	do {
	   System.out.println("biblioteca:");
	   System.out.println("1- lista de livros");
       System.out.println("2- Pegar um livro emprestado ");
       System.out.println("3- Devolver um livro");
	   System.out.println("0- Sair ");
	   System.out.println("digite aqui uma das opcoes:");
	   opcao = teclado.nextInt();
	   switch (opcao){
		   case 1:
		   System.out.println(l1.exibirLivros());
		   System.out.println(l2.exibirLivros());
		   System.out.println(l3.exibirLivros());
		   System.out.println(l4.exibirLivros());
		   System.out.println(l5.exibirLivros());
		   break;
		   case 2:
			   System.out.print("Digite o número do livro para emprestar (1 a 5): ");
               int numEmp = teclado.nextInt();
               boolean okEmp = false;

               if (numEmp == 1) okEmp = l1.emprestar();
               else if (numEmp == 2) okEmp = l2.emprestar();
               else if (numEmp == 3) okEmp = l3.emprestar();
               else if (numEmp == 4) okEmp = l4.emprestar();
               else if (numEmp == 5) okEmp = l5.emprestar();

               if (okEmp) {
                   System.out.println("✅ Livro emprestado com sucesso!");
               } else {
                   System.out.println("⚠ Esse livro já está emprestado ou opção inválida!");
               }
			break;
		   case 3:
			   System.out.print("Digite o número do livro para devolver (1 a 5): ");
               int numDev = teclado.nextInt();
               boolean okDev = false;

               if (numDev == 1) okDev = l1.devolver();
               else if (numDev == 2) okDev = l2.devolver();
               else if (numDev == 3) okDev = l3.devolver();
               else if (numDev == 4) okDev = l4.devolver();
               else if (numDev == 5) okDev = l5.devolver();

               if (okDev) {
                   System.out.println("✅ Livro devolvido com sucesso!");
               } else {
                   System.out.println("⚠ Esse livro já estava disponível ou opção inválida!");
               }
			   break;
		   case 0:
			   System.out.println(" Menu fechado, obrigado por utilizar nossos servicos!");
			   break;
			   default: 
				   System.out.println("opcao invalida");
			
		   }
	
	} while (opcao != 0);
	  
	
	
	
	
	
	
	
	
	
	teclado.close();
	
}
}