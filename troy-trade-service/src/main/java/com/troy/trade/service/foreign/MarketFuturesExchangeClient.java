package com.troy.trade.service.foreign;

import com.troy.futures.exchange.api.service.MarketFuturesExchangeApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(qualifier = "marketFuturesExchangeClient", name = "${troy.futuresExchange.serviceName}")
public interface MarketFuturesExchangeClient extends MarketFuturesExchangeApi {

}
