case class Order(item: MenuItem, quantity: Int) {


  def lineTotal: Double = item.price * quantity
  def stockAvailable: Boolean = item.stockCount >= quantity



}
