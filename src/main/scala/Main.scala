object Main extends App {
  val p = new Person("John", "Doe")
  p.introduceYourself()
  p.firstName = "Will"
  p.introduceYourself()
  println(p)

  val p2 = new Person(lastName = "Wilys")
  p2.address.city = "L.A."
  p2.introduceYourself()
}

class Person(var firstName: String = "Commonname", var lastName: String = "Popularsurname") {
  var age = 20
  var address = new Address()
  def introduceYourself() = println(s"My name is $lastName, $firstName $lastName to be precise. $age years living on $address")
  override def toString: String = s"$firstName $lastName is $age years old"
}

class Address(var street: String = "Mapple", var number: Int = 13, var city: String = "Washington") {
  override def toString: String = s"$street street $number in $city"
}