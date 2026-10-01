package com.TuljaBhavaniWorld.ServiceImpl;

import com.TuljaBhavaniWorld.Dao.AuthDao;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AuthServiceIMPL}.
 */
@Generated
public class AuthServiceIMPL__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'authServiceIMPL'.
   */
  private static BeanInstanceSupplier<AuthServiceIMPL> getAuthServiceIMPLInstanceSupplier() {
    return BeanInstanceSupplier.<AuthServiceIMPL>forConstructor(AuthDao.class)
            .withGenerator((registeredBean, args) -> new AuthServiceIMPL(args.get(0)));
  }

  /**
   * Get the bean definition for 'authServiceIMPL'.
   */
  public static BeanDefinition getAuthServiceIMPLBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AuthServiceIMPL.class);
    beanDefinition.setInstanceSupplier(getAuthServiceIMPLInstanceSupplier());
    return beanDefinition;
  }
}
