package br.edu.grupo4.conversorMoeda.util;

import br.edu.grupo4.conversorMoeda.constants.MoedasEnum;
import static br.edu.grupo4.conversorMoeda.constants.Constants.*;

public class UtilitarioConversaoDeMoedas {

    public static double converterRealParaMoeda(double valorEmReal, MoedasEnum moeda) {
        return switch (moeda) {
            case DOLAR -> valorEmReal / VALOR_DOLAR;
            case EURO -> valorEmReal / VALOR_EURO;
            case LIBRA -> valorEmReal / VALOR_LIBRA;
            case BITCOIN -> valorEmReal / VALOR_BITCOIN;
            default -> throw new IllegalArgumentException("Moeda não suportada");
        };
    }

    public static double converterMoedaParaReal(double valorEmMoeda, MoedasEnum moeda) {
        return switch (moeda) {
            case DOLAR -> valorEmMoeda * VALOR_DOLAR;
            case EURO -> valorEmMoeda * VALOR_EURO;
            case LIBRA -> valorEmMoeda * VALOR_LIBRA;
            case BITCOIN -> valorEmMoeda * VALOR_BITCOIN;
            default -> throw new IllegalArgumentException("Moeda não suportada");
        };
    }
}