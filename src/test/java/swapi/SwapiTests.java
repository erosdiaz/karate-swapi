package swapi;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;

import com.trivago.cluecumber.core.CluecumberCore;
import com.trivago.cluecumber.engine.exceptions.CluecumberException;
import org.junit.jupiter.api.Test;

class SwapiTests {

    @Test
    void testParallel() throws CluecumberException {
        final int threads = 10;

        Results results= Runner.path("classpath:swapi/features")
                .outputCucumberJson(true)
                .outputHtmlReport(false)
                .parallel(threads);

        new CluecumberCore.Builder()
                .setCustomPageTitle("My cool report")
                .build()
                .generateReports(
                        "target/karate-reports",
                        "target/cluecumber");

        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}