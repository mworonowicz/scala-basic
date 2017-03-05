// Case class

case class MyData(name:String = "Test", count:Int = 0)

val myData1 = MyData("Test")
val myData2 = MyData(count = 1)
val myData3 = myData1.copy(count = 1)
myData2 == myData3

myData1.name == myData2.name











// case objects

sealed trait MyEnum
case object MyFirstEnum extends MyEnum
case object MySecondEnum extends MyEnum

val myEnum:MyEnum = MyFirstEnum

sealed abstract class MyPropertyEnum(val name:String)
case object MyFirstPropertyEnum extends MyPropertyEnum("test1")
case object MySecondPropertyEnum extends MyPropertyEnum("test2")

MyFirstPropertyEnum.name






//  pattern matching

// case class MyData(name:String = "Test", count:Int = 0)

val count = 3
MyData(count = -2) match {
  case MyData(_,0)  => println("empty")
  case v@MyData(_,1)  => println(s"one with name ${v.name}")
  case MyData(n,c) if c < 3  => println(s"My nane is $n")
  case MyData(_,`count`) => println("Its 3")
  case _ => println("Couldn't match")
}


// extracting from case class

val MyData(name,amount) = MyData("test",2)