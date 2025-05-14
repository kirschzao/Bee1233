# T1 - Verificação e Validação de Software

descrição: O trabalho teve como objetivo principal a implementação da solução para um problema da plataforma BeeCrowd, com foco na aplicação de técnicas de teste de código. A atividade envolveu não apenas a resolução do problema proposto, mas também a elaboração e execução de casos de testes unitários, visando garantir a correção, robustez e confiabilidade do código desenvolvido.

## Tecnologias

- Java
- Maven
- JUnit
- JaCoCo

## Técnicas

- **Testes de unidade**
  - **Partições**
    - Números primos
    - Números pares
    - Números ímpares
    - Números grandes
    - Números pequenos
      - Código original: Calcula corretamente o número de estrelas completas independente da partição do número de pontos.
      - Código com falha: Adicionamos uma condição que retorna `0` estrelas quando os pontos são menores que 10, mesmo que já seja suficiente para formar uma estrela.
      - Resultado esperado: O teste para essa partição deve falhar, provando que o teste cobre corretamente o caso de números pequenos.
  - **Valor limite**
    - Número igual a 3
      - Código original: Retorna `1` estrela completa, ao receber a entrada n = 3.
      - Código com falha: Código aceita apenas valores maiores que 3, resultando em um lançamento de erro.
      - Resultado esperado: O teste para esse valor limite deve falhar, provando que o teste cobre corretamente o caso de valor limite
    - Números igual a 2147483647
  - **Cobertura de código**
    - Juntando todos os casos de teste, conseguimos atingir 100% de cobertura de código.
      - Código com falha: Se utilizarmos somente o teste com `n = 3`, o teste não percorre 100% do código
  - **Contrato**
    - Fizemos testes de pré-condição e pós-condição, para garantir a consistência do código.

## Testes

Executamos 10 testes unitários, cobrindo todos os aspectos possíveis do código.  
Todos apresentaram resultados conforme o esperado; consequentemente, todos foram bem-sucedidos.
