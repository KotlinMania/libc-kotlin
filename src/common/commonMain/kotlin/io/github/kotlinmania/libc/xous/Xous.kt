// port-lint: source xous.rs
package io.github.kotlinmania.libc.xous

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

// Xous C type definitions

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias OffT = Long

public typealias WcharT = UInt

public val INT_MIN: CInt = -2147483648.toInt()

public val INT_MAX: CInt = 2147483647
