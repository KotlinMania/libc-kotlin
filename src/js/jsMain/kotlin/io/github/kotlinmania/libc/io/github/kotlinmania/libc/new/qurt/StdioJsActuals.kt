package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun fopen(filename: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fopen(filename, mode)") as FILE?

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').freopen(filename, mode, stream?.toLong() ?: 0L)") as FILE?

public actual fun fclose(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fclose(stream?.toLong() ?: 0L)") as CInt

public actual fun fflush(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fflush(stream?.toLong() ?: 0L)") as CInt

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fread(ptr?.value ?: 0L, size, nmemb, stream?.toLong() ?: 0L)") as SizeT

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fwrite(ptr?.value ?: 0L, size, nmemb, stream?.toLong() ?: 0L)") as SizeT

public actual fun fgetc(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetc(stream?.toLong() ?: 0L)") as CInt

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputc(c, stream?.toLong() ?: 0L)") as CInt

public actual fun getchar(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getchar()") as CInt

public actual fun putchar(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putchar(c)") as CInt

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ungetc(c, stream?.toLong() ?: 0L)") as CInt

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').fgets(s?.value ?: 0L, size, stream?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputs(s: String?, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputs(s, stream?.toLong() ?: 0L)") as CInt

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gets(s?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun puts(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').puts(s)") as CInt

public actual fun vprintf(format: String?, ap: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vprintf(format, ap)") as CInt

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vfprintf(stream?.toLong() ?: 0L, format, ap)") as CInt

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsprintf(s?.value ?: 0L, format, ap)") as CInt

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsnprintf(s?.value ?: 0L, n, format, ap)") as CInt

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseek(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun ftell(stream: FILE?): CLong =
    js("require('@kotlinmania/libc-native-bindings').ftell(stream?.toLong() ?: 0L)") as CLong

public actual fun rewind(stream: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').rewind(stream?.toLong() ?: 0L)")
}

public actual fun fgetpos(stream: FILE?, pos: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpos(stream?.toLong() ?: 0L, pos?.toLong() ?: 0L)") as CInt

public actual fun fsetpos(stream: FILE?, pos: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetpos(stream?.toLong() ?: 0L, pos?.toLong() ?: 0L)") as CInt

public actual fun clearerr(stream: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').clearerr(stream?.toLong() ?: 0L)")
}

public actual fun feof(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').feof(stream?.toLong() ?: 0L)") as CInt

public actual fun ferror(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ferror(stream?.toLong() ?: 0L)") as CInt

public actual fun perror(s: String?) {
    js("require('@kotlinmania/libc-native-bindings').perror(s)")
}

public actual fun remove(filename: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').remove(filename)") as CInt

public actual fun rename(old: String?, new: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rename(old, new)") as CInt

public actual fun tmpfile(): FILE? =
    js("require('@kotlinmania/libc-native-bindings').tmpfile()") as FILE?

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').tmpnam(s?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)") as CInt

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').setbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L)")
}
