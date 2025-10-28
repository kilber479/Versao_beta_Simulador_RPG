# Versão_beta_Simulador_RPG

# 🧙‍♂️ Simulador de Batalha RPG - Versão Beta Funcional

## 👥 Identificação do Grupo
- **Integrantes:** Kilber Fernando Guimarães Alves Filho
- **Curso:** Programação Orientada a Objetos – Java  
- **Etapa:** Parte 4 – Versão Beta Funcional  

---

## 🎯 Descrição do Projeto
Este projeto é um **simulador de batalha RPG em Java**, desenvolvido como parte do trabalho prático da disciplina de **Programação Orientada a Objetos (POO)**.  
O sistema permite que o jogador escolha personagens com diferentes classes (Guerreiro, Mago, Arqueiro) e participe de batalhas automáticas ou controladas, com base nos atributos e ações de cada personagem.

A versão **Beta Funcional** representa um **avanço em relação ao protótipo inicial**, incluindo:
- Implementação de **interações completas com o usuário** (escolha de personagens, ações, ataques, defesas).  
- Melhor organização dos **pacotes e classes** conforme a modelagem UML.  
- Reforço nos conceitos de **herança, polimorfismo e encapsulamento**.  
- Lógica de batalha aprimorada e mensagens de status durante o combate.

---

## 🧩 Estrutura de Pacotes

src/
├── model/
│ ├── Personagem.java
│ ├── Guerreiro.java
│ ├── Mago.java
│ ├── Arqueiro.java
│
├── controller/
│ └── BatalhaController.java
│
├── view/
│ └── JogoView.java
│
├── service/
│ └── JogoService.java
│
└── Main.java

---

## ⚙️ Instruções de Execução

### 🧱 Pré-requisitos:
- Java JDK 17 ou superior instalado  
- IDE ou ambiente de execução (VS Code, IntelliJ, NetBeans ou GitHub Codespaces)

### ▶️ Para executar:
1. Clone o repositório:
   ```bash
   git clone https://github.com/<seu-usuario>/<nome-do-repositorio>.git
