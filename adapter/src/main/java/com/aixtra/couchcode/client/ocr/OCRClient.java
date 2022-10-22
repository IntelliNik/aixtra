package com.aixtra.couchcode.client.ocr;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import reactor.core.publisher.Mono;

@Client("${ocr.url}")
public interface OCRClient {
    @Get(value = "/compute", consumes = "data/raw", produces = "application/json")
    Mono<byte[]> recognize(@Body byte[] image);
}
