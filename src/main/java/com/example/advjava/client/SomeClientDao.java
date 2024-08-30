package com.example.advjava.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

//@Repository
//public class SomeClientDao {
//
//    private static final Logger logger = LoggerFactory.getLogger(SomeClientDao.class);
//
//    private static final String CLIENT_NAME = "ComeClientName";
//    private static final String GET_RESULTS = CLIENT_NAME + "_getResults";
//
//    private final Transformer transformer;
//
//    private final SomeFeignClient someFeignClient;
//
//    public ContentExperienceHubDao(Transformer transformer, SomeFeignClient someFeignClient) {
//        this.transformer = transformer;
//        this.someFeignClient = someFeignClient;
//    }
//
//    @TimeLimiter(name = GET_RESULTS)
//    @Retry(name = GET_RESULTS)
//    @CircuitBreaker(name = CLIENT_NAME)
//    @Bulkhead(name = CLIENT_NAME, type = THREADPOOL)
//    public CompletableFuture<?> getFeaturedProductsCampaign(String param, Optional<String> header) {
//        try {
//            ? results = someFeignClient.getResults(param, header);
//            return CompletableFuture.completedFuture(
//                    results == null ? emptyCampaign() : transform(results, screenSize)
//            );
//        } catch (Exception ex) {
//            return CompletableFuture.completedFuture(handleError(ex));
//        }
//    }
//
//    public ? handleError(Throwable throwable) {
//        publishCmsErrorEplEvent("Error when getting promoted products from ContentExperienceHub Service. " + throwable.getMessage());
//        logger.error("Error ", throwable);
//        return emptyCampaign();
//    }
//
//    private void publishCmsErrorEplEvent(String message) {
//    }
//
//    private ? transform(? dto, , Optional<Viewport> screenSize) {
//        return transformer.toModel(dto, screenSize);
//    }
//}
