package dao;

import common.IRepository;
import model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDAO implements IRepository<Item> {

  private List<Item> items;

  public ItemDAO() {
    items = new ArrayList<Item>();
  }

  @Override
  public List<Item> getList() {
    return items;
  }


}
