package com.message.frame;



public class PageResult  extends  JsonResult {


    private Integer total;

    public PageResult(){
        this.total=0;
        super.setCode(1);
        super.setMsg("SUCCESS");
        super.setData(null);
    }

    public PageResult(int code, String msg, Object data,int total){
    	super.setCode(code) ;
    	super.setMsg(msg) ;
    	super.setData(data) ;
    	this.total=total;
    	
    }

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    
}
