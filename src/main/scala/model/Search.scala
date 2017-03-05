package model

case class SearchCriteria(amount: Int, price: Option[PriceSearch] = None)

case class PriceSearch(lessThan:Double, graterThen:Double = 0)




