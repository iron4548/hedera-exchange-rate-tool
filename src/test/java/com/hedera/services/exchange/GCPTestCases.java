package com.hedera.services.exchange;

import com.hedera.services.exchange.exchanges.Exchange;
import org.junit.jupiter.api.Test;

public class GCPTestCases {

    @Test
    public void addExchangeRate(){
       /* Rate currRate = new Rate(12,1566928800);
        Rate nextRate = new Rate(15,1566932400);

        ExchangeRate exchangeRate = new ExchangeRate(currRate, nextRate);
        GCPExcahgneRateDB.pushExchangeRate(exchangeRate);

        */
       GCPExcahgneRateDB.main();

    }
}
