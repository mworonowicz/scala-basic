package service

import model.{HotelListItem, PriceSearch, SearchCriteria}
import repository.HotelListItemRepository
import utils.FunctionUtils._
import utils.PriceUtils._


class HotelListService(repository: HotelListItemRepository) {


  def get(id: Long) = repository.find(id)

  def search(searchCriteria: SearchCriteria): List[HotelListItem] =
    searchCriteria match {
      case SearchCriteria(amount,None) => repository.findAll.filter(applyAvailabilityFilter(amount))
      case SearchCriteria(amount,Some(priceSearch)) => repository.findAll.filter(applyAvailabilityFilter(amount) && applyPriceFilter(priceSearch))
    }

  def saveHotelListItem(item: HotelListItem) = {
    val id = repository.id()
    repository.save(id,item.copy(id = Some(id)))
  }

  private def applyAvailabilityFilter(amount: Int) =  (hotelItem : HotelListItem) => hotelItem.availability >= amount

  private def applyPriceFilter(priceSearch: PriceSearch) =
    (hotelItem: HotelListItem) => hotelItem.price.between(priceSearch.graterThen,priceSearch.lessThan)


}
