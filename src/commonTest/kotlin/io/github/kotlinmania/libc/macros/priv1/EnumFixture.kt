package io.github.kotlinmania.libc.macros.priv1

import io.github.kotlinmania.libc.cEnumUByteValues

internal typealias E1 = UByte

private val values = cEnumUByteValues()
private val privOn1: E1 = values.variant(10u)
internal val pub1: E1 = values.variant((privOn1 * 2u).toUByte())
