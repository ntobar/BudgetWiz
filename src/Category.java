/**
 * Respresents a Finance Category
 */
public class Category {
  private String name;
  private int amount;
  private int maxExpenses;
  private int lowAlert;


  /**
   * This constructor initializes a Category with just a Name.
   * @param name - Represents the name of the category
   */
  public Category(String name) {
    this.name = name;
    this.amount = 0;
    this.maxExpenses = amount;
    this.lowAlert = 0;


  }


  /**
   * This constructor initializes a Category with a Name and an initial amount
   * @param name
   * @param amount
   */
  public Category(String name, int amount) {
    this.name = name;
    this.amount = amount;
    this.maxExpenses = amount;
    this.lowAlert = 0;



  }


  /**
   * This constructor initializes a Category with a Name, an initial amount, and the max expense.
   * @param name
   * @param amount
   * @param maxExpenses
   */
  public Category(String name, int amount, int maxExpenses) {
    this.name = name;
    this.amount = 0;
    this.maxExpenses = maxExpenses;
    this.lowAlert = 0;



  }





}
