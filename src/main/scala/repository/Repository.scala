package repository

import model.HotelListItem


class HotelListItemRepository extends Repository[HotelListItem]  with HotelListItemStore


private[repository] trait Repository[T] {

  private var counter: Long = 0

  private[repository] var store:Map[Long,T]

  def id() = {
    counter += 1
    counter
  }

  def find(id:Long): Option[T] = store.get(id)

  def save(id: Long, value: T ): Unit = store = store + (id -> value)

  def remove(id: Long): Unit = store = store - id

  def findAll:List[T] = store.values.toList

}

private[repository] trait HotelListItemStore {
 private[repository] var store:Map[Long,HotelListItem] =
   (1L to 10L).map(
    id =>
      id -> HotelListItem(15.5 * id, (id * 2).toInt, Some(id))
   ).foldLeft(Map[Long,HotelListItem]()) {
    (map,tuple) => map + tuple
  }


  // using for comprehension
  (for {
    id <- 1L to 10L
    tuple = id -> HotelListItem(15.5 * id, (id * 2).toInt, Some(id))
  } yield tuple).foldLeft(Map[Long,HotelListItem]()) {
    (map,tuple) => map + tuple
  }

}

