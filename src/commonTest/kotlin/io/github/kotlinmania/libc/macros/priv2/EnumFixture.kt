package io.github.kotlinmania.libc.macros.priv2

import io.github.kotlinmania.libc.cEnumUShortValues

internal typealias E2 = UShort

private val values = cEnumUShortValues()
internal val privOn1: E2 = values.variant(42u)
internal val pub2: E2 = values.variant((privOn1 * 2u).toUShort())
