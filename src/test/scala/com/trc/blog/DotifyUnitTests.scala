package com.trc.blog

import org.scalatest.FunSuite

class DotifyUnitTests extends FunSuite {

  test("string that doesn't need to be dotified") {
    val testString = "Hello World!"
    assert(Utils.DotifyString(testString, 15).length() == testString.length())
  }

  test("string that does need to be dotified") {
    val testString = "Hello this is a really long string that should work in our cruel World!"
    assert(Utils.DotifyString(testString, 15).length() <= 15)
  }
}
