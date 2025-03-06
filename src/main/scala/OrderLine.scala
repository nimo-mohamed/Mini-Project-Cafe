case class OrderLine(item: MenuItem, quantity: Int) {


  def lineTotal: Double = item.price * quantity
  def stockAvailable: Boolean = item.stockCount > 0

}
