// A standard list of menu items.
// Premium specials that can be able to be added/removed from the menu.
// Stock count of the menu items. Some cannot order an item if the count is zero.

case class MenuItem(
                     name: String,
                     price: Double,
                     stockCount: Int,
                     category: MenuCategory,
                     foodType: FoodType,
                     isPremium: Boolean
                   ) {

}

object MenuItem {


  // Hot Drinks
  val coffee = MenuItem(name = "Coffee", price = 2.50, stockCount = 0, MenuCategory.Drink, foodType = Drinks, isPremium = false)
  val tea = MenuItem(name = "Tea", price = 2.00, stockCount = 8, MenuCategory.Drink, foodType = Drinks, isPremium = false)

  // Cold Drinks
  val icedCoffee = MenuItem(name = "Iced Coffee", price = 3.00, stockCount = 7, MenuCategory.Drink, foodType = Drinks, isPremium = false)
  val icedTea = MenuItem(name = "Iced Tea", price = 2.50, stockCount = 5, MenuCategory.Drink, foodType = Drinks, isPremium = false)

  // Hot Food
  val sandwich = MenuItem(name = "Sandwich", price = 5.00, stockCount = 3, MenuCategory.Food, foodType = HotFood, isPremium = false)
  val burger = MenuItem(name = "Burger", price = 6.00, stockCount = 5, MenuCategory.Food, foodType = HotFood, isPremium = false)

  // Cold Food
  val salad = MenuItem(name = "Salad", price = 4.50, stockCount = 8, MenuCategory.Food, foodType = ColdFood, isPremium = false)
  val wrap = MenuItem(name = "Wrap", price = 5.50, stockCount = 4, MenuCategory.Food, foodType = ColdFood, isPremium = false)

  // ----- Premium Food Items (isPremium = true) -----
  // Hot Premium Food
  val steak = MenuItem(name = "Steak", price = 15.00, stockCount = 7, MenuCategory.Food, foodType = HotFood, isPremium = true)
  val lobsterBisque = MenuItem(name = "Lobster Bisque", price = 18.00, stockCount = 3, MenuCategory.Food, foodType = HotFood, isPremium = true)

  // Cold Premium Food
  val premiumCheesePlate = MenuItem(name = "Premium Cheese Plate", price = 20.00, stockCount = 2, MenuCategory.Food, foodType = ColdFood, isPremium = true)
  val smokedSalmon = MenuItem(name = "Smoked Salmon", price = 17.00, stockCount = 4, MenuCategory.Food, foodType = ColdFood, isPremium = true)
}


