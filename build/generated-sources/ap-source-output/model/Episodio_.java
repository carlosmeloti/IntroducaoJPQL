package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Episodio.class)
public abstract class Episodio_ {

	public static volatile SingularAttribute<Episodio, Integer> numero;
	public static volatile SingularAttribute<Episodio, Temporada> temporada;
	public static volatile SingularAttribute<Episodio, String> titulo;
	public static volatile SingularAttribute<Episodio, Long> id;
	public static volatile SingularAttribute<Episodio, String> descricao;

}

