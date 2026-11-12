// port-lint: source new/qurt/dlfcn.rs
package io.github.kotlinmania.libc.new.qurt.dlfcn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `dlfcn.h`
//
// Dynamic linking functions and constants from Hexagon toolchain.

// Values for dlopen `mode`
public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_LOCAL: CInt = 0x200

// Compatibility constant
public val DL_LAZY: CInt = RTLD_LAZY

// Special handles
public val RTLD_NEXT: MutPtr<CVoid> = MutPtr<CVoid>((-1).toLong())

public val RTLD_DEFAULT: MutPtr<CVoid> = MutPtr<CVoid>((-2).toLong())

public val RTLD_SELF: MutPtr<CVoid> = MutPtr<CVoid>((-3).toLong())

public expect fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid>

public expect fun dlclose(handle: MutPtr<CVoid>): CInt

public expect fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid>

public expect fun dlerror(): MutPtr<CChar>
