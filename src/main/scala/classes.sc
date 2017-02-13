// classes

class MyClass(count: Int, val name: String) {
  private val hidden = "can you see it?"

  def this(name: String) = this(3, name)
  def this() = this("test")

  def +(n: Int): Int = count + n
  def ::(n: Int): Int = this.+(n)
  def unary_!(): Unit = println(name)
  def noSideEffects: String = name + count
}

val myClass = new MyClass
//myClass.hidden  does not compile
myClass + 3
3 :: myClass
!myClass
myClass.name
myClass.noSideEffects






// Traits

trait MyTrait {
  def name: String
  def mkString(name: String) = this.name + name
}
trait MyNextTrait { this: MyTrait =>
  def reverse = name.reverse
}

class MyClassWithTrait(val name: String) extends MyTrait
val myClassWithTrait = new MyClassWithTrait("test")
val traitImpl = new MyTrait {  val name = "test" }
val traitObject = new { val name = "test"} with MyTrait with MyNextTrait



// objects

class MyObjectClass(name: String) {
  def sayHello():Unit =  println(s"hello $name")
}

object MyObject extends MyObjectClass("Marcin")
MyObject.sayHello()

object MyObjectClass {
  def apply(name: String) = new MyObjectClass(name)
  def apply() = new MyObjectClass("Marcin")
}

val single = MyObjectClass()
single.sayHello()

//