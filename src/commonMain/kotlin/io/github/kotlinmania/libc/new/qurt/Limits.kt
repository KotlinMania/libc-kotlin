// port-lint: source new/qurt/limits.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val CHAR_BIT: UInt = 8u
public const val CHAR_MAX: Byte = 255.toByte()
public const val CHAR_MIN: Byte = 0
public const val SCHAR_MAX: Byte = 127
public const val SCHAR_MIN: Byte = -128
public val UCHAR_MAX: UByte = (255).toUByte()
public const val INT_MAX: Int = 2147483647
public const val INT_MIN: Int = (-2147483647 - 1)
public const val UINT_MAX: UInt = 4294967295u
public const val LONG_MAX: Long = 2147483647
public const val LONG_MIN: Long = (-2147483647 - 1)
public const val ULONG_MAX: ULong = 4294967295uL
public const val SHRT_MAX: Short = 32767
public const val SHRT_MIN: Short = (-32768)
public val USHRT_MAX: UShort = (65535).toUShort()
public const val ARG_MAX: Int = 4096
public const val CHILD_MAX: Int = 25
public const val LINK_MAX: Int = 8
public const val MAX_CANON: Int = 255
public const val MAX_INPUT: Int = 255
public const val NAME_MAX: Int = 255
public const val OPEN_MAX: Int = 20
public const val PATH_MAX: Int = 260
public const val PIPE_BUF: Int = 512
public const val STREAM_MAX: Int = 20
public const val TZNAME_MAX: Int = 50
public const val IOV_MAX: Int = 16
