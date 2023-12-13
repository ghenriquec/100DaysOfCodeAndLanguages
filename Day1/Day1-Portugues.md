# Primeiro dia

Hoje comecei o desafio dos 125 dias de código. Vou começar relembrando conceitos básicos de Java, estruturando toda a jornada até o final e depois avançarei para tópicos mais avançados.

## O que eu aprendi hoje

Conceitos de variáveis, tipos de dados, operadores, controle de fluxo, arrays, loops, métodos, classes, objetos, herança, polimorfismo, encapsulamento, abstração, interfaces, pacotes, modificadores de acesso, exceções, genéricos, coleções, threads, programação funcional, streams, I/O, serialização, anotações, expressões lambda e mais.

## Conceitos básicos e lógica de programação
### Tipos de Variáveis
- **Tipos primitivos**: byte, short, int, long, float, double, boolean, char.
- **Tipos de referência**: String, Array, Class, Interface, Enum, etc.

### Operadores
#### Operadores Aritméticos
- (adição): a + b
- (subtração): a - b
- (multiplicação): a * b
- / (divisão): a / b
- % (módulo): a % b
- ++ (incremento): a++ (pós-incremento) ou ++a (pré-incremento)
- -- (decremento): a-- (pós-decremento) ou --a (pré-decremento)

#### Operadores de Atribuição
- = (atribuição simples)
- += (atribuição de adição): a += b é equivalente a a = a + b
- -= (atribuição de subtração): a -= b é equivalente a a = a - b
- *= (atribuição de multiplicação): a *= b é equivalente a a = a * b
- /= (atribuição de divisão): a /= b é equivalente a a = a / b
- %= (atribuição de módulo): a %= b é equivalente a a = a % b

#### Operadores Relacionais
- == (igual a): a == b
- != (diferente de): a != b
- > (maior que): a > b
- < (menor que): a < b
- >= (maior ou igual a): a >= b
- <= (menor ou igual a): a <= b

#### Operadores Lógicos
- && (e lógico): a && b
- || (ou lógico): a || b
- ! (não lógico): !a (não a)
- !! (não lógico): !!a (não não a)

### Controle de Fluxo
#### Declarações Condicionais
- if: if (condição) { ... }
- if-else: if (condição) { ... } else { ... }
- if-else if-else: if (condição) { ... } else if (condição) { ... } else { ... }
- switch: switch (expressão) { case valor1: ... break; case valor2: ... break; default: ... break; }

#### Loops
- while: while (condição) { ... }
- do-while: do { ... } while (condição);
- for: for (inicialização; condição; atualização) { ... }
- for-each: for (tipo variável : array) { ... }

### Arrays
- Declaração: tipo[] nomeDoArray;
- Inicialização: tipo[] nomeDoArray = new tipo[tamanho];
- Declaração e inicialização: tipo[] nomeDoArray = { valor1, valor2, ... };

### Métodos
- Declaração: modificador tipoDeRetorno nomeDoMetodo(parametros) { ... }
- Invocação: nomeDoMetodo(argumentos);

### Modificadores de Métodos
- public: O método pode ser acessado de qualquer lugar.
- private: O método só pode ser acessado dentro da mesma classe.
- protected: O método só pode ser acessado por classes no mesmo pacote ou subclasses.
- static: O método pode ser invocado sem criar uma instância da classe.
- final: O método não pode ser sobrescrito por subclasses.
- synchronized: O método só pode ser acessado por uma thread de cada vez.
- abstract: O método não tem corpo e deve ser implementado por subclasses.
- native: O método é implementado em outra linguagem de programação.

### Conceitos fundamentais da programação orientada a objetos
- **Classe**: Uma classe é um modelo para objetos. Podemos pensar na classe como um esboço (protótipo) de uma casa. Ela contém todos os detalhes sobre os andares, portas, janelas, etc. Baseado nessas descrições, construímos a casa. A casa é o objeto.
- **Objeto**: Um objeto é uma entidade do mundo real que possui estado e comportamento. Por exemplo: cadeira, caneta, mesa, teclado, bicicleta, etc. Pode ser físico e lógico.

~~~java
public class Casa {
    private String cor;

    // Construtor
    public Casa(String cor) {
        this.cor = cor;
    }

    // Método
    public void exibirCor() {
        System.out.println("A cor é " + cor);
    }
}
~~~

- **Encapsulamento**: Encapsulamento é o mecanismo de envolver os dados (variáveis) e o código que atua sobre os dados (métodos) juntos como uma única unidade. No encapsulamento, as variáveis de uma classe são ocultadas de outras classes e só podem ser acessadas através dos métodos da própria classe. Portanto, também é conhecido como ocultação de dados.

~~~java
public class Casa {
    private String cor;

    // método público para acessar a variável privada cor
    public String getCor() {
        return cor;
    }

    // método público para definir a variável privada cor
    public void setCor(String cor) {
        this.cor = cor;
    }
}
~~~

