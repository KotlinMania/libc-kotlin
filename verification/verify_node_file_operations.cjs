'use strict';
const assert = require('node:assert/strict');
const fs = require('node:fs');
const os = require('node:os');
const path = require('node:path');
const crypto = require('node:crypto');
const output = path.resolve(process.argv[2]);
const candidates = ['c_native.node', 'libc_native.node'].map(name => path.join(output, name)).filter(file => fs.existsSync(file));
assert.equal(candidates.length, 1, `Expected one freshly compiled Node payload in ${output}`);
const selected = candidates[0];
const binarySha256 = crypto.createHash('sha256').update(fs.readFileSync(selected)).digest('hex');
console.log(`Node consumer loading ${selected} SHA256 ${binarySha256}`);
const bindings = require(selected);
assert.equal(bindings.rawAbiVersion(), 2);
const directory = fs.mkdtempSync(path.join(os.tmpdir(), 'libc-node-files-'));
const tests = [];
function passed(name) {
  tests.push(name);
  console.log(`PASS ${name}`);
}
let descriptor = -1;
try {
  const flags = bindings.rawOpenFlags();
  descriptor = bindings.rawOpen(path.join(directory, 'data.bin'), flags[2] | flags[3] | flags[4] | flags[6], 0o600);
  assert.ok(descriptor >= 0);
  const data = Uint8Array.from([0, 10, 13, 127, 128, 255]);
  assert.equal(bindings.write(descriptor, data, data.length), data.length);
  assert.equal(bindings.lseek(descriptor, 0, flags[5]), 0);
  const read = new Uint8Array(data.length);
  assert.equal(bindings.read(descriptor, read, read.length), read.length);
  assert.deepEqual(read, data);
  assert.equal(bindings.read(descriptor, read, read.length), 0);
  passed('descriptorBytesAndEndOfFile');
  assert.equal(bindings.lseek(descriptor, 0, flags[5]), 0);
  const storage = new Uint8Array(data.length + 4).fill(99);
  const view = storage.subarray(2, data.length + 2);
  const originalBuffer = view.buffer;
  assert.equal(bindings.read(descriptor, view, data.length), data.length);
  assert.equal(view.buffer, originalBuffer);
  assert.deepEqual(storage, Uint8Array.from([99, 99, ...data, 99, 99]));
  passed('readMutatesOnlyTheOriginalBufferView');
  let coercions = 0;
  const untyped = {valueOf() { coercions++; throw new Error('must not coerce'); }};
  for (const operation of [bindings.read, bindings.write]) {
    for (const args of [
      ['0', view, 1], [untyped, view, 1], [0.5, view, 1], [NaN, view, 1],
      [2 ** 32, view, 1], [descriptor, new Int8Array(1), 1],
      [descriptor, new Uint8ClampedArray(1), 1], [descriptor, new DataView(view.buffer), 1],
      [descriptor, {}, 1], [descriptor, null, 1], [descriptor, view, '1'],
      [descriptor, view, untyped], [descriptor, view, 0.5], [descriptor, view, Infinity],
      [descriptor, view, Number.MAX_SAFE_INTEGER + 1],
    ]) {
      assert.throws(() => operation(...args), TypeError);
    }
  }
  assert.equal(coercions, 0);
  assert.deepEqual(storage, Uint8Array.from([99, 99, ...data, 99, 99]));
  assert.equal(bindings.read(descriptor, view, 1), 0);
  passed('rejectsUntypedTransfersBeforeCoercionOrIo');

  assert.equal(bindings.read(descriptor, read, read.length + 1), -1);
  assert.equal(bindings.write(descriptor, data, -1), -1);
  passed('rejectsOutOfBoundsCounts');
  let pointer = bindings.rawAllocate('16');
  const copy = bindings.rawAllocateZeroed('1', '16');
  assert.match(pointer, /^[0-9]+$/);
  assert.match(copy, /^[0-9]+$/);
  assert.notEqual(pointer, '0');
  assert.notEqual(copy, '0');
  try {
    assert.equal(bindings.rawFill(pointer, 165, '6'), pointer);
    assert.equal(bindings.rawCopy(copy, pointer, '6'), copy);
    assert.equal(bindings.rawCompare(pointer, copy, '6'), 0);
    assert.equal(bindings.rawFill(copy, 166, '6'), copy);
    assert.notEqual(bindings.rawCompare(pointer, copy, '6'), 0);
    assert.equal(bindings.rawSeek(descriptor, '0', flags[5]), '0');
    assert.equal(bindings.rawWrite(descriptor, pointer, '6'), '6');
    assert.equal(bindings.rawSeek(descriptor, '0', flags[5]), '0');
    assert.equal(bindings.rawRead(descriptor, copy, '6'), '6');
    assert.equal(bindings.rawCompare(pointer, copy, '6'), 0);
    assert.equal(bindings.rawRead(descriptor, copy, '1'), '0');
    const resized = bindings.rawResize(pointer, '32');
    assert.notEqual(resized, '0');
    pointer = resized;
    assert.equal(bindings.rawCompare(pointer, copy, '6'), 0);
    passed('rawMemoryPreservesAddressesMutationAndFileBytes');
    console.log('RUN rawRead invalid descriptor');
    assert.equal(bindings.rawRead(-1, copy, '1'), '-1');
    assert.ok(bindings.rawErrno() > 0);
    console.log('RUN rawSeek before start');
    assert.equal(bindings.rawSeek(descriptor, '-1', flags[5]), '-1');
    assert.ok(bindings.rawErrno() > 0);
    console.log('RUN rawOpen missing file');
    assert.equal(bindings.rawOpen(path.join(directory, 'missing-file'), flags[0] | flags[6], 0), -1);
    assert.ok(bindings.rawErrno() > 0);
    passed('rawFileErrorsRetainSignedResultsAndErrno');
    for (const value of ['', '1junk', ' 1', '1 ', '+1', '-1', '1.0', '1e2',
      '18446744073709551616', null, {}, 1, 1n, untyped]) {
      assert.throws(() => bindings.rawAllocate(value), TypeError);
    }
    assert.throws(() => bindings.rawAllocate(), TypeError);
    assert.throws(() => bindings.rawFill(pointer, NaN, '6'), TypeError);
    assert.throws(() => bindings.rawRead(descriptor + 0.5, copy, '1'), TypeError);
    assert.throws(() => bindings.rawSeek(descriptor, '9223372036854775808', flags[5]), TypeError);
    assert.throws(() => bindings.rawSeek(descriptor, '-9223372036854775809', flags[5]), TypeError);
    assert.equal(coercions, 0);
    assert.equal(bindings.rawCompare(pointer, copy, '6'), 0);
    passed('rawAbiRejectsMalformedIntegersBeforeMemoryOrIo');
  } finally {
    bindings.rawRelease(pointer);
    bindings.rawRelease(copy);
  }

  assert.equal(bindings.close(descriptor), 0);
  descriptor = -1;
  const unicode = path.join(directory, 'résumé-目录.txt');
  fs.writeFileSync(unicode, 'fixture');
  assert.equal(bindings.access(unicode, 0), 0);
  assert.equal(bindings.unlink(unicode), 0);
  assert.equal(fs.existsSync(unicode), false);
  passed('unicodePathAccessAndUnlink');
  assert.equal(bindings.getpid(), process.pid);
  assert.equal(bindings.getppid(), process.ppid);
  assert.ok(bindings.gethostname().length > 0);
  assert.equal(bindings.sleep(0), 0);
  passed('actualProcessAndHostname');
  const system = bindings.uname_fields().split('\n');
  assert.equal(system.length, 5);
  assert.equal(system[0], os.type());
  assert.equal(system[1], os.hostname());
  assert.equal(system[2], os.release());
  assert.equal(system[3], os.version());
  assert.equal(system[4], os.machine());
  passed('actualSystemInformation');
  const user = os.userInfo();
  assert.equal(bindings.geteuid() >>> 0, user.uid >>> 0);
  assert.equal(bindings.getegid() >>> 0, user.gid >>> 0);
  assert.equal(bindings.getuid() >>> 0, (process.getuid ? process.getuid() : user.uid) >>> 0);
  assert.equal(bindings.getgid() >>> 0, (process.getgid ? process.getgid() : user.gid) >>> 0);
  const byUid = bindings.getpwuid_r_str(user.uid, 65536).split('\n');
  const byName = bindings.getpwnam_r_str(user.username, 65536).split('\n');
  for (const entry of [byUid, byName]) {
    assert.equal(entry.length, 9);
    assert.equal(entry[0], '0');
    assert.equal(entry[1], '1');
    assert.equal(entry[2], user.username);
    assert.equal(Number(entry[4]) >>> 0, user.uid >>> 0);
    assert.equal(Number(entry[5]) >>> 0, user.gid >>> 0);
    assert.equal(entry[7], user.homedir);
    assert.equal(entry[8], user.shell ?? '');
  }
  passed('actualCurrentAccountByNameAndId');
  const small = bindings.getpwuid_r_str(user.uid, 1).split('\n');
  assert.notEqual(Number(small[0]), 0);
  assert.equal(small[1], '0');
  passed('accountBufferCapacityIsEnforced');
  console.log(JSON.stringify({platform: process.platform, selected, binarySha256, tests, failures: 0, errors: 0, skips: 0}));
} finally {
  if (descriptor >= 0) bindings.close(descriptor);
  fs.rmSync(directory, {recursive: true, force: true});
}
