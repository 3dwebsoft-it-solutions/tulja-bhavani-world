package com.TuljaBhavaniWorld.Controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ContactMessageController}.
 */
@Generated
public class ContactMessageController__BeanDefinitions {
  /**
   * Get the bean definition for 'contactMessageController'.
   */
  public static BeanDefinition getContactMessageControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ContactMessageController.class);
    InstanceSupplier<ContactMessageController> instanceSupplier = InstanceSupplier.using(ContactMessageController::new);
    instanceSupplier = instanceSupplier.andThen(ContactMessageController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
