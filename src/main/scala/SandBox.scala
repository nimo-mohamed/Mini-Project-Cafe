import MenuItem.{sandwich, steak}

object SandBox extends App {


  val nimosOrder: Seq[Order] = Seq(
    Order(MenuItem.coffee, 2),
    Order(sandwich, 1),
    Order(steak, 1),
    Order(steak, 1)
  )

  val orderedItems = ItemCategory(nimosOrder)

  val cafeLogic = new CafeLogic()

  private val customServiceCharge = 10

  println(s"Order: ${cafeLogic.subtotal(nimosOrder)}")

  println(s"Order with Service Charge: ${cafeLogic.totalWithServiceCharge(nimosOrder, orderedItems)}")

  println(s"Order with Custom Service Charge: ${cafeLogic.totalWithServiceCharge(nimosOrder, orderedItems, Some(customServiceCharge / 100))}")

  println(s"Itemised Order ${cafeLogic.itemisedBill(nimosOrder)}")

}
