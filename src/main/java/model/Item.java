package model;

public class Item {

  private long id;
  private String name;
  private String description;

  public Item(long id,String name,String description) throws Exception{
    if(id<=0)
      throw new Exception("Id cannot be 0 or less than zero");
    if(name==null || name.isEmpty())
      throw new Exception("Name cannot be empty or null");

    this.id = id;
    this.name = name;
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }
}
