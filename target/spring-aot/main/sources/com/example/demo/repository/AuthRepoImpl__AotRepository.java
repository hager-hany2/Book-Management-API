package com.example.demo.repository;

import com.example.demo.entity.Author;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link AuthRepo}.
 */
@Generated
public class AuthRepoImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public AuthRepoImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link AuthRepo#findByName(java.lang.String)}.
   */
  public List<Author> findByName(String name) {
    String queryString = "SELECT a FROM Author a WHERE a.name = :name";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("name", name);

    return (List<Author>) query.getResultList();
  }
}
