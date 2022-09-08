# JPA-HIBERNATE-LIVRO-CASA-DO-CODIGO

<p>@ManyToOne(optional = false, fetch = FetchType.LAZY) == a opção LAZY faz com que o JPA nao traga todas as entidades ligadas aquele objeto (ou tabela do banco de dados). O carregamento passa a ser tardio (LAZY), ou seja, apenas se for necessário uma consulta SQL será executada em separado. Dessa forma evitando consultas desnecessárias.</p>
<p>Todos os relacionamentos <em>qualquer-coisa-para-muitos</em>, ou seja, <em>one-to-many,many-to-one</em> possuem <em>lazy loading como estratégia padrão.</em> Os demais relacionamentos <em>que são qualquer-coisa-para-um</em> possuem estratégia eager loading como padrão.</p>

<h4>Operações em cascata</h4>
<p>Em diversas situações é necessário excluir, inserir os relacionamentos de forma automática. O JPA fornece um mecanismo para facilitar a persistência de entidades e seus relacionamentos transientes. Sempre que o método persist for chamado pode ser usado o recursos <strong>cascade</strong>. O <strong>CascadeType.Persist</strong> por exemplo quando adicionado no relacionamento faz com que todas as entidades relacionadas sejam persisitidas no banco de dados, dessa forma não é necessário o metódo <em>persist</em> em todas as entidades relacionadas.</p> A operação <strong>cascade = CascadeType.All</strong> é um atalho para que todas as operações <em>(PERSIST, REFRESH, REMOVE e DETACH)</em> devem ser em cascata.

<h4>Exclusão de objetos órfãos</h4>
<p>Uma entidade pode ser removida com o método <em>remove do EntityManager</em>, porém existe algumas operações que apenas desfaz o vinculo entre duas ou mais entidaders, não excluindo o registro do banco de dados. Para configurar a remoção de orfãos, é necessário inlcuir o atribtuto <strong>orphanRemoval no mapemanto.</strong></p>
<p>Ex:</p>

@OneToMany(mappedBy = "categoria", cascade = CascadeType.PERSIST,<br />
orphanRemoval = true)<br />
public List<Produto> getProdutos() {<br />
return produtos;<br />
}<br />
  
  <h3>Java Persistence Query Language - JPQL</h3>
  <p>A JPQL é a linguagem padrão de consulta do JPA, permite escrever consultas portáveis, que funcionam independente do banco de dados.</p>
  <p> 
	  
	   
	  Query query = manager.createQuery("select v from Veiculo2 v where anoFabricacao = :ano")
		.setParameter("ano", 2012); 
		List<Veiculo2> veiculos = query.getResultList();<br />

    //percorrendo a lista obtida com o getResultList()
		for (Object obj : veiculos) {
			Veiculo2 veiculo = (Veiculo2) obj;
			System.out.println("VEICULO == " + veiculo.getModelo() + " - " + veiculo.getAnoFabricacao());
		}
	  
	   
</p>
    
  <h6>Consultas tipadas</h6>
  <p>
	 // já retorna uma lista do tipo especificada na criação da query
	
	TypedQuery<Veiculo> query = manager.createQuery("from Veiculo",
							Veiculo.class);
   	List<Veiculo> veiculos = query.getResultList();
		for (Veiculo veiculo : veiculos) {
		System.out.println(veiculo.getModelo() + " " + veiculo.getFabricante()
		+ ": " + veiculo.getAnoFabricacao());
	}  
  </p>
  
  <h4>Paginação</h4>
  <p>
  	//usa os métodos setFirstResult e setMAxResult para a paginação
	  
  	 TypedQuery<Veiculo2> query = manager.createQuery("from Veiculo2", Veiculo2.class);
		query.setFirstResult(0);//indice inicial da paginação
		query.setMaxResults(2);//total de resultdos para serem listados
		List<Veiculo2> veiculos = query.getResultList();
		for (Object obj : veiculos) {
			Veiculo2 veiculo = (Veiculo2) obj;
			System.out.println("VEICULO == " + veiculo.getModelo() + " - " + veiculo.getAnoFabricacao());
		}
  	
  </p>
  <h4>Projeções</h4>
  <p>
  	Projeções é uma técnica muito útil para quando precisamos de apenas algumas poucas informações de entidades. 
	
	TypedQuery<String> query = manager.createQuery(
		"select modelo from Veiculo", String.class);
	List<String> modelos = query.getResultList();
	for (String modelo : modelos) {
		System.out.println(modelo);
	}
	
  
  </p>
  
