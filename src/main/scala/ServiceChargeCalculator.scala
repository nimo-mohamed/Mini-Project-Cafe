//  * Service charge rules:
//    * - If the bill has no food, then no service charge.
//    * - If the bill has cold food, apply a 10% service charge.
//    * - If the bill has hot food, apply a 20% service charge instead.
//    * - If the bill has premium food, apply a 25% service charge instead.
//    * - Optionally, if they don't want to pay or want to pay an optional amount.


// instead of If else USE patter match!!!


object ServiceChargeCalculator {
  def calculateServiceCharge(bill: Bill, optionalCharge: Option[Double] = None): Double = {
    val rate: Double = optionalCharge.getOrElse {
      bill match {
        case b if !b.containsFood => 0.0
        case b if b.containsPremiumFood || b.containsPremiumDrink => 0.25
        case b if b.containsHotFood => 0.20
        case b if b.containsColdFood => 0.10
        case _ => 0.0

      }
    }
    bill.subtotal * rate

  }
}
