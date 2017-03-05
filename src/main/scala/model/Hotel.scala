package model

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol

case class HotelListItem(price: Double, availability: Int, id: Option[Long] = None)

object HotelListItemJson extends SprayJsonSupport with DefaultJsonProtocol {

  implicit val hotelListItem = jsonFormat3(HotelListItem)
}