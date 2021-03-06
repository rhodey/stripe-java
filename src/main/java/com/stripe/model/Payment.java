package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.BitcoinApiResource;

import java.util.Map;

/**
 * Programmer: rhodey
 */
public class Payment extends BitcoinApiResource implements MetadataStore<Payment> {

  protected String  id;
  protected Long    created;
  protected Integer amount;
  protected String  currency;
  protected String  receiver;
  protected Map<String, String> metadata;

  public String getId() {
    return id;
  }

  public Long getCreated() {
    return created;
  }

  public Integer getAmount() {
    return amount;
  }

  public String getCurrency() {
    return currency;
  }

  public String getReceiver() {
    return receiver;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public static Payment create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException
  {
    return create(params, null);
  }

  public static Payment retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException
  {
    return retrieve(id, null);
  }

  public static Payment create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
             APIConnectionException, CardException, APIException
  {
    return request(APIResource.RequestMethod.POST, classURL(Payment.class), params, Payment.class, apiKey);
  }

  public static Payment retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
             APIConnectionException, CardException, APIException
  {
    return request(APIResource.RequestMethod.GET, instanceURL(Payment.class, id), null, Payment.class, apiKey);
  }

  public Payment update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
             APIConnectionException, CardException, APIException
  {
    return update(params, null);
  }

  public Payment update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
             APIConnectionException, CardException, APIException
  {
    return request(RequestMethod.POST, instanceURL(Payment.class, id), params, Payment.class, apiKey);
  }

}
