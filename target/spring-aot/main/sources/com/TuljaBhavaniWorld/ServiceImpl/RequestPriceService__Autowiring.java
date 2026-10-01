package com.TuljaBhavaniWorld.ServiceImpl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RequestPriceService}.
 */
@Generated
public class RequestPriceService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RequestPriceService apply(RegisteredBean registeredBean,
      RequestPriceService instance) {
    AutowiredFieldValueResolver.forRequiredField("requestPriceRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
