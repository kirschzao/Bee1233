package com.example;

import java.util.ArrayList;

public class Stars {
    
    public int countFullStars(long n){
        if(n < 3){
            throw new IllegalArgumentException("n deve ser maior que 3");
        }
        if(n > 2147483647){
            throw new IllegalArgumentException("n deve ser menor que 2147483648");
        }

        // FALHA PROPOSITAL - VALOR LIMITE INFERIOR
        // MOTIVO: O valor mínimo de n deve ser 3, pois não é possível ter estrelas com valores menores
        // if(n < 1){
        //     throw new IllegalArgumentException("n deve ser maior que 0");
        // }

        int fullStars = 0;
        ArrayList<Integer> divisorsOfN = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                divisorsOfN.add(i);
            }
        }

        // FALHA PROPOSITAL - PARTIÇÃO N PAR
        // MOTIVO: Independente da partição de n, devemos calcular o número de estrelas do mesmo modo
        // if(n % 2 == 0){
        //     return n / 2;
        // }
        
        // FALHA PROPOSITAL - CONTRATO PÓS CONDIÇÃO (fullStars <= n/2)
        // MOTIVO: A pós-condição deve ser que o número de estrelas é menor ou igual a n/2, pois não podemos ter mais estrelas do que isso
        // for(int i = 2; i <= n; i++){
        for(int i = 2; i<=n/2; i++){
            boolean newStar = true;

            for(int j = 0; j<divisorsOfN.size(); j++){
                if(divisorsOfN.contains(i)){
                    newStar = false;
                    break;
                }

                if(i % divisorsOfN.get(j) == 0){
                    newStar = false;
                    break;
                }
            }
            if(newStar){
                fullStars++;
            }
        }
        return fullStars + 1;
    }
}