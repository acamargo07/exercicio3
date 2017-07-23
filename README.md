# exercicio3

Para testar basta rodar os Junit.

Exercicio 4 

O que é Deadlock? Detalhe um pouco sobre o caso e como você poderia resolver isso.

Dealock é quando um processo prende um recurso e não libera após a utilização, por exemplo.: Um processo que escreve em uma tabela do sistema ou que acessa um scanner ou impressora.
Se o processo não liberar o recurso e outro processo tentar acessar o mesmo recurso ocorre o deadlock, para previnir este cenário, ter todos os recursos necessários para a execução antes de iniciar a mesma, 

Exercicio 5

Uma das grandes inclusões no Java 8 foi a API Stream. Com ela podemos fazer diversas operações de loop, filtros, maps, etc. Porém, existe uma variação bem interessante do Stream que é ParallelStreams. Descreva com suas palavras quando qual é a diferença entre os dois e quando devemos utilizar cada um deles.

Stream é sequencial um elemento é processado depois do outro enquanto o ParallelStream tem um processamento paralelo isso pode ser uma grande vantagem dos processamentos multi-core pois quebram os elementos formando streams menores depois ele combina estes streams para gerar o resultado. Então cada Thread pode processar um pedaço dando maior agilidade para Streams maiores.

