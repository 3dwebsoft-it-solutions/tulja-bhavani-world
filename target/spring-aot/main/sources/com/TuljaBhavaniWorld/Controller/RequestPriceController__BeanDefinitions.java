package com.TuljaBhavaniWorld.Controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RequestPriceController}.
 */
@Generated
public class RequestPriceController__BeanDefinitions {
  /**
   * Get the bean definition for 'requestPriceController'.
   */
  public static BeanDefinition getRequestPriceControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RequestPriceController.class);
    InstanceSupplier<RequestPriceController> instanceSupplier = InstanceSupplier.using(RequestPriceController::new);
    instanceSupplier = instanceSupplier.andThen(RequestPriceController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
