package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.windows.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun stricmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt

public expect fun strnicmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt

public expect fun memccpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, c: CInt, count: SizeT): MutPtr<CVoid>
