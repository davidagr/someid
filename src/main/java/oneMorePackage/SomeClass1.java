package oneMorePackage;

import starter2.SendException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component

public class SomeClass1 {
    Logger log = LoggerFactory.getLogger(this.getClass());

    public void someMethod(int someInt) {
        if (someInt == 1) {
            log.info("Ugadal cifru, molodec!");
        } else {
            log.error("ups");
            throw new RuntimeException("Ne poluchilos,looser");
        }
    }
}
