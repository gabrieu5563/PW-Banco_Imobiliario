package br.com.etechoracio.bancoimobiliario.exceptions;

public class ValorNegativoException extends Exception
{
    public ValorNegativoException(String mensagem)
    {
        mensagem = "O valor da operação não pode ser negativo.";
    }
}
