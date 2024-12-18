﻿# **Jogo do adivinha**

Este projeto foi realizado para o primeiro desafio java do programa catalisa .

## **Pré-requisitos**

Antes de executar o projeto, certifique-se de que você possui os seguintes itens instalados:

1. [Java JDK 8 ou superior](https://www.oracle.com/java/technologies/javase-downloads.html);
2. Um editor de código ou IDE, como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/ide/);

## **diagrama de fluxo**
```mermaid
flowchart
    A(Iniciar Programa) --> B{exibe menu<br>qual opção ?}
    B-- opcao == 1 -->C{nivel de dificuldade<br>gerar numero aleatorio<br>registrar tentativas}
    B -- opcao ==2 --> D(exibir saida)
    C --> E[pontos<br>Números acertados<br>Números errados]
    classDef default stroke-width:3px,stroke:#3B9DF2;
```
## **Uso**

Siga as etapas abaixo para executar o projeto:

### **1. Clonar o repositório**

Clone este repositório para sua máquina local:

```bash
git clone git@github.com:joaocandidozup/jogo-do-adivinha.git   
```
### *2. Executar o projeto*
abra o projeto no intellij IDE e digite as teclas **shif + f10**

### *3. Exemplo de uso*
Ao executar o programa ,sera solicitado:
- escolher uma opção.
- escolher um nivel de dificuldade.
- escolher se quer jogar ou sair do jog0
Veja um exemplo de interação :
![image](https://github.com/user-attachments/assets/fbecd74f-e1b3-4982-955c-586d2a4b6752)


## Contrubuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests para melhorias.

Divirta-se adivinhando o numero aleatório! 😊

