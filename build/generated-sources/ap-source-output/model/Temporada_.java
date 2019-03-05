package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Temporada.class)
public abstract class Temporada_ {

	public static volatile SingularAttribute<Temporada, Integer> numero;
	public static volatile SingularAttribute<Temporada, Serie> serie;
	public static volatile ListAttribute<Temporada, Episodio> episodios;
	public static volatile SingularAttribute<Temporada, Long> id;
	public static volatile SingularAttribute<Temporada, String> descricao;

}

