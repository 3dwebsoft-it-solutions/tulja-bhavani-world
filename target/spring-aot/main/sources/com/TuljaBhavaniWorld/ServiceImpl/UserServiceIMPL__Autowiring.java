package com.TuljaBhavaniWorld.ServiceImpl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link UserServiceIMPL}.
 */
@Generated
public class UserServiceIMPL__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static UserServiceIMPL apply(RegisteredBean registeredBean, UserServiceIMPL instance) {
    AutowiredFieldValueResolver.forRequiredField("userDao").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
