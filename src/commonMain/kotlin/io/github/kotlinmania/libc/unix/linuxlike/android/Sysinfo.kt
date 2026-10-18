package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Sysinfo

import io.github.kotlinmania.libc.*

public expect fun sysinfo(info: Sysinfo?): Int
