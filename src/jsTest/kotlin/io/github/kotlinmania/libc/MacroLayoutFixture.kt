package io.github.kotlinmania.libc

private fun layoutProbe(index: Int): String = js("""(() => {
    const proc = globalThis.process;
    if (!proc || typeof proc.getBuiltinModule !== 'function') throw new Error('Real C ABI layout fixture is not wired for the browser');
    const path = proc.getBuiltinModule('path');
    const requireNative = proc.getBuiltinModule('module').createRequire(path.join(proc.cwd(), 'package.json'));
    return requireNative('@kotlinmania/libc-native-bindings').macroLayoutValue(index);
})()""")

internal actual fun macroLayoutValue(index: Int): ULong = layoutProbe(index).toULong()
