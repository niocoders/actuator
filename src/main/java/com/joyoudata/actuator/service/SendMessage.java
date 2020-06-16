package com.joyoudata.actuator.service;

import com.joyoudata.actuator.entity.MailDO;

/**
 * @ClassName SendMessage
 * @Description TODO
 * @Author xuzilong
 * @Date 2020/6/16 12:19
 * @Version 1.0
 */
public interface SendMessage {
    /*
     * @Description //TODO 发送纯文本
     * @Author xuzilong
     * @Date 13:03 2020/6/16
     * @Param * @param null
     * @return
     **/
    void sendTextMail(MailDO mailDO);

    /*
     * @Description //TODO 发送html
     * @Author xuzilong
     * @Date 13:03 2020/6/16
     * @Param * @param null
     * @return
     **/
    void sendHtmlMail(MailDO mailDO, boolean isShowHtml);

    /*
     * @Description //TODO 发送模板页面
     * @Author xuzilong
     * @Date 13:03 2020/6/16
     * @Param * @param null
     * @return
     **/
    void sendTemplateMail(MailDO mailDO);
}