package com.github.leleact.jtest.spring.tx.test;

import com.github.leleact.jtest.spring.tx.bean.dto.T1;
import com.github.leleact.jtest.spring.tx.bean.mapper.T1Mapper;
import com.github.leleact.jtest.spring.tx.service.S;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test-datasource.xml"})
public class RollBackTestor {

    @Resource
    private S s;

    @Resource
    private T1Mapper t1Mapper;


    @Test
    public void rollBackForExceptionTest() {
        try {
            T1 t1 = new T1();
            t1.setF1("1");
            t1.setF2("2");
            s.intert(t1);
        } catch (RuntimeException e) {

        }
        T1 t = t1Mapper.selectByPrimaryKey("1");
        Assert.assertNull(t);
    }

    @Test
    public void rollBackForExceptionTest1() {
        try {
            T1 t1 = new T1();
            t1.setF1("1");
            t1.setF2("2");
            s.intert1(t1);
        } catch (RuntimeException e) {

        }
        T1 t = t1Mapper.selectByPrimaryKey("1");
        Assert.assertNull(t);
    }

    @Test
    public void rollBackForExceptionTest2() {
        try {
            T1 t1 = new T1();
            t1.setF1("1");
            t1.setF2("2");
            s.intert2(t1);
        } catch (RuntimeException e) {

        }
        T1 t = t1Mapper.selectByPrimaryKey("1");
        Assert.assertNotNull(t);

        Assert.assertEquals("不相等", "1", t.getF1());
        Assert.assertEquals("不相等", "2", t.getF2());
    }
}