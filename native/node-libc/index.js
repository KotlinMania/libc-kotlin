// Entry point for the libc N-API native module
// Shared between Kotlin/JS (nodeMain) and Kotlin/WASM (wasmJsMain via Node.js)
//
// This addon wraps direct C library calls — no insecure NPM dependencies.
// Both JS and WASM targets load the same compiled .node binary.
//
// Note: node-gyp strips the "lib" prefix from the target name, producing
// "c_native.node" instead of "libc_native.node". This is standard Unix
// linker behavior — the library is still "libc_native", the file just
// drops the prefix.

try {
    module.exports = require('./build/Release/c_native.node');
} catch (err) {
    try {
        module.exports = require('./build/Debug/c_native.node');
    } catch (err2) {
        throw new Error(
            'Could not load libc_native addon. ' +
            'Run `npm install` or `node-gyp rebuild` in native/node-libc directory.\n' +
            'Original error: ' + err.message + '\n' +
            'Debug error: ' + err2.message
        );
    }
}
