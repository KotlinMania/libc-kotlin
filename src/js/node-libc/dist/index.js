try {
    module.exports = require('./build/Release/libc_native.node');
} catch (err) {
    try {
        module.exports = require('./build/Debug/libc_native.node');
    } catch (err2) {
        throw new Error(
            'Could not load libc_native addon. ' +
            'Original error: ' + err.message + ' | Debug error: ' + err2.message
        );
    }
}
