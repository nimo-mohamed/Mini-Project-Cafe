import MenuItem.{coffee, sandwich, steak}


class CafeLogic {

//    val  orderLine1: Seq[OrderLine] = Seq(
//      OrderLine(MenuItem.coffee, 2),
//      OrderLine(MenuItem.sandwich, 1),
//      OrderLine(MenuItem.steak, 1)
//    )


  //  Create an order
  def createOrder(order: Order): Either[String, Seq[Order]] =
    if (order.stockAvailable) Right(Seq(order)) else
      Left(s"${order.item} is out of stock")


  // Construct the Bill
//  val bill = Bill(orderLine1)

  val bill = createOrder match {  case orderLine:Seq[Order] => ItemCategory(orderLine)  case _ => "item is out of stock"}


  def createOrder(orderLine: Order): Either[String, Int] = {
    Order.stockAvailable match {
      case item if item <= 0 => Left(s"${orderLine.item} is out of stock")
      case item if item >= 1 => Right(Seq(orderLine))
    }
  }
//  /** Automatic service charge (based on pattern matching) */
//
//  def autoCharge = ServiceChargeCalculator.calculateServiceCharge(bill)
//
//
//  /** Example of custom rate (15%) service charge */
//  def customCharge = ServiceChargeCalculator.calculateServiceCharge(bill, Some(0.15))



  // Calculate the subtotal of all OrderLine items
  def subtotal: Double = orders.map(_.lineTotal).sum




  /** Calculate the total including an optional or automatic service charge. */
  def totalWithServiceCharge(optionalCharge: Option[Double] = None): Double = {
    val serviceChargeAmount = ServiceChargeCalculator.calculateServiceCharge(this, optionalCharge)
    subtotal + serviceChargeAmount
  }
  // The **this** keyword ensures the correct instance of Bill is passed to calculateServiceCharge.

  /** Produce an itemised string of each line: */
  def itemisedBill: Seq[(String, Double)] = orders.map(order => (order.item.name, order.item.price))
}
