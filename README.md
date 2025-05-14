# T1 - Verificação e Validação de Software

### Descrição:

  O trabalho teve como objetivo principal a implementação da solução para um problema da plataforma BeeCrowd, com foco na aplicação de técnicas de teste de código. A atividade envolveu não apenas a resolução do problema proposto, mas também a elaboração e execução de casos de testes unitários, visando garantir a correção, robustez e confiabilidade do código desenvolvido.

### Problema BeeCrowd:

  O problema 1233 (estrela) do BeeCrowd exige determinar, dado um número N, quantas estrelas completas podem ser desenhadas ao ligar cada ponto em uma circunferência ao k-ésimo ponto seguinte, repetidamente, até retornar ao ponto inicial. Uma estrela é considerada completa quando todos os N pontos são visitados no processo. 

## Tecnologias

- Java
- Maven
- JUnit
- JaCoCo

## Técnicas de Teste

- **Testes de unidade**
  - **Partições**
    - Números primos
    - Números pares
      - Falha proposital inserida: lógica de cálculo diferente caso n for par.
      ```java
      if(n % 2 == 0){
        return n / 2;
      }
      ```
    - Números ímpares
    - Números grandes
    - Números pequenos
  - **Valor limite**
    - Inferior: número igual a 3
      - Falha proposital inserida: mudando o limite inferior para 1, ou seja, aceita entrada 1 e 2, as quais não devem ser aceitas.
      ```java
      if(n < 1){
        throw new IllegalArgumentException("n deve ser maior que 0");
      }
      ```
    - Superior: número igual a 2147483647
  - **Cobertura de código**
    - Juntando todos os casos de teste, conseguimos atingir 100% de cobertura de código.
      - Falha proposital: caso excluirmos o teste de limite superior, 10% código (3 linhas de código) não será testado. Resultando em uma falha de cobertura de código.
  - **Contrato**
    - Fizemos testes de pré-condição e pós-condição, para garantir a consistência do código.
      - Falha proposital: caso alterassemos a quantidade de vezes que o loop principal para contar estrelas acontece, mudando de:
      ```java
      for(int i = 2; i<=n/2; i++)
      ```
      para:
      ```java
      for(int i = 2; i <= n; i++)
      ```
      isso resultaria no ferimento do pós-contrato **fullstarts <= n/2**
      , pois em alguns casos (números primos) teremos que **fullstars > n/2**, como, por exemplo, se a entrada for *19* o número de fullstars seria *19*.

## Testes

Executamos 10 testes unitários, cobrindo todos os aspectos possíveis do código.  
Todos apresentaram resultados conforme o esperado; consequentemente, todos foram bem-sucedidos.
