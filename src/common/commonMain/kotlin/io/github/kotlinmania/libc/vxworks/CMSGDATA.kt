package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun cmsgData(cmsg: COpaquePointer?): COpaquePointer?
