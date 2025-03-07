import MenuItem.{coffee, sandwich, steak}


class CafeLogic {

//    val  orderLine1: Seq[OrderLine] = Seq(
//      OrderLine(MenuItem.coffee, 2),
//      OrderLine(MenuItem.sandwich, 1),
//      OrderLine(MenuItem.steak, 1)
//    )


  //  Create an order
  def createOrder(orderLine: Order): Either[String, Seq[Order]] =
    if (orderLine.stockAvailable) Right(Seq(orderLine)) else
      Left(s"${orderLine.item} is out of stock")


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


}
