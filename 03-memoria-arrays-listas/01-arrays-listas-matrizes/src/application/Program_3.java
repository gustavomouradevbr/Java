package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program_3 {
    public static void main(String[] args) {
        
        // Criando a lista: ArrayList permite que o tamanho mude conforme adicionamos itens
        List<String> list = new ArrayList<>();
        
        // .add: Adiciona elementos ao final da lista por padrão
        list.add("Maria"); // Posição 0
        list.add("Bob");   // Posição 1
        list.add("Alex");  // Posição 2
        list.add("Anna");  // Posição 3
        
        // .add(index, valor): Insere "eee" na posição 2 e "empurra" o restante para a frente
        list.add(2, "eee");
        
        // .remove(index): Remove quem está na posição 0 (Maria) e reorganiza os índices
        list.remove(0);
        
        // For-each: Percorre a lista toda do início ao fim
        for (String x : list) {
            System.out.println(x);
        }
        
        System.out.println("-------------------");
        
        // .removeIf: Remove da lista todos que atendem à condição (começa com 'M')
        // É uma função lambda (x -> ...)
        list.removeIf(x -> x.charAt(0) == 'M');
        
        for (String x : list) {
            System.out.println(x);
        }
        
        System.out.println("-------------------");
        
        // .indexOf: Procura a posição de um item. Se não achar, retorna -1
        System.out.println(list.indexOf("Bob"));
        System.out.println(list.indexOf("sla"));

        System.out.println("-------------------");
        
        // Fluxo: filtra a lista original e cria uma NOVA lista apenas com nomes que comecam com 'A'
        // .collect: transforma o fluxo de volta para uma lista
        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());
        
        for (String x : result) {
            System.out.println(x);
        }
        
        System.out.println("-------------------");

        // .findFirst().orElse(null): Tenta pegar o primeiro que começa com 'A'
        // Se a lista estiver vazia ou ninguém atender ao filtro, retorna nulo (null)
        
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}