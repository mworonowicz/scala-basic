package controller

import akka.http.scaladsl.server.{Directives, Route}
import service.HotelListService


trait HotelListController extends Directives {

  val hotelListService: HotelListService

  def hotelListItemsRoute: Route = get {
      complete("OK")
  }

}
