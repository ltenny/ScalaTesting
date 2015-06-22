package com.trc.blog

object Utils {

  def DotifyString(s: String, maxLength: Int) : String = {
    val dotString = "..."
    var result = s
    if (s.length() > maxLength) {
      val dotStringLength = dotString.length()
      val partsLength = (maxLength - dotStringLength) / 2;
      val left = s.substring(0,partsLength)
      val right = s.substring(s.length() - partsLength)
      result = left + dotString + right
    }
    result
  }
}
