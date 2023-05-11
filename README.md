# CampoMinado-terminal
Campo minado, divirta-se ou passe raiva no terminal.

![Alt Text](https://github.com/euFilpeSilva/CampoMinado-terminal/blob/main/src/images/CampoMinadoGif.gif)

Jogo Campo Minado
Este repositório contém um jogo de Campo Minado feito em Java. O jogo consiste em um tabuleiro quadrado, onde o objetivo é encontrar todas as casas que não contêm minas sem clicar em nenhuma mina. Se o jogador clicar em uma mina, ele perde o jogo.

### Como Jogar
#### Requisitos
Java Runtime Environment (JRE) instalado

#### Passos
1- Clone o repositório para o seu computador ou baixe o arquivo ZIP e extraia-o.
2- Abra o terminal na pasta raiz do projeto.
3- Compile o projeto com o seguinte comando:

  javac jogocampominado/CampoMinado.java
  
 4- Execute o projeto com o seguinte comando:
 
  java jogocampominado.CampoMinado
  
  5- O jogo começará com um tabuleiro vazio. Digite as coordenadas (linha e coluna) que deseja revelar.
  Se a casa contiver uma mina, você perde o jogo. Se a casa não contiver uma mina, ela será revelada
  e mostrará o número de minas adjacentes. O jogo continua até que todas as casas que não contêm minas
  sejam reveladas ou     uma mina seja clicada.
  
  ## Como Funciona o Jogo
  
    O jogo é baseado em uma classe Java chamada CampoMinado. A classe possui os seguintes atributos:

tamanho - o tamanho do tabuleiro
numeroMinas - o número de minas no tabuleiro
tabuleiro - um array bidimensional que representa o tabuleiro, contendo true nas posições onde há minas e false nas posições onde não há minas
revelado - um array bidimensional que indica quais casas do tabuleiro foram reveladas pelo jogador
proximidade - um array bidimensional que indica, para cada casa do tabuleiro, o número de minas adjacentes
linhas e colunas - as dimensões do tabuleiro

O jogo Campo Minado é implementado pela classe CampoMinado. Quando a classe é inicializada, o tamanho do tabuleiro e o número de minas são especificados. O método gerarMinas() é chamado para posicionar aleatoriamente as minas no tabuleiro e calcular quantas minas estão presentes em células adjacentes. O jogo começa quando o método jogar() é chamado. Dentro do laço while, o método mostrarTabuleiro() é chamado para exibir o tabuleiro. O jogador é solicitado a fornecer as coordenadas da célula a ser revelada. Se a célula contiver uma mina, o jogo termina e todas as minas são reveladas. Se a célula não contiver uma mina, o número de minas adjacentes é exibido. O jogo termina quando todas as células sem minas tiverem sido reveladas.

## Contribuindo
Se você deseja contribuir para o desenvolvimento deste jogo, sinta-se à vontade para fazer um fork deste repositório e enviar suas alterações através de pull requests. Serão muito bem-vindos quaisquer sugestões ou melhorias para o jogo!



