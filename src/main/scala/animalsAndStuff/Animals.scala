package animalsAndStuff

object Animals extends App {
  val dog = new Dog("Mike")
  val cat = new Cat("Jenny") with RebelSoul

  println(dog.speak())
  println(cat.comeToMaster())
}

trait Pet {
  def speak(): String = "Eyo"
}

trait TailWagger {
  def startTail(): Unit
  def stopTail(): Unit
}

trait Runner {
  def startRunning(): Unit
  def stopRunning(): Unit
}

trait RebelSoul {
  def comeToMaster(): String = "Not gonna happen"
}

class Dog(name: String) extends Pet with TailWagger with Runner {
  def this() = this("Lessie")

  override def speak(): String = "Woof"

  override def startTail(): Unit = println("Big, plushy tali is swinging around")

  override def stopTail(): Unit = println("Tail stops in place")

  override def startRunning(): Unit = println("Dog is running happily like never before")

  override def stopRunning(): Unit = println("Dog freezes in place")
}

class Cat(name: String) extends Pet with TailWagger with Runner {
  def this() = this("Claire")

  override def speak(): String = "Meoow"

  override def startTail(): Unit = println("Thin, long tali is moving swiftly through air")

  override def stopTail(): Unit = println("Tail slowly stops in place")

  override def startRunning(): Unit = println("Cat is running making no sound")

  override def stopRunning(): Unit = println("Cat freezes in place")
}