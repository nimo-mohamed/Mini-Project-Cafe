
sealed trait MenuCategory

object MenuCategory {
  case object Food extends MenuCategory

  case object Drink extends MenuCategory

}

trait FoodType

case object ColdFood extends FoodType

case object HotFood extends FoodType

case object Drinks extends FoodType

