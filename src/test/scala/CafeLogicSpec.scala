import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec



class CafeLogicSpec extends AnyWordSpec with Matchers {
      val bill: ItemCategory = ItemCategory(Seq(
        Order(coffee, 2),
        Order(sandwich, 1)
      ))
      val coffee: MenuItem = MenuItem(name = "Coffee", price = 2.50, stockCount = 0, MenuCategory.Drink, foodType = Drinks, isPremium = false)
      val sandwich: MenuItem = MenuItem(name = "Sandwich", price = 5.00, stockCount = 3, MenuCategory.Food, foodType = HotFood, isPremium = false)

  "A Bill" should {

    "calculate the correct subtotal" in {

      // Create a bill with multiple items
//      val expectedResult = 10
//      input shouldBe expectedResult

      bill.subtotal shouldBe(10.00)
    }
  }


  //  should "apply 10% service charge when there is food but not premium food"

  //  should "apply 25% service charge when there is premium food"
  //  should "apply 25% service charge when there is premium drink"

  // should "apply 0% service charge when there is no food"
}
