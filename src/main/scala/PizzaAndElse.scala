object PizzaAndElse extends App{
  val p = new Pizza
  p.addTopping(Cheese)
  p.addTopping(Pepperoni)
  println(p)

  println("Lets just throw away all of that")
  p.removeAllToppings()
  println(p)

  println("Havaian - pizza feared by all")
  val havaian = new Pizza(LargeCrustSize, ThickCrustType)
  havaian.addTopping(Cheese)
  havaian.addTopping(Pepperoni)
  havaian.addTopping(Pineapple)
  println(havaian)
  println("Something went wrong in the pizzeria, gimme a sec...")
  havaian.removeTopping(Pepperoni)
  println(havaian)

}

sealed trait Topping
case object Cheese extends Topping
case object Pepperoni extends Topping
case object Sausage extends Topping
case object Mushrooms extends Topping
case object Onions extends Topping
case object Pineapple extends Topping

sealed trait CrustSize
case object SmallCrustSize extends CrustSize
case object MediumCrustSize extends CrustSize
case object LargeCrustSize extends CrustSize

sealed trait CrustType
case object RegularCrustType extends CrustType
case object ThinCrustType extends CrustType
case object ThickCrustType extends CrustType

class Pizza (var crustSize: CrustSize = MediumCrustSize, var crustType: CrustType = RegularCrustType) {

  // ArrayBuffer is a mutable sequence (list)
  val toppings = scala.collection.mutable.ArrayBuffer[Topping]()

  def addTopping(t: Topping): Unit = toppings += t
  def removeTopping(t: Topping): Unit = toppings -= t
  def removeAllToppings(): Unit = toppings.clear()

  override def toString(): String = {
    s"""
       |Crust Size: $crustSize
       |Crust Type: $crustType
       |Toppings:   $toppings
        """.stripMargin}
}