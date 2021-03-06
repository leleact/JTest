package com.github.leleact.jtest.jdk.pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class RegexTests {

    @Test
    public void dataPatterTest() {

        String patternStr = "\\d{4}([1][0-2]|[0][1-9])([0][1-9]|[1-2][0-9]|[3][01])";
        Pattern pattern = Pattern.compile(patternStr);

        // 年 1000-9999
        // 月 01-12
        // 日 01-31

        for (int y = 1000; y <= 9999; y++) {
            for (int m = 1; m <= 12; m++) {
                for (int d = 1; d <= 31; d++) {
                    String yyyymmdd = String.format("%04d%02d%02d", y, m, d);
                    Matcher matcher = pattern.matcher(yyyymmdd);
                    if (!matcher.matches()) {
                        log.info("{} not matched", yyyymmdd);
                    }
                }
            }
        }
    }


    @Test
    public void urlPatternTest() {
        String patternStr = "^\\s*(http(s)?://)\\w+(\\.\\w+)+(\\S+){1,512}$";
        Pattern pattern = Pattern.compile(patternStr);

        String url = "https://a-b.com";

        log.info("reslut {}", pattern.matcher(url).matches());

    }

    @Test
    public void spaceTest() {

        String patternStr = "^[\\S]{0,64}$";

        Pattern pattern = Pattern.compile(patternStr);

        String s1 = "s";
        Assertions.assertTrue(pattern.matcher(s1).matches());

        String s2 = "";
        Assertions.assertTrue(pattern.matcher(s2).matches());
    }
}
