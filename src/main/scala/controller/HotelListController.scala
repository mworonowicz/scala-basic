package controller

import akka.http.scaladsl.server.{Directives, Route}
import model.HotelListItemJson._
import model.{PriceSearch, SearchCriteria}
import service.HotelListService


trait HotelListController extends Directives {

  val hotelListService: HotelListService

  def hotelListItemsRoute: Route =
    pathPrefix("hotel") {
     pathEnd {
       get {
         parameters('amount.as[Int], 'lt.as[Double] ?, 'gt.as[Double] ? 0) { (amount,lt,gt)=>
           complete(hotelListService.search(SearchCriteria(amount, lt.map(PriceSearch(_,gt)))))
         }
       }
     } ~
      pathPrefix(LongNumber) { id =>
        complete("Ok")
      }
    }
}
