import MenuItem.{coffee, sandwich, steak}


class CafeLogic {

    val  orderLine1: Seq[OrderLine] = Seq(
      OrderLine(MenuItem.coffee, 2),
      OrderLine(MenuItem.sandwich, 1),
      OrderLine(MenuItem.steak, 1)
    )


  //  Create an order
  def createOrder(orderLine: OrderLine): Either[String, Seq[OrderLine]] =
    if (orderLine.stockAvailable) Right(Seq(orderLine)) else
      Left(s"${orderLine.item} is out of stock")


//
//  def createOrder(orderLine: Seq[OrderLine]): Either[String, Seq[OrderLine]] = {
//
//    if (orderLine.item.stockAvailable == true)  Right(Seq(orderLine)) else
//      Left(s"Item is out of stock")
//  }



  // Construct the Bill
  val bill = Bill(orderLine1)


  /** Automatic service charge (based on pattern matching) */

  def autoCharge = ServiceChargeCalculator.calculateServiceCharge(bill)


  /** Example of custom rate (15%) service charge */
  def customCharge = ServiceChargeCalculator.calculateServiceCharge(bill, Some(0.15))


}
