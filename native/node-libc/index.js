const path = require('node:path');
const fs = require('node:fs');
const platforms = { darwin: 'macos', linux: 'linux', win32: 'windows' };
const architectures = { arm64: 'aarch64', x64: 'x86_64' };
const host = `${platforms[process.platform]}-${architectures[process.arch]}`;
const candidates = [
  path.join(__dirname, 'prebuilds', host, 'libc_native.node'),
  path.join(__dirname, 'build', 'Release', 'c_native.node'),
  path.join(__dirname, 'build', 'Release', 'libc_native.node'),
];
const binary = candidates.find(candidate => fs.existsSync(candidate));
if (!binary) throw new Error(`Missing libc native payload for ${host}; install the matching node-native library artifact`);
const bindings = require(binary);
if (typeof bindings.rawAbiVersion !== 'function' || bindings.rawAbiVersion() !== 2) {
  throw new Error(`The libc native payload for ${host} does not match library ABI 2`);
}
module.exports = bindings;
