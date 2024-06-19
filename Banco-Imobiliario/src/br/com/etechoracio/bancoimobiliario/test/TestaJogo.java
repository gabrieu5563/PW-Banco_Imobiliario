package br.com.etechoracio.bancoimobiliario.test;

import br.com.etechoracio.bancoimobiliario.models.Jogador;

import java.util.ArrayList;
import java.util.List;

public class TestaJogo {
    public static void main(String[] args){
        //cria lista de jogador
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Rogerio", 10000));
        jogadores.add(new Jogador("Marion", 10000));
        jogadores.add(new Jogador("Edson", 10000));

        //jogada 1
        String sigla = "M";
        String operacao = "C";
        double valor = 5000;

        String finalSigla = sigla;
        Jogador jogador = jogadores.stream()
                //     'e' é o elemento da lista (algum jogador nesse caso)
                .filter(e -> e.getNome().startsWith(finalSigla))
                .findFirst().orElseThrow(); //find first devolve um option (caixa). se n achar ngm vai lançar a exceçao
        jogador.jogar(operacao, valor);

        //jogada 2
        sigla = "E";
        operacao = "C";
        valor = 3000;

        String finalSigla2 = sigla;
        jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla2))
                .findFirst().orElseThrow();
        jogador.jogar(operacao, valor);

        //jogada 3
        sigla = "M";
        String siglaRecebedor = "E";
        operacao = "C";
        valor = 5000;

        String finalSigla3 = sigla;
        jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla3))
                .findFirst().orElseThrow();
        Jogador recebedor = jogadores.stream()
                .filter(e -> e.getNome().startsWith(siglaRecebedor))
                .findFirst().orElseThrow();
        jogador.jogar(operacao, valor, recebedor);


        //lista e testes
        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");

        // Criando uma stream a partir do ArrayList
        nomes.stream()
                .filter(nome -> nome.startsWith("B"))
                .forEach(System.out::println);
        }
    }
