package service

import repository.Repository

trait CrudService {

  val repository: Repository

  def save(obj: String): Unit

  def get(id: Long): String

  def remove(id: Long): Unit

  def getAll():List[String]
}
