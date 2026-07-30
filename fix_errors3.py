#!/usr/bin/env python3
"""
Fix bulk Kotlin compilation errors in libc-kotlin — pass 3.

Handles remaining patterns:
1. Hex literal suffix mismatches: 0x540AuL where type is Int -> remove uL
2. BigInteger actual type (from or expressions) -> .toInt() conversion
3. Remaining type mismatches
4. Unresolved references that are private const definitions not ported
"""

import re
import os
import sys
from collections import defaultdict

BASE = "/Volumes/stuff/Projects/kotlinmania/libc-kotlin"

def parse_errors(error_file):
    errors = []
    with open(error_file) as f:
        for line in f:
            line = line.strip()
            if not line.startswith("e:"):
                continue
            m = re.match(r'e: file://(/[^:]+):(\d+):(\d+)\s+(.*)', line)
            if not m:
                continue
            errors.append({
                'file': m.group(1),
                'line': int(m.group(2)),
                'col': int(m.group(3)),
                'msg': m.group(4),
            })
    return errors

def fix_hex_suffix(line, expected, actual):
    """Fix hex literal suffixes: 0x540AuL -> 0x540A (if expected is Int)."""
    if expected == 'Int' and actual == 'ULong':
        # Remove uL from hex literals
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)uL\b', r'\1', line)
        if new_line != line:
            return new_line
        # Also try removing just L
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)L\b', r'\1', line)
        if new_line != line:
            return new_line
    elif expected == 'ULong' and actual == 'Int':
        # Add uL to hex literals without suffix
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)(?=\s*$)(?![0-9A-Fa-f]*[uUL])', r'\1uL', line)
        if new_line != line:
            return new_line
    elif expected == 'UInt' and actual == 'Int':
        # Add u to hex literals
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)(?=\s*$)(?![0-9A-Fa-f]*[uUL])', r'\1u', line)
        if new_line != line:
            return new_line
    elif expected == 'Long' and actual == 'Int':
        # Add L to hex literals
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)(?=\s*$)(?![0-9A-Fa-f]*[uUL])', r'\1L', line)
        if new_line != line:
            return new_line
    elif expected == 'Int' and actual == 'UInt':
        # Remove u from hex literals
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)u\b', r'\1', line)
        if new_line != line:
            return new_line
    elif expected == 'UInt' and actual == 'ULong':
        # Change uL to u on hex literals
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)uL\b', r'\1u', line)
        if new_line != line:
            return new_line
    elif expected == 'Long' and actual == 'ULong':
        # Change uL to L
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)uL\b', r'\1L', line)
        if new_line != line:
            return new_line
    elif expected == 'Long' and actual == 'UInt':
        # Change u to L
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)u\b', r'\1L', line)
        if new_line != line:
            return new_line
    elif expected == 'ULong' and actual == 'UInt':
        # Change u to uL
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)u\b(?!L)', r'\1uL', line)
        if new_line != line:
            return new_line

    # UByte/Byte/Short/UShort type mismatches
    if expected == 'UByte' and actual == 'UInt':
        # 0x1234u -> 0x1234u (already unsigned, might need .toUByte())
        pass
    if expected == 'UInt' and actual == 'UByte':
        # Add .toUInt() to UByte values? No, UByte should auto-widen to UInt in most contexts
        pass

    return None

def fix_bigint(line, expected):
    """Fix BigInteger actual type (from or expressions with other vals)."""
    # The issue is expressions like: _TIOC or 1 where _TIOC is unresolved
    # or expressions like: O_DIRECTORY or O_TMPFILE where types don't match
    # These are mostly unresolved reference cascade errors
    return None

def fix_decimal_suffix(line, expected, actual):
    """Fix decimal literal suffix mismatches (same as pass 1 but more thorough)."""
    suffix_map = {
        ('Int', 'ULong'): [(r'(\d)uL\b', r'\1'), (r'(\d)uL(?=\s|$|,|\))', r'\1')],
        ('Int', 'Long'): [(r'(\d)L\b', r'\1'), (r'(\d)L(?=\s|$|,|\))', r'\1')],
        ('Int', 'UInt'): [(r'(\d)u\b(?!L)', r'\1'), (r'(\d)u(?=\s|$|,|\))(?!L)', r'\1')],
        ('ULong', 'Int'): [(r'(\d)(?=\s*$)(?!\d*[uUlL])', r'\1uL')],
        ('ULong', 'UInt'): [(r'(\d)u\b(?!L)', r'\1uL'), (r'(\d)u(?=\s|$|,|\))(?!L)', r'\1uL')],
        ('ULong', 'Long'): [(r'(\d)L\b', r'\1uL'), (r'(\d)L(?=\s|$|,|\))', r'\1uL')],
        ('UInt', 'Int'): [(r'(\d)(?=\s*$)(?!\d*[uUlL])', r'\1u')],
        ('UInt', 'ULong'): [(r'(\d)uL\b', r'\1u'), (r'(\d)uL(?=\s|$|,|\))', r'\1u')],
        ('UInt', 'Long'): [(r'(\d)L\b', r'\1u'), (r'(\d)L(?=\s|$|,|\))', r'\1u')],
        ('Long', 'Int'): [(r'(\d)(?=\s*$)(?!\d*[uUlL])', r'\1L')],
        ('Long', 'ULong'): [(r'(\d)uL\b', r'\1L'), (r'(\d)uL(?=\s|$|,|\))', r'\1L')],
        ('Long', 'UInt'): [(r'(\d)u\b(?!L)', r'\1L'), (r'(\d)u(?=\s|$|,|\))(?!L)', r'\1L')],
    }

    fixes = suffix_map.get((expected, actual), [])
    new_line = line
    for pattern, replacement in fixes:
        new_line = re.sub(pattern, replacement, new_line)
        if new_line != line:
            return new_line
    
    return None

