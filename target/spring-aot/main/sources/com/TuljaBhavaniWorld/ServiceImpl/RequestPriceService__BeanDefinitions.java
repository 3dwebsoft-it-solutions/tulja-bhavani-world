package com.TuljaBhavaniWorld.ServiceImpl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RequestPriceService}.
 */
@Generated
public class RequestPriceService__BeanDefinitions {
  /**
   * Get the bean definition for 'requestPriceService'.
   */
  public static BeanDefinition getRequestPriceServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RequestPriceService.class);
    InstanceSupplier<RequestPriceService> instanceSupplier = InstanceSupplier.using(RequestPriceService::new);
    instanceSupplier = instanceSupplier.andThen(RequestPriceService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
