package com.TuljaBhavaniWorld.ServiceImpl;

import com.TuljaBhavaniWorld.Dao.UserDao;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UserServiceIMPL}.
 */
@Generated
public class UserServiceIMPL__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'userServiceIMPL'.
   */
  private static BeanInstanceSupplier<UserServiceIMPL> getUserServiceIMPLInstanceSupplier() {
    return BeanInstanceSupplier.<UserServiceIMPL>forConstructor(UserDao.class)
            .withGenerator((registeredBean, args) -> new UserServiceIMPL(args.get(0)));
  }

  /**
   * Get the bean definition for 'userServiceIMPL'.
   */
  public static BeanDefinition getUserServiceIMPLBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UserServiceIMPL.class);
    InstanceSupplier<UserServiceIMPL> instanceSupplier = getUserServiceIMPLInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(UserServiceIMPL__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
