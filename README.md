# JPA-HIBERNATE-LIVRO-CASA-DO-CODIGO

<p>@ManyToOne(optional = false, fetch = FetchType.LAZY) == a opção LAZY faz com que o JPA nao traga todas as entidades ligadas aquele objeto (ou tabela do banco de dados). O carregamento passa a ser tardio (LAZY), ou seja, apenas se for necessário uma consulta SQL será executada em separado.</p>
