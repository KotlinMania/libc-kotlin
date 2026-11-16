package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun stricmp(s1: ConstPtr, s2: ConstPtr): CInt

public expect fun strnicmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt

public expect fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, count: SizeT): MutPtr
