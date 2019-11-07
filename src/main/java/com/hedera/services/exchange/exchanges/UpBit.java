package com.hedera.services.exchange.exchanges;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Represents a UpBit Exchange response.
 *
 * @author Anirudh, Cesar
 */
public class UpBit extends AbstractExchange {

    @Override
    @JsonProperty("HBAR")
    public Double getHBarValue() {
        return null;
    }

    public static UpBit load(final String endpoint) {
        return load(endpoint, UpBit.class);
    }
}
