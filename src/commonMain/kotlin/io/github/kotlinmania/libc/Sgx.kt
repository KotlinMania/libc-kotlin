// port-lint: source sgx.rs
package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias SizeT = ULong
public typealias PtrdiffT = Long
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias SsizeT = Long

public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647
