# Desafio - Combate (Java)
 
Desafio sobre construtores, `this`, sobrecarga e encapsulamento, desenvolvido em **Java**, da Formação Desenvolvedor Moderno (DevSuperior).
 
## Sobre
 
O programa instancia dois campeões e executa N turnos de combate. A cada turno os dois campeões se atacam e o estado de vida de cada um é exibido. O combate termina quando um campeão morre (vida igual a zero) ou quando os N turnos acabam, mostrando ao final "FIM DO COMBATE".
 
## Regras de dano
 
- A vida do campeão atacado é reduzida pelo ataque do adversário, descontando a sua armadura
- A vida resultante nunca pode ser menor que zero
- Independente da armadura, o campeão sempre perde no mínimo 1 de vida por ataque
## Estrutura do projeto
 
- **Champion** — campeão, com nome, vida, ataque e armadura, e os métodos:
  - `takeDamage(other)` — aplica o dano recebido do adversário conforme as regras
  - `status()` — retorna o nome e a situação de vida (incluindo "morreu" se a vida for zero)
## Conceitos praticados
 
- Construtores e `this`
- Encapsulamento (atributos protegidos com get/set)
- Regras de negócio dentro da classe
- Estruturas repetitivas e condicionais
## Exemplos
 
**Exemplo 1**
```
Digite os dados do primeiro campeão:
Nome: Darius
Vida inicial: 50
Ataque: 8
Armadura: 1
 
Digite os dados do segundo campeão:
Nome: Fiora
Vida inicial: 40
Ataque: 10
Armadura: 2
 
Quantos turnos você deseja executar? 2
 
Resultado do turno 1:
Darius: 41 de vida
Fiora: 34 de vida
 
Resultado do turno 2:
Darius: 32 de vida
Fiora: 28 de vida
 
FIM DO COMBATE
```
 
**Exemplo 2**
```
Digite os dados do primeiro campeão:
Nome: Darius
Vida inicial: 50
Ataque: 8
Armadura: 1
 
Digite os dados do segundo campeão:
Nome: Fiora
Vida inicial: 40
Ataque: 30
Armadura: 10
 
Quantos turnos você deseja executar? 4
 
Resultado do turno 1:
Darius: 21 de vida
Fiora: 39 de vida
 
Resultado do turno 2:
Darius: 0 de vida (morreu)
Fiora: 38 de vida
 
FIM DO COMBATE
```
 
## Tecnologias
 
- Java
## Autor
 
**Iago Lima** · [GitHub](https://github.com/iagoclima22) · [LinkedIn](https://www.linkedin.com/in/iago-campanhol-de-lima-57124b247/)
