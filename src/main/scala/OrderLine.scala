case class OrderLine(item: MenuItem, quantity: Int) {

  def lineTotal: Double = item.price * quantity

}
