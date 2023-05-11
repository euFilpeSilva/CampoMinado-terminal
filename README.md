# CampoMinado-terminal
Campo minado, divirta-se ou passe raiva no terminal.

![Alt Text](https://github.com/euFilpeSilva/CampoMinado-terminal/blob/main/src/images/CampoMinadoGif.gif)

Jogo Campo Minado
Este repositório contém um jogo de Campo Minado feito em Java. O jogo consiste em um tabuleiro quadrado, onde o objetivo é encontrar todas as casas que não contêm minas sem clicar em nenhuma mina. Se o jogador clicar em uma mina, ele perde o jogo.

### Como Jogar
#### Requisitos
Java Runtime Environment (JRE) instalado

#### Passos
1 Clone o repositório para o seu computador ou baixe o arquivo ZIP e extraia-o.
2 Abra o terminal na pasta raiz do projeto.
3 Compile o projeto com o seguinte comando:

  javac jogocampominado/CampoMinado.java
  
 4 Execute o projeto com o seguinte comando:
 
  java jogocampominado.CampoMinado
  
  5 O jogo começará com um tabuleiro vazio. Digite as coordenadas (linha e coluna) que deseja revelar.
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

O jogo é iniciado no método main, que cria uma instância da classe CampoMinado e chama o método jogar para começar o jogo. O método jogar contém um laço que continua até que o jogador ganhe ou perca o jogo. Dentro do laço, o método mostrarTabuleiro é chamado para exibir o tabuleiro atual, e o jogador é solicitado a digitar as coordenadas que deseja revelar. Se a casa contiver uma mina, o jogador perde o jogo e o método mostrarMinas é chamado para exibir todas as minas no tabuleiro. Se o jogador revelar todas as casas que não contêm minas, ele ganha o jogo.

O método gerarMinas é chamado no início do jogo para gerar as minas aleatoriamente no tabuleiro. O método utiliza a classe Random para gerar números aleatórios, e um laço while para garantir que o número de minas geradas seja igual ao número especificado pelo jogador. Em seguida, o método percorre o tabuleiro e calcula o número de minas adjacentes para cada casa, armazenando essas informações no array proximidade.

O método mostrarTabuleiro é respons