- **Abstração**: Abstração é o processo de ocultar os detalhes de implementação e mostrar apenas a funcionalidade para o usuário. De outra forma, mostra apenas coisas importantes para o usuário e oculta os detalhes internos, por exemplo, enviar SMS onde você digita o texto e envia a mensagem. Você não sabe o processamento interno sobre a entrega da mensagem.

~~~java
public abstract class Construcao {
    public abstract void construir();
}

public class Casa extends Construcao {
    @Override
    public void construir() {
        System.out.println("Construindo uma casa");
    }
}
~~~

- **Herança**: Herança é um mecanismo no qual uma classe adquire a propriedade de

 outra classe. Por exemplo, uma criança herda as características de seus pais. Com a herança, podemos reutilizar os campos e métodos da classe existente. Portanto, a herança facilita a Reusabilidade e é um conceito importante de OOPs.

~~~java
// classe base
public class Construcao {
    private String tipo;

    public void pintar() {
        System.out.println("Pintando a " + tipo);
    }
}

// classe derivada
public class Casa extends Construcao {
    public void instalarPortas() {
        System.out.println("Instalando portas na casa");
    }
}
~~~

- **Polimorfismo**: Polimorfismo é a capacidade de um objeto assumir muitas formas. O uso mais comum de polimorfismo em OOP ocorre quando uma referência de classe pai é usada para referenciar um objeto de classe filha. Qualquer objeto Java que possa passar em mais de um teste IS-A é considerado polimórfico. Em Java, todos os objetos Java são polimórficos, já que qualquer objeto passará no teste IS-A para seu próprio tipo e para a classe Object.

~~~java
public class Construcao {
    public void construir() {
        System.out.println("Construindo uma construção");
    }
}

public class Casa extends Construcao {
    @Override
    public void construir() {
        System.out.println("Construindo uma casa");
    }
}

public class Edificio {
    public static void main(String[] args) {
        Construcao construcao = new Construcao();
        construcao.construir();

        construcao = new Casa();
        construcao.construir();
    }
}
~~~

- **Associação**: Associação é um relacionamento onde todos os objetos têm seu próprio ciclo de vida e não há proprietário. Vamos pegar o exemplo de Professor e Estudante. Múltiplos estudantes podem se associar a um único professor e um único estudante pode se associar a múltiplos professores, mas não há propriedade entre os objetos e ambos têm seu próprio ciclo de vida. Esses relacionamentos podem ser um para um, um para muitos, muitos para um e muitos para muitos.

~~~java
public class Morador{
    private Casa casa;

    public Morador(Casa casa) {
        this.casa = casa;
    }

    public void mostrarCasa() {
        casa.mostrar();
    }
}
~~~

- **Agregação**: Agregação é uma forma especial de associação onde todos os objetos têm seu próprio ciclo de vida, mas há propriedade e objetos filhos não podem pertencer a outro objeto pai. Vamos pegar o exemplo de Departamento e professor. Um único professor não pode pertencer a múltiplos departamentos, mas se excluirmos o departamento, o objeto professor não será destruído. Podemos pensar nisso como uma relação "tem-um".

~~~java
public class Casa {
    private Quarto quarto;

    public Casa(Quarto quarto) {
        this.quarto = quarto;
    }
}

public class Quarto {
    private String cor;

    public Quarto(String cor) {
        this.cor = cor;
    }
}
~~~

- **Composição**: Composição é um caso especial de agregação. De uma forma mais específica, uma agregação restrita é chamada de composição. Quando um objeto contém outro objeto, se o objeto contido não pode existir sem a existência do objeto contêiner, então isso é chamado de composição. Vamos pegar novamente um exemplo de relação entre Casa e quartos. Uma casa pode conter vários quartos, não há vida independente de quarto e qualquer quarto não pode pertencer a duas casas diferentes. Se excluirmos a casa, o quarto será automaticamente excluído. Vamos pegar outro exemplo de relação entre Perguntas e opções. Uma única pergunta pode ter várias opções e a opção não pode pertencer a várias perguntas. Se excluirmos perguntas, as opções serão automaticamente excluídas.

~~~java
public class Casa {
    private Quarto quarto;

    public Casa() {
        this.quarto = new Quarto();
    }
}

public class Quarto {
    private String cor;

    public Quarto(String cor) {
        this.cor = cor;
    }
}
~~~

- **Modificadores de Acesso**: getters e setters são usados para proteger seus dados, especialmente ao criar classes. Para cada variável de instância, um método getter retorna seu valor, enquanto um método setter define ou atualiza seu valor.

~~~java
public class Casa {
    private String cor;

    // método público para acessar a variável privada cor
    public String getCor() {
        return cor;
    }

    // método público para definir a variável privada cor
    public void setCor(String cor) {
        this.cor = cor;
    }
}
~~~

