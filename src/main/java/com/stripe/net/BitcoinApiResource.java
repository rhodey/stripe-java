package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;

import java.io.UnsupportedEncodingException;

/**
 * Programmer: rhodey
 */
public class BitcoinApiResource extends APIResource {

  protected static String classURL(Class<?> clazz) {
    return String.format("%s/v1/bitcoin/%ss", Stripe.getApiBase(), className(clazz));
  }

  protected static String instanceURL(Class<?> clazz, String id) throws InvalidRequestException {
    try {

      return String.format("%s/%s", classURL(clazz), urlEncode(id));

    } catch (UnsupportedEncodingException e) {
      throw new InvalidRequestException("Unable to encode parameters to " +
          CHARSET + ". Please contact support@stripe.com for assistance.", null, e);
    }
  }

}
