package com.TuljaBhavaniWorld.Controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PageController}.
 */
@Generated
public class PageController__BeanDefinitions {
  /**
   * Get the bean definition for 'pageController'.
   */
  public static BeanDefinition getPageControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PageController.class);
    beanDefinition.setInstanceSupplier(PageController::new);
    return beanDefinition;
  }
}
