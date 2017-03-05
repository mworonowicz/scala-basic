package service

import model.{HotelListItem, SearchCriteria}
import repository.HotelListItemRepository


class HotelListService(repository: HotelListItemRepository) {

  def search(searchCriteria: SearchCriteria): List[HotelListItem] = ???

  def saveHotelListItem(item: HotelListItem) = ???


}
