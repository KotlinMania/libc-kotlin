package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class Lconv(
    val currencySymbol: String?,
    val decimalPoint: String?,
    val fracDigits: Byte,
    val grouping: String?,
    val intCurrSymbol: String?,
    val intFracDigits: Byte,
    val monDecimalPoint: String?,
    val monGrouping: String?,
    val monThousandsSep: String?,
    val negativeSign: String?,
    val nCsPrecedes: Byte,
    val nSepBySpace: Byte,
    val nSignPosn: Byte,
    val positiveSign: String?,
    val pCsPrecedes: Byte,
    val pSepBySpace: Byte,
    val pSignPosn: Byte,
    val thousandsSep: String?,
)
