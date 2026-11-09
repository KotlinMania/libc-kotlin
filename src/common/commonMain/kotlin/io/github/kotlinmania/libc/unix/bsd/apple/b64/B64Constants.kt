package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

public val NET_RT_MAXID: CInt = 11

public val TIOCTIMESTAMP: CUlong = 0x40107459uL

public val TIOCDCDTIMESTAMP: CUlong = 0x40107458uL

public val BIOCSETF: CUlong = 0x80104267uL

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val BIOCSETFNR: CUlong = 0x8010427euL
