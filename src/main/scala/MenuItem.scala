// A standard list of menu items.
// Premium specials that can be able to be added/removed from the menu.
// Stock count of the menu items. Some cannot order an item if the count is zero.

sealed trait MenuCategory
object MenuCategory {
  case object Food extends MenuCategory
  case object Drink extends MenuCategory
}

case class MenuItem(
                   name: String,
                   price: Double,
                   category: MenuCategory,
                   isPremium: Boolean
                   )