### Interfaces
Interface é um esboço de uma classe que tem constantes estáticas e métodos abstratos. Pode ser usada para alcançar abstração. Interface também é chamada de contrato entre objeto e classe. É um mecanismo para alcançar abstração. Só podem existir métodos abstratos em uma interface Java, sem corpo do método. É usada para alcançar abstração e múltipla herança em Java.

~~~java
public interface Casa {
    public void construir();
}
~~~

### Pacotes
Pacote em Java é um mecanismo para encapsular um grupo de classes, subpacotes e interfaces. Os pacotes são usados para: Prevenir conflitos de nomes. Por exemplo, pode haver duas classes com o nome Funcionário em dois pacotes, college.staff.cse.Funcionario e college.staff.ee.Funcionario. ... Facilitar a pesquisa/localização e uso de classes, interfaces, enumerações e anotações.

~~~java
package com.empresa;
~~~

### Exceções
Uma exceção é um evento que ocorre durante a execução de um programa e que interrompe o fluxo normal das instruções do programa. Quando um erro ocorre dentro de um método, o método cria um objeto e o entrega ao sistema de tempo de execução. O objeto, chamado de objeto de exceção, contém informações sobre o erro, incluindo seu tipo e o estado do programa quando o erro ocorreu. Criar um objeto de exceção e entregá-lo ao sistema de tempo de execução é chamado de lançar uma exceção.

~~~java
public class Casa {
    private String cor;

    // método público para acessar a variável privada cor
    public String getCor() {
        return cor;
    }

    // método público para definir a variável privada cor
    public void setCor(String cor) {
        if (cor == null) {
           throw new IllegalArgumentException("Cor não pode ser nula");
        }
        this.cor = cor;
    }
}
~~~

### Genéricos (Generics)
Genéricos são uma funcionalidade que permite escrever classes ou métodos que podem trabalhar com qualquer tipo de dado. Isso torna o código mais flexível e reutilizável. Genéricos são comumente usados no Java Collection Framework. Por exemplo, genéricos são usados em ArrayList, HashMap, etc., para fornecer segurança em tempo de compilação e prevenir ClassCastException.

```java
public class Casa<T> {
    private T cor;

    // Método público para acessar a variável privada cor
    public T getCor() {
        return cor;
    }

    // Método público para definir a variável privada cor
    public void setCor(T cor) {
        this.cor = cor;
    }
}
```

### Coleções (Collections)
O Collection em Java é um framework que fornece uma arquitetura para armazenar e manipular um grupo de objetos. Java Collections pode realizar todas as operações que você executa em dados, como buscar, ordenar, inserir, manipular e excluir.

```java
public class Casa {
    private String cor;

    // Método público para acessar a variável privada cor
    public String getCor() {
        return cor;
    }

    // Método público para definir a variável privada cor
    public void setCor(String cor) {
        this.cor = cor;
    }
}
```

### Threads
Uma thread é um sub-processo leve, a menor unidade de processamento. Multiprocessamento e multithreading são usados para alcançar multitarefa. No entanto, usamos multithreading em vez de multiprocessing porque threads usam uma área de memória compartilhada. Elas não alocam uma área de memória separada, economizando memória, e a troca de contexto entre as threads leva menos tempo do que entre processos.

### Programação Funcional
Programação funcional é um paradigma de programação no qual tentamos vincular tudo em um estilo de funções matemáticas puras. É um estilo de programação declarativo. Seu principal foco é no “o que resolver” em contraste com um estilo imperativo onde o principal foco é “como resolver”.

### Streams
Java Stream API para Operações de Dados em Massa em Coleções. ... Java Stream API fornece uma abordagem funcional para processar os dados de maneira declarativa. Java Stream API é uma sequência de elementos que suporta operações agregadas sequenciais e paralelas.

### I/O
Java I/O (Entrada e Saída) é usado para processar a entrada e produzir a saída. Java usa o conceito de stream para tornar a operação de I/O rápida. O pacote java.io contém todas as classes necessárias para operações de entrada e saída.

### Serialização
Serialização em Java é um mecanismo de escrever o estado de um objeto em um fluxo de bytes. É principalmente usado em tecnologias Hibernate, RMI, JPA, EJB e JMS. A operação inversa da serialização é chamada de desserialização, onde um fluxo de bytes é convertido em um objeto.

### Anotações (Annotations)
Anotações Java são usadas para fornecer metadados para o seu código Java. Anotações não alteram a ação do programa compilado. Anotações ajudam a associar metadados (informações) aos elementos do programa, ou seja, variáveis de instância, construtores, métodos, classes, etc.

### Expressões Lambda
Expressões lambda basicamente expressam instâncias de interfaces funcionais (Uma interface com um único método abstrato é chamada de interface funcional. Um exemplo é java.lang.Runnable). expressões lambda implementam a única função abstrata e, portanto, implementam interfaces funcionais.

```java
(parâmetros) -> expressão
ou
(parâmetros) -> { declarações; }

List<String> nomes = Arrays.asList("Paul", "Jane", "Michaela", "Sam");
Collections.sort(nomes, (a, b) -> b.compareTo(a));
```

