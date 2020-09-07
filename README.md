
# Ilegra interview test

Consiste em um sistem que monitora uma pasta e em cada evento de criação de arquivos ele gera um relatório com as informações:
```bash
Quantidade de clientes no arquivo de entrada: %s
Quantidade de vendedores no arquivo de entrada: %s
ID da venda mais cara: %s
O pior vendedor por critério de salário é o: %s
```
* Os pré-requisitos para desenvolvimento do projeto está [aqui!](https://github.com/danmiyamura/ilegra-test/blob/master/Desafio%20Tech%20-%20Dev_Deva.pdf)
* Arquivo de exemplo para análise de dados [aqui!](https://github.com/danmiyamura/ilegra-test/blob/master/Arquivo%20Teste.txt)

## Uso
Ao iniciar o projeto ele irá criar três diretórios: 
* **HomePath\data**
* **HomePath\data\in**
* **HomePath\data\out**

Na pasta ***HomePath\data\in*** (Pasta monitorada) você irá mover o arquivo .txt com o seguinte layout:
```python
001ç1234567891234çPedroç50000
001ç3245678865434çPauloç40000.99
002ç2345675434544345çJose da SilvaçRural
002ç2345675433444345çEduardo PereiraçRural
003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro
003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo
```
As informações são separadas pelo ```ç``` analisadas e é gerado um arquivo com o mesmo nome do arquivo de entrada no diretório ***HomePath\data\out*** com o relatório.

