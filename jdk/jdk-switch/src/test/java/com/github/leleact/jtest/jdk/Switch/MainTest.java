package com.github.leleact.jtest.jdk.Switch;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class MainTest {

    public static class Pojo {

        private String mField;

        private int mI;

        public String getmField() {
            return mField;
        }

        public void setmField(String mField) {
            this.mField = mField;
        }

        public int getmI() {
            return mI;
        }

        public void setmI(int mI) {
            this.mI = mI;
        }
    }

    @Test
    public void switchTest() {

        Pojo pj = new Pojo();
        pj.setmField("03");
        pj.setmI(10);

        switch (pj.getmField()) {

            case "01":
                log.debug("01");
                break;

            case "02":

            case "03":
                log.debug("02 or 03");
                break;

            default:
                log.warn("unknown ...");
                break;
        }
    }

}
