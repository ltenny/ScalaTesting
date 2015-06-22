package com.trc.blog

import org.scalacheck.Properties
import org.scalacheck.Prop

class DotifyCheckTests extends Properties("Utils") {

  property("dotify") = Prop.forAll { (s: String, maxLength: Int) =>
    val result = Utils.DotifyString(s, maxLength)
    result.length() <= maxLength
  }
}
