// port-lint: source windows/gnu/gnu_mod.rs
package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.WcharT

public open class MaxAlignT(public var priv: List<Double>)

// stdio file descriptor numbers
public val STDIN_FILENO: CInt = 0

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2

public expect fun strcasecmp(s1: String?, s2: String?): CInt

public expect fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt

// NOTE: For MSVC target, `wmemchr` is only a inline function in `<wchar.h>`
// header file. We cannot find a way to link to that symbol from Rust.
public expect fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT?
