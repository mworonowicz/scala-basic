package model

case class SearchCriteria(amount: Int, price: Option[PriceSearch] = None)

case class PriceSearch(graterThen:Double, lessThan:Double)



