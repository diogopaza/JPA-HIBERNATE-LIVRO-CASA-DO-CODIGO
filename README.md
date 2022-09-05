# JPA-HIBERNATE-LIVRO-CASA-DO-CODIGO

<p>@ManyToOne(optional = false, fetch = FetchType.LAZY) == a opção LAZY faz com que o JPA nao traga todas as entidades ligadas aquele objeto (ou tabela do banco de dados). O carregamento passa a ser tardio (LAZY), ou seja, apenas se for necessário uma consulta SQL será executada em separado. Dessa forma evitando consultas desnecessárias.</p>
<p>Todos os relacionamentos <em>qualquer-coisa-para-muitos</em>, ou seja, <em>one-to-many,many-to-one</em> possuem <em>lazy loading como estratégia padrão.</em>> Os demais relacionamentos <em>que são qualquer-coisa-para-um</em> possuem estratégia eager loading como padrão.</p>
