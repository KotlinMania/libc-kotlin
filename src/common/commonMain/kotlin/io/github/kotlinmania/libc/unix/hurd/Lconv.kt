package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Lconv(
    val decimalPoint: String?,
    val thousandsSep: String?,
    val grouping: String?,
    val intCurrSymbol: String?,
    val currencySymbol: String?,
    val monDecimalPoint: String?,
    val monThousandsSep: String?,
    val monGrouping: String?,
    val positiveSign: String?,
    val negativeSign: String?,
    val intFracDigits: Byte,
    val fracDigits: Byte,
    val pCsPrecedes: Byte,
    val pSepBySpace: Byte,
    val nCsPrecedes: Byte,
    val nSepBySpace: Byte,
    val pSignPosn: Byte,
    val nSignPosn: Byte,
    val intPCsPrecedes: Byte,
    val intPSepBySpace: Byte,
    val intNCsPrecedes: Byte,
    val intNSepBySpace: Byte,
    val intPSignPosn: Byte,
    val intNSignPosn: Byte,
)
