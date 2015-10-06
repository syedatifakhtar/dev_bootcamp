package dao;

import common.IRepository;
import junit.framework.TestCase;
import model.Item;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ItemDAOTest extends TestCase {

  @Test
  public void shouldReturnListOfItems() {
    IRepository itemRepository = new ItemDAO();
    assertEquals(itemRepository.getList(), new ArrayList<Item>());
  }

}