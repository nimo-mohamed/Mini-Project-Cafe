// Take a customer order and produce an itemised bill which includes the total with an optional service charge added.

case class ItemCategory(orders: Seq[Order]) {

  // Check whether any line contains a Food item
  def containsFood: Boolean = {
    orders.exists(orderLine => orderLine.item.category == MenuCategory.Food)
  }

  // Check if there's any hot food
  def containsHotFood: Boolean = orders.exists(order => order.item.category == MenuCategory.Food && order.item.foodType == HotFood)

  // Check if there's any cold food
  def containsColdFood: Boolean = orders.exists(order => order.item.category == MenuCategory.Food && order.item.foodType == ColdFood)

  // Check if there's any premium food
  def containsPremiumFood: Boolean = orders.exists(order => order.item.category == MenuCategory.Food && order.item.isPremium)

  // Check if there's any premium drink
  def containsPremiumDrink: Boolean = orders.exists(order => order.item.category == MenuCategory.Drink && order.item.isPremium)

}

