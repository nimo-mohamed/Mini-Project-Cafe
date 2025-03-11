class CafeLogic {

  private def createOrder(orders: Seq[Order]): Either[String, Seq[Order]] = {
    val orderedItems = orders.map(item => if (item.stockAvailable) item else item.toString)

    if (orderedItems.exists { case _: String => true; case _ => false }) Right(orders) else
      Left(s"${orderedItems.filter(_.isInstanceOf[String])}")
  }

  def subtotal(orders: Seq[Order]): Either[String, Double] = createOrder(orders).fold(
    error => Left(error),
    orderedItems => Right(orderedItems.map(_.lineTotal).sum)
  )

  def totalWithServiceCharge(orders: Seq[Order], itemCategory: ItemCategory, optionalCharge: Option[Double] = None): String = {
    val total = subtotal(orders) match {
      case Left(error) => error
      case Right(total) => (ServiceChargeCalculator.calculateServiceCharge(itemCategory, optionalCharge) * total) + total
    }
    total.toString
  }

  def itemisedBill(orders: Seq[Order]): Seq[(String, Double)] = orders.map(order => (order.item.name, order.item.price))

}