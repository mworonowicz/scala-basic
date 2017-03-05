package utils

object PriceUtils {

  implicit class PriceBetween(price: Double) {
    def between(gt: Double, lt: Double): Boolean = price <= lt && price >= gt
  }

}

object FunctionUtils {

  // implicit class Predicate[A](fun: A => Boolean)

}