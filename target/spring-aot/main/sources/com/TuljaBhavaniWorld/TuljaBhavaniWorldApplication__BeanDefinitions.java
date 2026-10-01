package com.TuljaBhavaniWorld;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TuljaBhavaniWorldApplication}.
 */
@Generated
public class TuljaBhavaniWorldApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'tuljaBhavaniWorldApplication'.
   */
  public static BeanDefinition getTuljaBhavaniWorldApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TuljaBhavaniWorldApplication.class);
    beanDefinition.setInstanceSupplier(TuljaBhavaniWorldApplication::new);
    return beanDefinition;
  }
}
