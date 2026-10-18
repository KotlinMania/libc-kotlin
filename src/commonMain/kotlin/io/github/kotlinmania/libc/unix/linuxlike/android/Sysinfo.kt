package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Sysinfo

public expect fun sysinfo(info: Sysinfo?): Int
