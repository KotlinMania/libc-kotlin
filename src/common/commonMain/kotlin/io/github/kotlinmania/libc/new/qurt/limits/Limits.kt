// port-lint: source new/qurt/limits.rs
package io.github.kotlinmania.libc.new.qurt.limits

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.qurt.CSchar

// Header: `limits.h`

// Character properties
public val CHAR_BIT: CUint = 8u

public val CHAR_MAX: CChar = 255u

// unsigned char on Hexagon
public val CHAR_MIN: CChar = 0u

public val SCHAR_MAX: CSchar = 127

public val SCHAR_MIN: CSchar = -128

public val UCHAR_MAX: CUchar = 255u

// Integer properties
public val INT_MAX: CInt = 2147483647

public val INT_MIN: CInt = (-2147483647 - 1)

public val UINT_MAX: CUint = 4294967295u

public val LONG_MAX: CLong = 2147483647L

public val LONG_MIN: CLong = (-2147483647L - 1L)

public val ULONG_MAX: CUlong = 4294967295uL

public val SHRT_MAX: CShort = 32767

public val SHRT_MIN: CShort = (-32768)

public val USHRT_MAX: CUshort = 65535u

// POSIX Limits
public val ARG_MAX: CInt = 4096

public val CHILD_MAX: CInt = 25

public val LINK_MAX: CInt = 8

public val MAX_CANON: CInt = 255

public val MAX_INPUT: CInt = 255

public val NAME_MAX: CInt = 255

public val OPEN_MAX: CInt = 20

public val PATH_MAX: CInt = 260

public val PIPE_BUF: CInt = 512

public val STREAM_MAX: CInt = 20

public val TZNAME_MAX: CInt = 50

// Additional limits
public val IOV_MAX: CInt = 16