def fix_type_mismatch(line, expected, actual):
    """Try all type mismatch fix strategies."""
    # First try hex suffix fix
    result = fix_hex_suffix(line, expected, actual)
    if result and result != line:
        return result

    # Try decimal suffix fix
    result = fix_decimal_suffix(line, expected, actual)
    if result and result != line:
        return result

    # Handle .inv() patterns
    if actual == 'Int' and expected in ('ULong', 'UInt', 'Long'):
        new_line = line
        if expected == 'ULong':
            new_line = line.replace('0.inv()', '0.toULong().inv()')
        elif expected == 'UInt':
            new_line = line.replace('0.inv()', '0.toUInt().inv()')
        elif expected == 'Long':
            new_line = line.replace('0.inv()', '0.toLong().inv()')
        if new_line != line:
            return new_line

    # Handle hex overflow for Int (0x80000000 -> -2147483648)
    if expected == 'Int' and actual in ('Long', 'BigInteger'):
        def replace_hex(m):
            hex_str = m.group(1)
            try:
                val = int(hex_str, 16)
                if val > 0x7FFFFFFF and val <= 0xFFFFFFFF:
                    signed = val - 0x100000000
                    return str(signed)
                return m.group(0)
            except:
                return m.group(0)
        new_line = re.sub(r'0x([0-9A-Fa-f]{8,})\b', replace_hex, line)
        if new_line != line:
            return new_line

    # Handle shl patterns
    if 'shl' in line:
        if expected == 'ULong' and actual == 'Int':
            new_line = re.sub(r'(\d+)\s+shl\s+(\d+)uL', r'\1.toULong() shl \2', line)
            if new_line != line:
                return new_line
        if expected == 'UInt' and actual == 'Int':
            new_line = re.sub(r'(\d+)\s+shl\s+(\d+)u\b', r'\1.toUInt() shl \2', line)
            if new_line != line:
                return new_line

    # Handle UByte to UInt mismatch — add .toUInt()
    if expected == 'UInt' and actual == 'UByte':
        # This is usually an argument mismatch, not a literal issue
        pass

    return None

def fix_restrict_params(line):
    """Fix 'restrict' parameter name conflicts (Rust restrict -> Kotlin restrict keyword)."""
    # The pattern: fun foo(restrict: Type?, ...) -> fun foo(restrict: Type?, ...)
    # Kotlin doesn't have 'restrict' keyword, but multiple params named 'restrict' conflict
    if line.count('restrict:') > 1:
        # Rename duplicates: first stays, rest get numbered
        parts = line.split('restrict:')
        result = parts[0]
        for i in range(1, len(parts)):
            suffix = '' if i == 1 else str(i)
            result += f'restrict{suffix}:' + parts[i]
        return result
    return None

def main():
    error_file = sys.argv[1] if len(sys.argv) > 1 else "/tmp/libc_errors3.txt"
    errors = parse_errors(error_file)
    print(f"Total errors parsed: {len(errors)}")

    by_file = defaultdict(list)
    for err in errors:
        by_file[err['file']].append(err)

    fixed_type = 0
    fixed_restrict = 0
    fixed_const = 0

    for filepath, file_errors in sorted(by_file.items()):
        if not filepath.startswith(BASE):
            continue
        if not os.path.exists(filepath):
            continue

        with open(filepath) as f:
            lines = f.readlines()

        modified_lines = set()
        file_changed = False

        file_errors.sort(key=lambda e: e['line'])
        for err in file_errors:
            lineno = err['line']
            msg = err['msg']

            if lineno in modified_lines:
                continue

            if 'Initializer type mismatch' in msg or 'Argument type mismatch' in msg:
                m = re.search(r"expected '(\w+)'[,.]\s*(?:actual|but).*?'(\w+)'", msg)
                if not m:
                    m = re.search(r"actual type is '(\w+)', but '(\w+)' was expected", msg)
                    if m:
                        actual, expected = m.group(1), m.group(2)
                    else:
                        continue
                else:
                    expected, actual = m.group(1), m.group(2)

                idx = lineno - 1
                if idx >= len(lines):
                    continue
                old_line = lines[idx]
                new_line = fix_type_mismatch(old_line, expected, actual)
                if new_line and new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_type += 1
                    file_changed = True

            elif 'Conflicting declarations' in msg and 'restrict' in msg.lower():
                idx = lineno - 1
                if idx >= len(lines):
                    continue
                old_line = lines[idx]
                new_line = fix_restrict_params(old_line)
                if new_line and new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_restrict += 1
                    file_changed = True

            elif "Const 'val' initializer must be a constant" in msg or "must be initialized" in msg:
                idx = lineno - 1
                if idx >= len(lines):
                    continue
                old_line = lines[idx]
                new_line = old_line.replace('public const val', 'public val', 1)
                new_line = new_line.replace('const val', 'val', 1)
                if new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_const += 1
                    file_changed = True

        if file_changed:
            with open(filepath, 'w') as f:
                f.writelines(lines)

    print(f"Fixed type mismatches: {fixed_type}")
    print(f"Fixed restrict params: {fixed_restrict}")
    print(f"Fixed const val: {fixed_const}")
    print(f"Total fixes: {fixed_type + fixed_restrict + fixed_const}")

if __name__ == '__main__':
    main()