package model;

public class Id {

  private long _id = 0;
  public Id(long id) throws Exception {
    if(id<=0)
      throw new Exception("Id cannot be zero or non-negative!");
    _id=id;
  }

  public long getId(){
    return _id;
  }
}
