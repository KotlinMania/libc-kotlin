package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.COpaquePointer

public fun interface FileReadWrite {
    public operator fun invoke(file: File?, operation: UioRw, buffer: COpaquePointer?, size: Long, context: COpaquePointer?): Int
}

public fun interface FileIoctl {
    public operator fun invoke(file: File?, command: Long, argument: String?, flags: Long, extension: Long): Int
}

public fun interface FileSelectNotification {
    public operator fun invoke(): Unit
}

public fun interface FileSelect {
    public operator fun invoke(file: File?, events: Int, returnedEvents: UShort?, notification: FileSelectNotification?): Int
}

public fun interface FileClose {
    public operator fun invoke(file: File?): Int
}

public fun interface FileStat {
    public operator fun invoke(file: File?, status: Stat?): Int
}
