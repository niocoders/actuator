package com.joyoudata.actuator.entity;

import lombok.Data;

import java.util.Map;

/**
 * @ClassName MailDo
 * @Description TODO
 * @Author xuzilong
 * @Date 2020/6/16 13:02
 * @Version 1.0
 */
@Data
public class MailDO {
    //标题
    private String title;
    //内容
    private String content;
    //接收人邮件地址
    private String email;
    //附加，value 文件的绝对地址/动态模板数据
    private Map<String, Object> attachment;
}