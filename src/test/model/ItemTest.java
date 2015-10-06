package model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ItemTest{

  @Test(expected = Exception.class)
  public void idShouldNotBeNegative() throws Exception {
      new Item(-1,"Some name","Description");
  }

  @Test(expected = Exception.class)
  public void shouldHaveName() throws Exception {
    new Item(1,null,"someDescription");
  }

  @Test
  public void createItem() throws Exception{
    Item item = new Item(1,"name", "desc");
    assertEquals((long)1,item.getId());
    assertEquals("name",item.getName());
    assertEquals("desc",item.getDescription());
  }
}