package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong

// The following definitions are correct for arm and i686,
// but may be wrong for mips
public typealias ModeT = UShort

public typealias Off64T = CLonglong

public typealias SigsetT = CUlong

public typealias SocklenT = Int

public typealias Time64T = Long

public typealias U64 = CUlonglong

public typealias S64 = CLonglong
