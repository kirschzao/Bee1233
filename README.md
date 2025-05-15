# T1 - Verificação e Validação de Software

### Descrição

O trabalho teve como objetivo principal a implementação da solução para um problema da plataforma BeeCrowd, com foco na aplicação de diversas técnicas de teste de código. A atividade envolveu não apenas a resolução do problema proposto, mas também a elaboração e execução de casos de testes unitários, garantindo a correção, robustez e confiabilidade do código desenvolvido.

### 🐝 Problema BeeCrowd

O problema 1233 (estrela) do BeeCrowd exige determinar, dado um número `N`, quantas estrelas completas podem ser desenhadas ligando cada ponto ao k-ésimo ponto seguinte em uma circunferência, repetidamente, até retornar ao ponto inicial. Uma estrela é considerada completa quando todos os `N` pontos são visitados no processo.

## Tecnologias

- Java: Linguagem de programação orientada a objetos amplamente utilizada para o desenvolvimento de aplicações robustas e multiplataforma.

- Maven: Ferramenta de automação de build e gerenciamento de dependências para projetos Java, que facilita a compilação, testes e empacotamento.

- JUnit: Framework de testes unitários para Java que permite escrever e executar testes automatizados para garantir a qualidade do código.

- JaCoCo: Ferramenta de análise de cobertura de testes para Java que gera relatórios indicando quais partes do código foram testadas.

## Técnicas de Teste

### ✅ Testes de Unidade

#### 🔹 Partições

- **Números primos**
- **Números pares**
  - 💥 _Falha proposital inserida:_ lógica incorreta quando `n` é par.
    ```java
    if (n % 2 == 0) {
      return n / 2;
    }
    ```
- **Números ímpares**
- **Números grandes**
- **Números pequenos**

#### 🔹 Valores Limite

- **Limite inferior: `n = 3`**
  - 💥 _Falha proposital:_ o limite foi alterado para aceitar `n = 1` e `n = 2`, que são inválidos.
    ```java
    if (n < 1) {
      throw new IllegalArgumentException("n deve ser maior que 0");
    }
    ```
- **Limite superior: `n = 2147483647`**

#### 🔹 Cobertura de Código

- Com todos os testes, atingimos **100% de cobertura**, o que pode ser visualizado abrindo o relatório de cobertura (instruções abaixo).
  - 💥 _Falha proposital:_ se o teste de limite superior for removido, **10% do código** (3 linhas) deixa de ser testado.

#### 🔹 Contrato

- Testes de **pré-condição** e **pós-condição** foram realizados para garantir a consistência.
  - 💥 _Falha proposital:_ se alterarmos o loop principal de:
    ```java
    for (int i = 2; i <= n / 2; i++)
    ```
    para:
    ```java
    for (int i = 2; i <= n; i++)
    ```
    a **pós-condição `fullStars <= n/2` será violada**.  
    Por exemplo, para `n = 19`, teríamos `fullStars = 19`, o que não é válido.

## Testes

Executamos 10 testes unitários, cobrindo todos os aspectos possíveis do código.  
Todos apresentaram resultados conforme o esperado, consequentemente, todos foram bem-sucedidos.

### 📦 Abrindo projeto

1. **Clone o repositório:**

    ```bash
    git clone https://github.com/kirschzao/Bee1233.git
    ```

2. **Entre no repositório:**

  ```bash
  cd .\Bee1233\
  ```
    


### 🚀 Executando os testes:

Certifique-se de estar na pasta `Bee1223` e execute o comando no terminal:

```bash
./mvnw clean verify
```

Após isso, o Maven vai:
- Compilar o projeto;
- Executar os testes unitários;
- Gerar o relatório de cobertura de código;

### Relatório de cobertura

  Para abrir o relatório de cobertura você deve:
  1. Instalar a extensão `Live Server`;
  2. Entrar no arquivo 
  ```
  target/site/jacoco/index.html
  ```
  3. Clique com o botão direito no arquivo e selecione a opção `Open with Live Server`

## Resultados

  Os resultados podem ser vistos na aba `Issues` do repositório no GitHub  
