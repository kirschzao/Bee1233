package com.example;

import java.util.ArrayList;

public class Stars {
    
    public int countFullStars(int n){
        // Verifica se n é menor que 3
        if(n < 3){
            throw new IllegalArgumentException("n deve ser maior que 3");
        }
        // Verifica se n é maior que 2147483647
        if(n > 2147483647){
            throw new IllegalArgumentException("n deve ser menor que 2147483647");
        }

        int fullStars = 0;
        ArrayList<Integer> divisorsOfN = new ArrayList<>();

        // Adiciona os divisores de n a uma lista
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                divisorsOfN.add(i);
            }
        }
        
        // Verifica quais "k" são estrelas completas iniciando de 2
        for(int i = 2; i<=n/2; i++){
            boolean newStar = true;
            // Percorre a lista de divisores de n
            for(int j = 0; j<divisorsOfN.size(); j++){
                // Verifica se o número é divisor de n
                if(divisorsOfN.contains(i)){
                    newStar = false;
                    break;
                }
                // Verifica se o número é múltiplo de algum divisor de n
                if(i % divisorsOfN.get(j) == 0){
                    newStar = false;
                    break;
                }
            }
            // Se o número não é divisor de n e não é múltiplo de nenhum divisor de n, é uma estrela completa
            // Adiciona 1 ao contador de estrelas completas
            if(newStar){
                fullStars++;
            }
        }
        // Retorna o número de estrelas completas + 1 que sempre é uma estrela completa
        return fullStars + 1;
    }
}