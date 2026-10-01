package com.TuljaBhavaniWorld.DaoImpl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AuthDaoIMPL}.
 */
@Generated
public class AuthDaoIMPL__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AuthDaoIMPL apply(RegisteredBean registeredBean, AuthDaoIMPL instance) {
    instance.entityManager = AutowiredFieldValueResolver.forRequiredField("entityManager").resolve(registeredBean);
    return instance;
  }
}
