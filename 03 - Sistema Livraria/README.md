# Exercício de Sistema de Livraria
O intuito do exercício a seguir é treinar e fixar os conceitos de *SRP* e *OCP* do *SOLID*.

## O Exercício
No exemplo a seguir você deve implementar o sistema de uma livraria e depois algumas mudanças de escopo serão aplicadas, por isto o exercício será dividido em duas etapas.

## Primeira etapa

### Regras de Implementação
O sistema deve ser capaz de cadastrar os seguintes produtos: **livros**, **jogos**, **filmes**, **álbuns de música** e **brinquedos**.

#### Livros:
Devem ter **nome**, **id**, **preço**, **gêneros**, **escritor**, **editora** .

#### Jogos:
Devem ter **nome**, **id**, **preço**, **distribuidora**, **gênero** e **estúdio**

#### Filmes:
Devem ter **nome**, **id**, **preço**, **estúdio**, **diretores**, **gêneros** e **produtores**

#### Álbuns de música:
Devem ter **nome**, **id**, **preço**, **músicos/bandas**, **gêneros** e **selos**

#### Brinquedos:
Devem ter **nome**, **id**, **preço** e **tipo**.
<hr />

Além disso nosso sistema deve possuir um **caixa**. Este caixa deve ter a informação de dinheiro que está presente nele.

#### Algumas funcionalidades do sistema:

 - Você deve ser capaz de adicionar, ver, alterar e remover qualquer produto do sistema.
 - Você deve ser capaz de ver quantos itens de um tipo específico existem no estoque.
 - Você deve ser capaz de ver a listagem completa dos itens em estoque.
 - Você deve ser capaz de ver a listagem dos itens em estoque por categoria.
 - Você deve ser capaz de realizar a **operação de compra**, ao realizar esta operação os produtos comprados são removidos do estoque e o dinheiro pago deve ser adicionado ao caixa.

## Segunda Etapa:

Duas mudanças de escopo foi solicitada com urgência. Agora um produto pode ser adicionado com um rótulo: **destinado ao público adulto**. Neste caso para que a compra do produto seja realizada será necessária a apresentação dos documentos do comprador (**Nome**, **RG**, **CPF** e **Data de Nascimento**) se o comprador tiver menos de 18 anos a compra deve ser bloqueada.

Outra mudança solicitada foi que toda compra que passar de **R$200,00** em livros deve receber um desconto de **15%**.

## Dicas finais

 - Pense bem nos princípios do **SOLID** para a realização do exercício.
 - Tente realizar o exercício por etapas como proposto, desta maneira vocês estarão simulando uma situação mais próxima a realidade de mercado e trabalhando melhor os princípios de *POO*.
 - Pense e se possível escreva a estrutura que será necessária para que o software seja construído.
 - Além dos conceitos do **SOLID** tente aplicar também os demais conceitos aprendidos nas aulas de *POO*.
 - Escreva uma documentação para seu projeto no *Github*, ela ajuda a expor as habilidades aprendidas e as demais pessoas que acessarem seu repositório entenderem o que está acontecendo.
 - Crie quantas entidades quiser para facilitar a resolução do exercício.
 - Tente ser declarativo em relação ao nome dos métodos, classes, interfaces e variáveis.
 - Não guarde as dúvidas para você, compartilhe com os professores e a turma, as vezes mais colegas estão com o mesmo problema, ou é uma questão que não foi pensada inicialmente pelos professores.
 - Aproveite o exercício para fixar os conceitos ensinados em aula.
