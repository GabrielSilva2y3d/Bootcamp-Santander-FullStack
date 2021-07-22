package br.com.digital.innovation.one.aula2;

public class FuncaoAltaOrdem {

    @FunctionalInterface
    interface Calculo {
        int calcular(int a, int b);
    }

    public static int executarOperacao(Calculo calculo,int a, int b){
        return calculo.calcular(a,b);
    }

    public static void main(String[] args) {
        Calculo soma =  (a, b) -> a + b;
        Calculo sub =  (a, b) -> a - b;
        Calculo mult =  (a, b) -> a * b;
        Calculo div =  (a, b) -> a / b;
        
        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(sub, 1, 3));
        System.out.println(executarOperacao(mult, 1, 3));
        System.out.println(executarOperacao(div, 1, 3));
    }
    

}

