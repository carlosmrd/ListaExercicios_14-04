import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 {

    ArrayList<String[]> produtos = new ArrayList<>();

    public void executar(Scanner scanner) {

        //Criar um algoritmo para auxiliar na lojinha do Sr. Abu.
        //(a) O sistema deve permitir o cadastro de produtos. Cada item possui código único, nome,
        //valor unitário e tipo de unidade.
        //(b) Permitir o cadastro, alteração e a exclusão de produtos.
        //(c) Realizar a venda, para isso, é necessário informar o código do produto, e a quantidade.
        //Deve existir a opção de finalizar a compra.
        //(d) Definir a forma de pagamento
        //i. Pix - Mostrar o código.
        //ii. Cartão - Crédito ou débito - Solicitar os dados para pagamento
        //iii. Dinheiro - Solicitar o valor pago e informar o troco.
        
        int option;
        
        do {
            System.out.println("Escolha um opção para continuar: ");
            System.out.println("\t1 - Efetuar venda");
            System.out.println("\t2 - Cadastrar produto");
            System.out.println("\t3 - Alterar produto");
            System.out.println("\t4 - Excluir produto");
            System.out.println("\t5 - Listar produtos");
            System.out.println("\t0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida, tente novamente.");
                scanner.next();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> efetuarVenda(scanner);
                case 2 -> cadastrarProduto(scanner);
                case 3 -> alterarProduto(scanner);
                case 4 -> excluirProduto(scanner);
                case 5 -> listarProdutos();
                case 0 -> System.out.println("Encerrando.");
                default -> System.out.println("Opção inválida, tente novamente.");
            }

        } while (option != 0);
    }

    private void efetuarVenda(Scanner scanner) {
        double total = 0;
        ArrayList<String[]> carrinho = new ArrayList<>();

        while (true) {
            System.out.print("Informe o código do produto (ou digite 0 para finalizar): ");
            String codigo = scanner.nextLine();
            if (codigo.equals("0")) break;

            String[] produto = null;
            for (String[] p : produtos) {
                if (p[0].equals(codigo)) {
                    produto = p;
                    break;
                }
            }

            if (produto == null) {
                System.out.println("Produto não encontrado.");
                continue;
            }

            System.out.print("Quantidade: ");
            int qtd = scanner.nextInt();
            scanner.nextLine();

            double preco = Double.parseDouble(produto[2]) * qtd;
            total += preco;

            carrinho.add(new String[]{produto[1], String.valueOf(qtd), String.valueOf(preco)});
            System.out.println("Adicionado ao carrinho.");
        }

        if (carrinho.isEmpty()) {
            System.out.println("Nenhum item foi adicionado, venda cancelada.");
            return;
        }

        System.out.println("\nCarrinho: ");
        for (String[] item : carrinho) {
            System.out.println("\t" + item[0] + " x " + item[1] + " = R$" + item[2]);
        }

        System.out.printf("Total: R$ %.2f%n", total);
        escolherFormaPagamento(scanner, total);
    }

    private void escolherFormaPagamento(Scanner scanner, double total) {
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("\t1 - Pix");
        System.out.println("\t2 - Cartão");
        System.out.println("\t3 - Dinheiro");
        System.out.println("\t0 - Cancelar venda");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1 -> {
                System.out.println("Chave Pix: 123-456-789-012");
                System.out.println("Pagamento realizado via Pix.");
                System.out.println("Venda finalizada.");
            }
            case 2 -> {
                System.out.print("Crédito ou Débito? ");
                String tipo = scanner.nextLine();
                System.out.print("Digite os dados do cartão: ");
                String cartao = scanner.nextLine();
                System.out.println("Pagamento com cartão " + tipo + " processado.");
                System.out.println("Venda finalizada.");
            }
            case 3 -> {
                System.out.print("Informe o valor pago: ");
                double valorPago = scanner.nextDouble();
                double troco = valorPago - total;
                if (troco >= 0) {
                    System.out.printf("Troco: R$ %.2f%n", troco);
                    System.out.println("Venda finalizada.");
                } else {
                    System.out.println("Valor insuficiente, benda cancelada.");
                }
            }
            case 0 -> System.out.println("Venda cancelada.");
            default -> System.out.println("Opção inválida, venda cancelada.");
        }
    }

    private void cadastrarProduto(Scanner scanner) {
        System.out.print("Código do produto: ");
        String codigo = scanner.nextLine();

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Valor unitário: ");
        String valor = scanner.nextLine();

        System.out.print("Tipo de unidade (ex: Kg, Unid): ");
        String unidade = scanner.nextLine().toUpperCase();

        produtos.add(new String[]{codigo, nome, valor, unidade});
        System.out.println("Produto cadastrado com sucesso!");
    }

    private void alterarProduto(Scanner scanner) {
        System.out.print("Informe o código do produto que deseja alterar: ");
        String codigo = scanner.nextLine();
        for (String[] p : produtos) {
            if (p[0].equals(codigo)) {
                System.out.print("Novo nome: ");
                p[1] = scanner.nextLine();
                System.out.print("Novo valor: ");
                p[2] = scanner.nextLine();
                System.out.print("Nova unidade: ");
                p[3] = scanner.nextLine().toUpperCase();
                System.out.println("Produto alterado.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private void excluirProduto(Scanner scanner) {
        System.out.print("Informe o código do produto que deseja excluir: ");
        String codigo = scanner.nextLine();
        produtos.removeIf(p -> p[0].equals(codigo));
        System.out.println("O produto foi removido.");
    }

    private void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("\nLista de Produtos");
        for (String[] p : produtos) {
            System.out.println("\tCódigo: " + p[0] + " | Nome: " + p[1] + " | Valor: R$" + p[2] + " | Unidade: " + p[3]);
        }
    }
}
