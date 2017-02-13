package repository

trait Repository {

  private[repository] val store:Map[Long,String]

  def find(id:Long): Option[String] = store.get(id)

  def save(id: Long, value: String ): Unit

  def remove(id: Long)

  def findAll:List[String]
}

trait Store {
 private[repository] val store:Map[Long,String] = Map()
}

class RepositoryImpl extends Repository  with Store {

  override def find(id: Long) = ???

  override def save(id: Long, value: String) = ???

  override def remove(id: Long) = ???

  override def findAll = ???
}