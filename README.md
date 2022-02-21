# #Projeto Agenda com Java

## Projeto
- Tela Inicial;
- Agenda de Contatos;
- Criar novo contato;
- Editar Contato;
- Excluir Contatos;
- Relatório em Pdf
- Cadastrar novo Contato

## Tecnologias

- Servidor TomCat
- Java EE-Servlet e JSP
- IDE Eclipse
- MySQL(CRUD -Created Read Update Delete)
- MVC (Model View Controller)
- JavaBeans(Classe java relacionada a segurança e reutilização de código)
-JDBC(Java Database Conectivity - conjunto de classe e interface escrita em java para envio de instruções SQL ao BD)
- iText(Biblioteca utilizada para gerar relatórios em Pdf)
- CSS
- javaScript
- html



## Infraestrutura

127.0.0.1:3306/dbagenda

user:
root

password:


## MVC - Model View Controler  

o MVC Model View Controler é um Padrão de arquitetura de Software, ele separar a aplicação em tres camadas com o objetivo
de melhorar a segurança do sistema e também reutilização do código além de permitir que uma equipe trabalhe simultaneamente
e, diferentes partes.

Model: essa camada é reponsável pelo o processamento pesado que é a camada que tem acesso ao Banco de dados;
Dentro da camada Model, Usaremos duas classes, a classe javaBeans responsável pela segurança dos dados e a classe DAO que será responsável
pela conexão e acesso ao BD.

View: responsável pela interface com o usuário. é o frontEnd gerado de forma dinâmica, são os documentos que podem ser 
renderizados pelo o  navegador. Ex: html,jsp,  css e JavaScript;

Controler: Trabalha com requisições e Respostas, usamos servlet para lidar com requisições e repostas.



Um servidor java é um servidor web que além de hospedar sites consegue executar a linguagem java.
