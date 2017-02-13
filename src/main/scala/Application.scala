import repository.RepositoryImpl

import scala.io.StdIn

class Application  {


 val repository = new RepositoryImpl
 val service = ???

  println("Choose option: ")
  println("list")
  println("get [id[")
  println("save [obj[")
  println("exit")

  def handleMenu():Unit = {
    StdIn.readLine()match {
      case "list" =>  ???
      case "get"  =>  ???
      case "exit" => System.exit(0)
      case _ => handleMenu()
    }
  }

}

object Application extends Application with App {
  handleMenu()
}