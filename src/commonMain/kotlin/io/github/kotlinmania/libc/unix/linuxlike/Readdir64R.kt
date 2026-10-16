package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): Int
