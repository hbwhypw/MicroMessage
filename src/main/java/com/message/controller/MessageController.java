package com.message.controller;

import com.message.frame.JsonResult;
import com.message.frame.MessageStatus;
import com.message.frame.ServiceRuntimeException;
import com.message.po.Message;
import com.message.po.MessageExample;
import com.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015-04-16.
 */
@Controller
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping("/save.do")
    @ResponseBody
    public JsonResult save(HttpServletRequest request, HttpServletResponse response,
                           @ModelAttribute("message") Message message,BindingResult bResult){
        if (bResult.hasErrors()) {
            return new JsonResult(-1,bResult.getAllErrors().get(0).getDefaultMessage(),null);
        }
        message.setUuid(new Date().getTime());
        message.setCreateDate(new Date());
        messageService.insertSelective(message);
        return new JsonResult(MessageStatus.MS_SUCCESS,MessageStatus.getStatusText(MessageStatus.MS_SUCCESS),message.getUuid());
    }

    @RequestMapping("/print.do")
    public String print(HttpServletRequest request, HttpServletResponse response){
        String uuid = request.getParameter("uuid");
        MessageExample messageExample = new MessageExample();
        messageExample.or().andUuidEqualTo(new Long(uuid));
        List<Message> list = messageService.select(messageExample);
        if (list.size() == 0){
            throw new ServiceRuntimeException(MessageStatus.getStatusText(MessageStatus.NOT_EXITIS),MessageStatus.NOT_EXITIS);
        }
        Message message = list.get(0);
        request.setAttribute("title", message.getTitle()); 
        request.setAttribute("author", message.getAuthor()); 
        request.setAttribute("date", message.getCreateDate());
        request.setAttribute("content", message.getContent());
        return "model.ftl";
    }
}
