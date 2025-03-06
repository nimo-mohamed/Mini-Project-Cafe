import CafeLogic.{autoCharge, bill, customCharge} // Print the itemised bill


println(bill.itemisedBill)
println(s"Subtotal: £${bill.subtotal}")

println(s"Service Charge (auto): £$autoCharge")

println(s"Service Charge (override 15%): £$customCharge")

/** Total with automatic service charge */
println(s"Total with (auto Service Charge): £${bill.totalWithServiceCharge()}")

/** Total with custom 15% service charge */
println(s"Total with custom (15% Service Charge): £${bill.totalWithServiceCharge(Some(0.15))}")
