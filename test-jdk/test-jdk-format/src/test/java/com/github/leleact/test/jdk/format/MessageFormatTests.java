package com.github.leleact.test.jdk.format;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class MessageFormatTests {

    private static final Logger logger = LoggerFactory.getLogger(MessageFormatTests.class);

    @Test
    public void formatBaseTest() {

        String s = MessageFormat.format("xx {0} yy {1}", "1", "2");

        logger.info(s);
    }

    @Test
    public void formatArray() {
        List<Object> objectList = new ArrayList<>();
        objectList.add("1");
        objectList.add(2);
        String s = MessageFormat.format("XX {0} yy {1}", objectList.toArray());
        logger.info(s);
    }
}
