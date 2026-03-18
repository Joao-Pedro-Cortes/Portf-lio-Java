# Projeto Portfólio - Calculadora Avançada

## 📋 Resumo
Sistema de calculadora interativa com histórico de operações, tratamento de exceções e interface profissional. Desenvolvido para demonstrar conceitos fundamentais de Java.

## 🎯 Funcionalidades
- ✅ Operações básicas: soma, subtração, multiplicação, divisão
- ✅ Histórico completo de operações
- ✅ Tratamento robusto de erros
- ✅ Validação de entrada do usuário
- ✅ Interface amigável com menus
- ✅ Proteção contra divisão por zero

## 📁 Arquivos do Projeto
```
Curso Java/
├── CalculadoraAvancada.java      (Versão profissional)
├── CalculadoraSimples.java       (Primeira versão)
├── Exercicio7_TratamentoExcecoes.java
├── Exercicio8_ValidacaoEntrada.java
├── GuiaAprendizado.java
└── README.md                      (Este arquivo)
```

## 🚀 Como Executar

### Compilar:
```bash
javac CalculadoraAvancada.java
```

### Executar:
```bash
java CalculadoraAvancada
```

### Usar:
1. Escolha "1" para realizar uma operação
2. Digite os números e a operação (+, -, *, /)
3. Veja o resultado
4. Opção "2" para consultar histórico
5. Opção "5" para sair

## 📚 Conceitos Aprendidos

### 1. Tratamento de Exceções
```java
try {
    double resultado = num1 / num2;
} catch (ArithmeticException e) {
    System.out.println("Erro: Divisão por zero!");
}
```

### 2. ArrayList para Histórico
```java
List<String> historico = new ArrayList<>();
historico.add("10 + 5 = 15");
historico.add("20 - 3 = 17");
```

### 3. Métodos Bem Estruturados
- Cada método tem uma responsabilidade única
- Documentação JavaDoc
- Validação de entrada

### 4. Switch/Case
```java
switch(opcao) {
    case "1": realizarOperacao(); break;
    case "2": exibirHistorico(); break;
    default: System.out.println("Inválido!");
}
```

## 💡 Melhorias Futuras
- [ ] Interface gráfica (Swing/JavaFX)
- [ ] Salvar histórico em arquivo
- [ ] Operações avançadas (potência, raiz quadrada)
- [ ] Testes unitários com JUnit
- [ ] Modo "modo científica"

## 👨‍💻 Autor
João Silva - Estudante de Java 2026

## 📊 Progressão de Aprendizado

| Semana | Tópico | Status |
|--------|--------|--------|
| 1 | Conceitos Básicos | ✅ Completo |
| 2 | Lógica Condicional | ✅ Completo |
| 3 | Tratamento de Erros | 🔄 Em Progresso |
| 4 | Estruturas de Dados | ⏳ Próximo |
| 5 | Programação OOP | ⏳ Próximo |
| 6 | Projeto Final | ⏳ Final |

## 🔍 Exemplos de Uso

### Operação Simples
```
Digite o primeiro número: 15
Digite a operação (+, -, *, /): +
Digite o segundo número: 7

✓ Resultado: 22.0
```

### Erro Capturado
```
Digite o primeiro número: 10
Digite a operação (+, -, *, /): /
Digite o segundo número: 0

❌ Erro: Divisão por zero não permitida!
```

## 📖 Recursos Adicionais
- Oracle Java Documentation: https://docs.oracle.com/javase/
- Tutoriais em Português: https://www.devmedia.com.br/java
- GitHub: Publicar código aqui

## ⭐ Por que este projeto é bom para portfólio?

1. **Código profissional** - Comentários, documentação e padrões
2. **Tratamento robusto** - Exceções e validação
3. **Boas práticas** - Métodos pequenos e focados
4. **Funcionalidades extras** - Histórico, menu, etc
5. **Documentação** - README e comentários explicativos
6. **Escalável** - Fácil adicionar novas features

---

**Última atualização**: Março 2026
