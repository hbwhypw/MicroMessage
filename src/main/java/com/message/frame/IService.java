package com.message.frame;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-5-7
 * Time: 上午2:17
 * To change this template use File | Settings | File Templates.
 */
public interface IService<T,E>  {

    /**
     * 插入实体
     * @param record
     * @return
     */
    int insertSelective(T record);


    /**
     * 选择实体
     * @param example
     * @return
     */
    List<T> select(E example);
    
    


    /**
     * 更新实体
     * @param record
     * @return
     */
    int updateSelective(T record);
    
    
    /**
     * 带条件更新实体
     * @param record
     * @return
     */
    int updateByExampleSelective(T record, E example);


    /**
     * 删除实体
     * @param example
     * @return
     */
    int delete(E example);
    
    
    /**
     * 获取数据带分页
     * @param example
     * @return
     */
    PageResult   selectByPage(E example);
    
    

}
