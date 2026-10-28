package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): Int
