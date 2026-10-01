package com.TuljaBhavaniWorld.DaoImpl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UserDaoIMPL}.
 */
@Generated
public class UserDaoIMPL__BeanDefinitions {
  /**
   * Get the bean definition for 'userDaoIMPL'.
   */
  public static BeanDefinition getUserDaoIMPLBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UserDaoIMPL.class);
    InstanceSupplier<UserDaoIMPL> instanceSupplier = InstanceSupplier.using(UserDaoIMPL::new);
    instanceSupplier = instanceSupplier.andThen(UserDaoIMPL__PersistenceInjection::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
