import MenuItem.{sandwich, steak}

object SandBox extends App {


  val orderLine1: Seq[Order] = Seq(
      Order(MenuItem.coffee, 2),
      Order(sandwich, 1),
      Order(steak, 1)
  )

  val bill = ItemCategory(orderLine1)


  val cafeLogic = new CafeLogic()


  // Print the itemised bill

  println(bill.itemisedBill)
  println(s"Subtotal: £${bill.subtotal}")

  println(s"Service Charge (auto): £${cafeLogic.autoCharge}")

  println(s"Service Charge (override 15%): £${cafeLogic.customCharge}")

  /** Total with automatic service charge */
  println(s"Total with (auto Service Charge): £${bill.totalWithServiceCharge()}")

  /** Total with custom 15% service charge */
  println(s"Total with custom (15% Service Charge): £${bill.totalWithServiceCharge(Some(0.15))}")


}
