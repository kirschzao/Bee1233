package com.example;

public class Stars {

    public int countFullStars(int n) {
        // Verifica se n é menor que 3
        if (n < 3) {
            throw new IllegalArgumentException("n precisa ser maior ou igual a 3");
        }
    
        // Verifica se n é maior que 2147483647
        if(n > 2147483647) {
            throw new IllegalArgumentException("n precisa ser menor ou igual a 2147483647");
        }
        
        int fullStars = 0;
        // Calcula o número de estrelas cheias
        // O número de estrelas cheias é igual ao número de inteiros k entre 1 e n-1
        // que são coprimos com n, ou seja, gcd(n, k) = 1
        // Dividimos o resultado por 2, pois segundo os resultados do BeeCrowd assim está certo
        for (int k = 1; k < n; k++) {
            if (mdc(n, k) == 1) {
                fullStars++;
            }
        }
        
        return fullStars/2;
    }
    
    // Método para calcular o máximo divisor comum (mdc) entre dois números
    private int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}