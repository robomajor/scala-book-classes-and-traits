object Main extends App {
  val p = new Person("John", "Doe")
  p.introduceYourself()
  p.firstName = "Will"
  p.introduceYourself()
  println(p)
  
  val p2 = new Person()
  p2.address.city = "L.A."
  p2.introduceYourself()
}

class Person(var firstName: String, var lastName: String) {
  def this(firstName: String) = this(firstName,"CommonSurname")
  def this() = this("CommonName")

  var age = 20
  var address = new Address()
  def introduceYourself() = println(s"My name is $lastName, $firstName $lastName to be precise. $age years living on $address")
  override def toString: String = s"$firstName $lastName is $age years old"
}

class Address() {
  var street = "Mapple"
  var number = 13
  var city = "Washington"

  override def toString: String = s"$street street $number in $city"
}