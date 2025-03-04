// Take a customer order and produce an itemised bill which includes the total with an optional service charge added.

case class Bill(lines: Seq[OrderLine]) {

  // Calculate the subtotal of all OrderLine items
  def subtotal: ???

  // Check whether any line contains a Food item
  def containsFood: ???

  // Check if there's any hot food
  def containsHotFood: ???

  // Check if there's any cold food
  def containsColdFood: ???

  // Check if there's any premium food
  def containsPremiumFood: ???

  /** Produce an itemised string of each line: */
  def itemisedBill: String = ???

  /** Calculate the total including an optional or automatic service charge. */
  def totalWithServiceCharge: ???
}
