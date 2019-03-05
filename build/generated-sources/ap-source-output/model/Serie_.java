package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Serie.class)
public abstract class Serie_ {

	public static volatile ListAttribute<Serie, Temporada> temporadas;
	public static volatile SingularAttribute<Serie, Integer> anoCriacao;
	public static volatile SingularAttribute<Serie, String> nome;
	public static volatile SingularAttribute<Serie, Long> id;
	public static volatile SingularAttribute<Serie, String> descricao;

}

