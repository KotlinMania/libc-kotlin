package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

public val NET_RT_MAXID: CInt = 10

public val TIOCTIMESTAMP: CUlong = 0x40087459uL

public val TIOCDCDTIMESTAMP: CUlong = 0x40087458uL

public val BIOCSETF: CUlong = 0x80084267uL

public val BIOCSRTIMEOUT: CUlong = 0x8008426duL

public val BIOCGRTIMEOUT: CUlong = 0x4008426euL

public val BIOCSETFNR: CUlong = 0x8008427euL
