package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): Int
