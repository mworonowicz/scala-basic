import controller.HotelListController
import repository.HotelListItemRepository
import service.HotelListService

trait Application extends HotelListController{

  val hotelListItemRepository = new HotelListItemRepository

  val hotelListService = new HotelListService(hotelListItemRepository)

}
