package com.joyoudata.actuator;

import com.joyoudata.actuator.entity.MailDO;
import com.joyoudata.actuator.service.SendMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class ActuatorApplicationTests {
    @Autowired
    SendMessage sendMessage;

    @Test
    void contextLoads() {
        Map<String, Object> map = new HashMap<>();
        map.put("username","许子龙");
        MailDO mailDO=new MailDO();
        mailDO.setEmail("llnlgg@163.com");
        mailDO.setAttachment(map);
        mailDO.setTitle("11111");
        mailDO.setContent("22222222");
        sendMessage.sendTemplateMail(mailDO);

    }
}