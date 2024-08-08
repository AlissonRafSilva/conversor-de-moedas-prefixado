package br.edu.grupo4.conversorMoeda.main;

import br.edu.grupo4.conversorMoeda.constants.MoedasEnum;
import br.edu.grupo4.conversorMoeda.login.Login;
import java.util.Scanner;
import static br.edu.grupo4.conversorMoeda.util.UtilitarioConversaoDeMoedas.converterRealParaMoeda;


public class Main{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o usuário: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        new Login().auth(usuario, senha);
        if (new Login().auth(usuario, senha)){
            System.out.println(converterRealParaMoeda(1354, MoedasEnum.EURO));
        }
        else {
            System.out.println("Login ou senha invalido.");
        }
    }

}
