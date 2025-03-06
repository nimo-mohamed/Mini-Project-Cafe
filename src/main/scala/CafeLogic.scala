import MenuItem.{coffee, sandwich, steak}


class CafeLogic {

    val  orderLine1: Seq[OrderLine] = Seq(
      OrderLine(coffee, 2),
      OrderLine(sandwich, 1),
      OrderLine(steak, 1)
    )


  //  Create an order
  def createOrder(orderLine: OrderLine): String = Either[String, Seq[OrderLine]] = {
    if (OrderLine.stoc)
  }

  // Construct the Bill
  val bill = Bill(orderLine1)


  /** Automatic service charge (based on pattern matching) */

  def autoCharge = ServiceChargeCalculator.calculateServiceCharge(bill)


  /** Example of custom rate (15%) service charge */
  def customCharge = ServiceChargeCalculator.calculateServiceCharge(bill, Some(0.15))


}
