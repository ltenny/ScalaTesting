package com.trc.blog

object MainApp extends App {
  val dotified = Utils.DotifyString("Hello this is a really long string that should work in our cruel World!", 15)
  println(s"The dotified string is: $dotified")
}

