package com.TuljaBhavaniWorld.ServiceImpl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ContactMessageService}.
 */
@Generated
public class ContactMessageService__BeanDefinitions {
  /**
   * Get the bean definition for 'contactMessageService'.
   */
  public static BeanDefinition getContactMessageServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ContactMessageService.class);
    InstanceSupplier<ContactMessageService> instanceSupplier = InstanceSupplier.using(ContactMessageService::new);
    instanceSupplier = instanceSupplier.andThen(ContactMessageService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
