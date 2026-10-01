package com.TuljaBhavaniWorld.DaoImpl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AuthDaoIMPL}.
 */
@Generated
public class AuthDaoIMPL__BeanDefinitions {
  /**
   * Get the bean definition for 'authDaoIMPL'.
   */
  public static BeanDefinition getAuthDaoIMPLBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthDaoIMPL.class);
    InstanceSupplier<AuthDaoIMPL> instanceSupplier = InstanceSupplier.using(AuthDaoIMPL::new);
    instanceSupplier = instanceSupplier.andThen(AuthDaoIMPL__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
