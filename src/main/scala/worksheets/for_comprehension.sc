// for comprehension

val list = List(0,1,2,3,4)

list.filter(_ % 2 == 0).map((_,1)).foreach(t => println(t._1 + t._2))

for {
  l <- list if l % 2 == 0
  num = 1
} println(l + num)


val map = Map(2-> "ok !")

(1 to 10).flatMap(map.get).flatMap(_.split("\\s").headOption).map(_.toUpperCase)

for {
  i <- 1 to 10
  opt <- map.get(i)
  ok <- opt.split("\\s").headOption
  okToUp = ok.toUpperCase
} yield  okToUp





