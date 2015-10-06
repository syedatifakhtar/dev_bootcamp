package model;

public class Price {

  public enum Currency  {
    DOLLAR("$"),RUPEES("Rs"),EURO("EU");
    private String value;
    Currency(String value) {
      this.value = value;
    }
  }

  private Currency currency;
  private long value;

  public Price(Currency currency,long value) throws Exception {
    if (value<0)
        throw new Exception("Price cannot be negative");
    this.currency = currency;
    this.value = value;
  }

  @Override
  public  String toString() {
    return currency + " " + value;
  }

  public long getValue() {
    return value;
  }

  public Currency getCurrency() {
    return currency;
  }


}
