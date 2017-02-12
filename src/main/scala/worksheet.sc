import java.util.UUID

trait Repository {

  def find(id: Long): String
}

class RepositoryImpl extends Repository {
  override def find(id: Long) = UUID.randomUUID().toString
}


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

def unary_+(a: Int) = a * 3
+.3
