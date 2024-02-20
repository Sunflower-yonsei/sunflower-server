package sunflower.server.client;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class MockOcrProgressClient implements OcrProgressClient {

    @Override
    public boolean isDone(final String pdfId) {
        return true;
    }
}