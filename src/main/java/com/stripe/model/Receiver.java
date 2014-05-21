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
public class Receiver extends BitcoinApiResource {

  protected String  id;
  protected Long    created;
  protected String  inboundAddress;
  protected String  bitcoinUri;
  protected Integer amount;
  protected String  currency;
  protected Integer bitcoinAmount;
  protected Boolean filled;
  protected String  description;
  protected String  email;

  public String getId() {
    return id;
  }

  public Long getCreated() {
    return created;
  }

  public String getInboundAddress() {
    return inboundAddress;
  }

  public String getBitcoinUri() {
    return bitcoinUri;
  }

  public Integer getAmount() {
    return amount;
  }

  public String getCurrency() {
    return currency;
  }

  public Integer getBitcoinAmount() {
    return bitcoinAmount;
  }

  public Boolean getFilled() {
    return filled;
  }

  public String getDescription() {
    return description;
  }

  public String getEmail() {
    return email;
  }

  public static Receiver create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException
  {
    return create(params, null);
  }

  public static Receiver retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException
  {
    return retrieve(id, null);
  }

  public static Receiver create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException
  {
    return request(APIResource.RequestMethod.POST, classURL(Receiver.class), params, Receiver.class, apiKey);
  }

  public static Receiver retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException
  {
    return request(APIResource.RequestMethod.GET, instanceURL(Receiver.class, id), null, Receiver.class, apiKey);
  }

}
