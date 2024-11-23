package br.edu.fatecpg.exception;

public class ExcecaoEmail extends Exception{
    public ExcecaoEmail(){
        super("O emaill precisa conter '@'! ");
    }
}
