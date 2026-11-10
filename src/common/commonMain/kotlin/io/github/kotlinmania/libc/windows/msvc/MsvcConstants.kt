package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

// POSIX Supplement (from errno.h)
// This particular error code is only currently available in msvc toolchain
public val EOTHER: CInt = 131
