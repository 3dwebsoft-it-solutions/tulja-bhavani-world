package com.TuljaBhavaniWorld.ServiceImpl;

import com.TuljaBhavaniWorld.Dao.AdminRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AdminService}.
 */
@Generated
public class AdminService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'adminService'.
   */
  private static BeanInstanceSupplier<AdminService> getAdminServiceInstanceSupplier() {
    return BeanInstanceSupplier.<AdminService>forConstructor(AdminRepository.class)
            .withGenerator((registeredBean, args) -> new AdminService(args.get(0)));
  }

  /**
   * Get the bean definition for 'adminService'.
   */
  public static BeanDefinition getAdminServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AdminService.class);
    beanDefinition.setInstanceSupplier(getAdminServiceInstanceSupplier());
    return beanDefinition;
  }
}
