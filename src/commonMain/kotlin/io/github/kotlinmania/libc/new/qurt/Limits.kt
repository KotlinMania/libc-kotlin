// port-lint: source libc/src/new/qurt/limits.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val CHAR_BIT: CUInt = 8u
public const val CHAR_MAX: CChar = 255.toByte()
public const val CHAR_MIN: CChar = 0
public const val SCHAR_MAX: CSchar = 127
public const val SCHAR_MIN: CSchar = -128
public val UCHAR_MAX: CUChar = (255).toUByte()
public const val INT_MAX: CInt = 2147483647
public const val INT_MIN: CInt = (-2147483647 - 1)
public const val UINT_MAX: CUInt = 4294967295u
public const val LONG_MAX: CLong = 2147483647
public const val LONG_MIN: CLong = (-2147483647 - 1)
public const val ULONG_MAX: CULong = 4294967295uL
public const val SHRT_MAX: CShort = 32767
public const val SHRT_MIN: CShort = (-32768)
public val USHRT_MAX: CUShort = (65535).toUShort()
public const val ARG_MAX: CInt = 4096
public const val CHILD_MAX: CInt = 25
public const val LINK_MAX: CInt = 8
public const val MAX_CANON: CInt = 255
public const val MAX_INPUT: CInt = 255
public const val NAME_MAX: CInt = 255
public const val OPEN_MAX: CInt = 20
public const val PATH_MAX: CInt = 260
public const val PIPE_BUF: CInt = 512
public const val STREAM_MAX: CInt = 20
public const val TZNAME_MAX: CInt = 50
public const val IOV_MAX: CInt = 16
