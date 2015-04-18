package com.message.serviceImpl;

import com.message.dao.MessageDao;
import com.message.frame.PageResult;
import com.message.po.Message;
import com.message.po.MessageExample;
import com.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015-04-17.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageDao messageDao;

    @Override
    public int insertSelective(Message record) {
        return messageDao.insertSelective(record);
    }

    @Override
    public List<Message> select(MessageExample example) {
        return messageDao.selectByExample(example);
    }

    @Override
    public int updateSelective(Message record) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(Message record, MessageExample example) {
        return messageDao.updateByExample(record,example);
    }

    @Override
    public int delete(MessageExample example) {
        return messageDao.deleteByExample(example);
    }

    @Override
    public PageResult selectByPage(MessageExample example) {
        return null;
    }
}
