// Take a customer order and produce an itemised bill which includes the total with an optional service charge added.

case class Bill(lines: Seq[OrderLine]) {

  // Calculate the subtotal of all OrderLine items
  def subtotal: Double = lines.map(_.lineTotal).sum

  // Check whether any line contains a Food item
  def containsFood: Boolean = {
    lines.exists(orderLine => orderLine.item.category == MenuCategory.Food)
  }

  // Check if there's any hot food
  def containsHotFood: Boolean = lines.exists(orderLine => orderLine.item.category == MenuCategory.Food && orderLine.item.foodType == HotFood)

  // Check if there's any cold food
  def containsColdFood: Boolean = lines.exists(orderLine => orderLine.item.category == MenuCategory.Food && orderLine.item.foodType == ColdFood)

  // Check if there's any premium food
  def containsPremiumFood: Boolean = lines.exists(orderLine => orderLine.item.category == MenuCategory.Food && orderLine.item.isPremium)

  // Check if there's any premium drink
  def containsPremiumDrink: Boolean = lines.exists(orderLine => orderLine.item.category == MenuCategory.Drink && orderLine.item.isPremium)

  /** Produce an itemised string of each line: */
  def itemisedBill: Seq[(String, Double)] = lines.map(orderLine => (orderLine.item.name, orderLine.item.price))


  /** Calculate the total including an optional or automatic service charge. */
  def totalWithServiceCharge(optionalCharge: Option[Double] = None): Double = {
    val serviceChargeAmount = ServiceChargeCalculator.calculateServiceCharge(this, optionalCharge)
    subtotal + serviceChargeAmount
  }
// The **this** keyword ensures the correct instance of Bill is passed to calculateServiceCharge.
}


