package cn.maixedu.zsb.model;


public class Orderdetail {

  private long id;
  private long orderid;
  private long goodid;
  private long num;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getGoodid() {
    return goodid;
  }

  public void setGoodid(long goodid) {
    this.goodid = goodid;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }

}
