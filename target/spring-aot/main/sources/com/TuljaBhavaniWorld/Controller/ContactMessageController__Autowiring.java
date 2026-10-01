package com.TuljaBhavaniWorld.Controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ContactMessageController}.
 */
@Generated
public class ContactMessageController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ContactMessageController apply(RegisteredBean registeredBean,
      ContactMessageController instance) {
    AutowiredFieldValueResolver.forRequiredField("contactMessageService").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("emailService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
