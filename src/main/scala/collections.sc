// list

val l = List(1, 2, 3, 4, 5, 6)
val r = 1 to 6
val l2 = r.head :: l.tail

l.map(_ * 2).foreach(println)
l.foldLeft(0)((acc, i) => acc + i)

List(1, 2, 3) match {
  case s :: Nil => println(s"single elemnt $s")
  case s :: xs :: t if t != Nil => println(s"Second is $xs")
  case s :: xs :: _ => println(s"Head is $xs")
  case Nil => println("its empty")
}




//  map

val m = Map("a" -> 1, "b" -> 2,("c",3))
val m2 = m + ("d" -> 4)
val opt = m.get("a")

opt.map(_ + 1).filter(_ < 2)

opt.fold(0) {
  n =>
    n +1
}

val m3 = m.keys.zip(m.values)
m == m3.toMap
m.mapValues((_,0))




// mutable


import collection.mutable.{ListBuffer => MList }
val ml = MList(1, 2)
ml += 3
0 +=: ml
ml :+ 4
0 +: ml

ml ++= (4 :: 5 :: Nil)
(-1 :: Nil) ++=: ml
ml ++: ( 6 :: Nil)
(-3  :: -2 :: Nil) ++: ml

import collection.mutable.{Map => MMap}
val mm = MMap("a" -> 0)
mm += ("b" -> 1)
mm -= "a"
mm + ("a" -> 0)
mm - ("b")

