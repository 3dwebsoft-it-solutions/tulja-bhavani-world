package com.TuljaBhavaniWorld.Dao;

import com.TuljaBhavaniWorld.Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link AdminRepository}.
 */
@Generated
public class AdminRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public AdminRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link AdminRepository#findByEmailAndRoleIgnoreCase(java.lang.String,java.lang.String)}.
   */
  public Optional<User> findByEmailAndRoleIgnoreCase(String email, String role) {
    String queryString = "SELECT u FROM User u WHERE u.email = :email AND UPPER(u.role) = UPPER(:role)";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("email", email);
    query.setParameter("role", role != null ? role.toUpperCase() : role);

    return Optional.ofNullable((User) convertOne(query.getSingleResultOrNull(), false, User.class));
  }
}
