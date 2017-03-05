import akka.http.scaladsl.server.{HttpApp, Route}

object Server extends HttpApp with Application {
  override protected def route: Route =
    pathPrefix("hotels") { hotelListItemsRoute }

  def main(args: Array[String]): Unit = {
    startServer("localhost", 8080)
  }
}




