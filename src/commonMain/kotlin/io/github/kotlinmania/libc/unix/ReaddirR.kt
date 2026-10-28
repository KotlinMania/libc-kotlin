package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Dirent

public expect fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int
