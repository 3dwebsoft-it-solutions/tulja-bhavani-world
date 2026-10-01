package com.TuljaBhavaniWorld.ServiceImpl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ContactMessageService}.
 */
@Generated
public class ContactMessageService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ContactMessageService apply(RegisteredBean registeredBean,
      ContactMessageService instance) {
    AutowiredFieldValueResolver.forRequiredField("contactMessageRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
