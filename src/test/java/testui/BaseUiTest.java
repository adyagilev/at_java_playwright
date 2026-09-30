package testui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseUiTest {
    private static final Logger logger = LoggerFactory.getLogger(BaseUiTest.class);

    @BeforeAll
    public static void setConfig() {
        logger.info("Make initial configuration");
    }

    @AfterEach
    public void attach() {
        logger.info("Make post actions, attach UI artifacts");
    }
}
