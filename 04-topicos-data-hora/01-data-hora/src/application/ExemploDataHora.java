package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Exemplo rapido de API de data/hora.
 *
 * <p>Objetivo: comparar quando usar LocalDate (sem fuso/horario) e Instant
 * (momento absoluto da linha do tempo).</p>
 */
public class ExemploDataHora {

    public static void main(String[] args) {
        // LocalDate representa apenas data (ano-mes-dia), sem hora e sem fuso.
        LocalDate courseStartDate = LocalDate.of(2026, 4, 16);

        // Instant representa um ponto universal no tempo (UTC), ideal para logs/eventos.
        Instant now = Instant.now();

        // Formata LocalDate para leitura humana no padrao brasileiro.
        DateTimeFormatter brDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("=== Exemplo LocalDate ===");
        System.out.println("Inicio do curso: " + courseStartDate.format(brDate));
        System.out.println("Dia seguinte: " + courseStartDate.plusDays(1).format(brDate));

        System.out.println("\n=== Exemplo Instant ===");
        System.out.println("Agora em UTC: " + now);

        // Converte Instant para horario local so no momento da exibicao.
        System.out.println("Agora no horario de Sao Paulo: "
                + now.atZone(ZoneId.of("America/Sao_Paulo")));

        // Dica pratica: persista Instant no banco e formate para o usuario na camada de saida.
    }
}
