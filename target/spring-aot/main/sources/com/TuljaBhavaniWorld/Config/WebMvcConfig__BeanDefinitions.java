package com.TuljaBhavaniWorld.Config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link WebMvcConfig}.
 */
@Generated
public class WebMvcConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'webMvcConfig'.
   */
  public static BeanDefinition getWebMvcConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebMvcConfig.class);
    beanDefinition.setTargetType(WebMvcConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(WebMvcConfig.class);
    beanDefinition.setInstanceSupplier(WebMvcConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
