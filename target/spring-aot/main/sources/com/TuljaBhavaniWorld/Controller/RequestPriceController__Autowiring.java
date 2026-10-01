package com.TuljaBhavaniWorld.Controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RequestPriceController}.
 */
@Generated
public class RequestPriceController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RequestPriceController apply(RegisteredBean registeredBean,
      RequestPriceController instance) {
    AutowiredFieldValueResolver.forRequiredField("requestPriceService").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("emailService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
