


val orderLine1: Seq[OrderLine] = Seq(
  OrderLine(MenuItem.coffee, 2),
//  OrderLine(sandwich, 1),
//  OrderLine(steak, 1)
)

val bill = Bill(orderLine1)


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
