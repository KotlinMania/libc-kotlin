package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcRenameOldat(olddirfd: Int, oldpath: String?, newpath: String?): Int
