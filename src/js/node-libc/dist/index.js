const candidates = [
    './build/Release/libc_native.node',
    './build/Release/c_native.node',
    './build/Debug/libc_native.node',
    './build/Debug/c_native.node',
];
let loaded = null;
let lastErr = null;
for (const candidate of candidates) {
    try {
        loaded = require(candidate);
        break;
    } catch (err) {
        lastErr = err;
    }
}
if (!loaded) {
    throw new Error('Could not load libc_native addon: ' + (lastErr ? lastErr.message : 'not found'));
}
module.exports = loaded;
