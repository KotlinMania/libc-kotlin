package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.libc.windows.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt

public expect fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt

// NOTE: For MSVC target, `wmemchr` is only a inline function in `<wchar.h>`
// header file. We cannot find a way to link to that symbol from Rust.
public expect fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT>
