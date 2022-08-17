
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor Hugo
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Artigo> armazem = new ArrayList<>();

        Artigo art1 = new Artigo(1, true, true);

        armazem.add(art1);

        System.out.println("Introduza o codigo do artigo para compra: ");
        int codigo = sc.nextInt();
        System.out.println("Introduza o tipo de encomenda: ");
        String tipo = sc.next();

        if (tipo.equals("sistema")) {
            for (Artigo artigo : armazem) {
                if (artigo.getCodigo() == codigo) {
                    armazem.remove(artigo);
                    System.out.println("Artigo retirado do armazem");
                    break;
                } else {
                    System.out.println("Artigo nao encontrado no armazem, tarefa encerrada");
                    System.out.println("Requisicao devolvida. Requerente notificado.");
                    break;
                }
            }

            if (art1.isEmbalado() == true) {

                System.out.println("Artigo embalado!");
            } else {
                System.out.println("Artigo enviado direto para expedicao!");
            }

            if (art1.isDefeito() == true) {
                System.out.println("Artigo com defeito");
                System.out.println("Notificar coordenacao e requerente");

            } else {
                System.out.println("Artigo sem defeito");
                System.out.println("Pedido expedido");
                System.out.println("Requerente Notificado");
            }

        } else {
            System.out.println("Nao e uma encomenda de sistema ou loja");
        }

    }

}
