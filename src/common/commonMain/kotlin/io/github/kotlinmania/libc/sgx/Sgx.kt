// port-lint: source sgx.rs
package io.github.kotlinmania.libc.sgx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

// SGX C types definition

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public val INT_MIN: CInt = -2147483648.toInt()

public val INT_MAX: CInt = 2147483647
