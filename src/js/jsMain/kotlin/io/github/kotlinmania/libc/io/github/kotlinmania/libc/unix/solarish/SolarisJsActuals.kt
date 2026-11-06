package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mincore(addr?.value ?: 0L, len, vec?.value ?: 0L)") as CInt

public actual fun doorCall(d: CInt, params: DoorArgT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').doorCall(d, params?.toLong() ?: 0L)") as CInt

public actual fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: DoorDescT?, numDesc: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').doorReturn(dataPtr?.value ?: 0L, dataSize, descPtr?.toLong() ?: 0L, numDesc)") as CInt

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt =
    js("require('@kotlinmania/libc-native-bindings').doorCreate(serverProcedure, cookie?.value ?: 0L, attributes)") as CInt

public actual fun fattach(fildes: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fattach(fildes, path)") as CInt

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetattrNp(thread, attr?.toLong() ?: 0L)") as CInt

public actual fun euidaccess(path: String?, amode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').euidaccess(path, amode)") as CInt

public actual fun openpty(amain: CInt?, asubord: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amain?.toLong() ?: 0L, asubord?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun forkpty(amain: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amain?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT
