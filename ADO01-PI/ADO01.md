# Lista de Exercícios - Java (Condicionais Avançadas)

## Instruções
Resolva as questões utilizando apenas criação de variáveis e estruturas condicionais (`if`, `else if`, `else`). Foque em lógica e organização das condições.

---

## Questões

### 1.
Um sistema de login deve validar acesso com base nas seguintes regras:
- Usuário correto: "admin"
- Senha correta: "1234"

Informe:
- "Acesso concedido" (se ambos estiverem corretos)
- "Senha incorreta"
- "Usuário incorreto"

Trate corretamente todos os cenários possíveis.

---

### 2.
Dado um horário (hora e minuto), determine em qual período do dia ele se encontra:
- Madrugada (00:00 - 05:59)
- Manhã (06:00 - 11:59)
- Tarde (12:00 - 17:59)
- Noite (18:00 - 23:59)

Valide também horários inválidos.

---

### 3.
Um banco concede empréstimo com base nas seguintes regras:
- Salário > 3000 e nome limpo → aprovado
- Salário entre 1500 e 3000 e nome limpo → análise manual
- Nome sujo → negado

Mostre o resultado final.

---

### 4.
Crie um programa que receba três valores e classifique um triângulo como:
- Equilátero
- Isósceles
- Escaleno

Considere também a validação de triângulo.

---

### 5.
Dado um número inteiro de 4 dígitos, verifique:
- Se ele é um palíndromo (ex: 1221)
- Se não for, informe "não é palíndromo"

---

### 6.
Um sistema de estacionamento cobra:
- Até 1 hora: R$ 5
- Até 3 horas: R$ 10
- Até 6 horas: R$ 15
- Acima disso: R$ 20

Receba a quantidade de horas e valide entradas inválidas (negativas ou zero).

---

### 7.
Receba três números e determine:
- O maior
- O menor
- Se há números iguais

Sem usar arrays.

---

### 8.
Dado um ano e um mês (número), informe quantos dias aquele mês possui.  
Considere anos bissextos para fevereiro.

---

### 9.
Crie um sistema de notas com duas provas e uma recuperação:
- Média >= 7 → aprovado direto
- Média entre 4 e 6.9 → vai para recuperação
- Média < 4 → reprovado direto

Se estiver em recuperação, calcule nova média e determine o resultado final.

---

### 10.
Um programa deve simular um semáforo inteligente:
- Se houver carros e pedestres → prioridade para carros
- Se não houver carros, mas houver pedestres → liberar pedestres
- Se não houver nenhum → manter estado atual

Considere variáveis booleanas para entrada.