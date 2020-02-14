# ExerciciosJava
Exercicios Java


Exercícios/Exemplo para adequação dos conhecimentos da sintaxe C# para Java
Os exercícios abaixo exploram a sintaxe básica da linguagem Java, mesmo resolvidos, implemente cada um deles e se tiver dificuldades consulte a resolução de cada um. Crie um novo projeto para cada exercício. 

Módulos:
Desenvolva um método que recebe um número inteiro positivo de até 9 posições, faça a inversão dos dígitos desse número e o retorne. Exemplo: 123456789 invertido e´ 987654321
Não use vetores nem Strings na solução!
 






Strings:
Peça ao usuário digitar uma frase com no mínimo 45 palavras a qual será lida e atribuída a uma String. Após a digitação, mostre a frase acomodada e justificada em uma área com no máximo 40 colunas. As palavras não poderão ser divididas.
Exemplo:

O usuário digitou:

O mundo é um lugar perigoso de se viver, não por causa daqueles que fazem o mal, mas sim por causa daqueles que observam e deixam o mal acontecer. Albert Einstein

A frase deverá ser apresentada assim:

O mundo é um lugar perigoso de se
viver, não por causa daqueles que fazem
o mal, mas sim por causa daqueles que
observam e deixam o mal acontecer.
Albert Einstein

Sugestão: após realizar a leitura da frase e atribuir à String sfrase, transfira seqüencialmente todas as palavras para a String sfraseresult com o cuidado de não dividir uma palavra e adicione o “\n” no final de cada linha, evitando ainda que cada linha não exceda 40 colunas. Imprima depois a String sfraseresult.





MEGASENA:
    A Mega-Sena é a maior loteria do Brasil. Os sorteios acontecem duas vezes por semana, às quartas-feiras e aos sábados. O princípio do jogo é simples: são sorteados seis números diferentes, compreendidos entre 01 e 60 (inclusive). Os sorteios são realizados em globos duplos (duas gaiolas esféricas girando). Os números são sorteados em dígitos separados, que formam um número decimal de dois dígitos, de 01 a 60. A primeira gaiola tem esferas variando de 0 a 5 para o primeiro dígito, e a outra tem esferas variando de 0 a 9 para o segundo. O número 00 corresponde ao 60. Quando seis pares de números originais são extraídos o sorteio está concluído.
 
     Os apostadores podem apostar de seis a quinze números do total de 60.
 
     Desenvolva um algoritmo em Java que pergunte ao usuário quantos jogos ele irá fazer e qual a quantidade de números que ele irá apostar para estes jogos (todos deverão obedecer a mesma quantidade de números). Após, gere aleatoriamente os números para cada aposta (não é permitido números repetidos em uma mesma aposta), faça o sorteio da Mega-Sena (obedecendo a regra oficial) e por final analise todas as apostas, emitindo o resultado da apuração de cada uma delas.
 
     Para facilitar o desenvolvimento, modularize a solução com os seguintes métodos:
 
a)  int [] geraAposta(int n): retorna um vetor que representa uma aposta de n números. Os números são gerados aleatoriamente. Não deve permitir números repetidos.
b) int [] geraMegaSena(): retorna um vetor com os supostos 6 números sorteados no concurso da MegaSena.
c) int verificaApostal(aposta[],megasena[]): recebe uma aposta e os números da Mega-sena. Retorna a quantidade de números acertados.
d) MostraMegaSena(megasena[]): apresenta todos os números sorteados de uma Mega-Sena
e) MostraAposta(aposta[]): apresenta os números de uma determinada aposta.
 
O método principal main() deve controlar todo o programa. Dica: utilize uma matriz para armazenar todas as apostas.
