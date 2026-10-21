#include "../../../src/nativeInterop/cinterop/macro_parity_fixture.h"
#include <napi.h>
#include <cerrno>
#include <cstdint>
#include <charconv>
#include <cmath>
#include <limits>
#include <signal.h>
#include <cstdlib>
#include <cstring>
#include <cstdio>
#include <fcntl.h>
#include <limits.h>
#ifdef _WIN32
#include <io.h>
#include <sys/stat.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#include <uv.h>
#include <windows.h>
#else
#include <unistd.h>
#include <netdb.h>
#include <sys/mman.h>
#endif

static thread_local int rawLastError;
template <typename T>
static bool rawDecimal(const Napi::Value& value, T& result) {
    if (value.IsString()) {
        const std::string text = value.As<Napi::String>().Utf8Value();
        const auto parsed = std::from_chars(text.data(), text.data() + text.size(), result, 10);
        if (parsed.ec == std::errc() && parsed.ptr == text.data() + text.size()) return true;
    }
    Napi::TypeError::New(value.Env(), "Raw libc integer must be a complete decimal string within its declared width").ThrowAsJavaScriptException();
    return false;
}
static bool rawInt32(const Napi::Value& value, int& result) {
    if (value.IsNumber()) {
        const double number = value.As<Napi::Number>().DoubleValue();
        if (std::isfinite(number) && std::trunc(number) == number && number >= INT_MIN && number <= INT_MAX) {
            result = static_cast<int>(number);
            return true;
        }
    }
    Napi::TypeError::New(value.Env(), "Raw libc int32 argument must be an integer number within int32 range").ThrowAsJavaScriptException();
    return false;
}
static void* rawPointer(uint64_t address) {
    return reinterpret_cast<void*>(static_cast<uintptr_t>(address));
}
static Napi::String rawAddress(Napi::Env env, void* address) {
    int saved = errno;
    auto result = Napi::String::New(env, std::to_string(reinterpret_cast<uintptr_t>(address)));
    rawLastError = saved;
    return result;
}
static Napi::String rawCount(Napi::Env env, int64_t count) {
    int saved = errno;
    auto result = Napi::String::New(env, std::to_string(count));
    rawLastError = saved;
    return result;
}
static Napi::Number rawInteger(Napi::Env env, int value) {
    int saved = errno;
    auto result = Napi::Number::New(env, value);
    rawLastError = saved;
    return result;
}

static Napi::Value memoryLockValue(Napi::Env env, uint64_t address, uint64_t size, bool unlock) {
#ifdef _WIN32
    const BOOL result = unlock ? VirtualUnlock(rawPointer(address), static_cast<SIZE_T>(size))
                               : VirtualLock(rawPointer(address), static_cast<SIZE_T>(size));
    if (result) return rawInteger(env, 0);
    switch (GetLastError()) {
        case ERROR_INVALID_PARAMETER:
        case ERROR_NOT_LOCKED: errno = EINVAL; break;
        case ERROR_INVALID_ADDRESS:
        case ERROR_NOT_ENOUGH_MEMORY:
        case ERROR_WORKING_SET_QUOTA: errno = ENOMEM; break;
        case ERROR_ACCESS_DENIED: errno = EACCES; break;
        case ERROR_PRIVILEGE_NOT_HELD: errno = EPERM; break;
        default: errno = EIO; break;
    }
    return rawInteger(env, -1);
#else
    return rawInteger(env, unlock ? ::munlock(rawPointer(address), static_cast<size_t>(size))
                                  : ::mlock(rawPointer(address), static_cast<size_t>(size)));
#endif
}
static Napi::Value rawMemoryLock(const Napi::CallbackInfo& info, bool unlock) {
    uint64_t address, size;
    if (!rawDecimal(info[0], address) || !rawDecimal(info[1], size)) return info.Env().Undefined();
    return memoryLockValue(info.Env(), address, size, unlock);
}
static Napi::Value numericMemoryLock(const Napi::CallbackInfo& info, bool unlock) {
    uint64_t values[2];
    for (size_t index = 0; index < 2; ++index) {
        if (!info[index].IsNumber()) {
            Napi::TypeError::New(info.Env(), "Memory address and size must be safe integer numbers").ThrowAsJavaScriptException();
            return info.Env().Undefined();
        }
        const double value = info[index].As<Napi::Number>().DoubleValue();
        if (!std::isfinite(value) || std::trunc(value) != value || value < 0 || value > 9007199254740991.0) {
            Napi::TypeError::New(info.Env(), "Memory address and size must be safe integer numbers").ThrowAsJavaScriptException();
            return info.Env().Undefined();
        }
        values[index] = static_cast<uint64_t>(value);
    }
    return memoryLockValue(info.Env(), values[0], values[1], unlock);
}
Napi::Value rawMlock(const Napi::CallbackInfo& info) { return rawMemoryLock(info, false); }
Napi::Value rawMunlock(const Napi::CallbackInfo& info) { return rawMemoryLock(info, true); }
Napi::Value numericMlock(const Napi::CallbackInfo& info) { return numericMemoryLock(info, false); }
Napi::Value numericMunlock(const Napi::CallbackInfo& info) { return numericMemoryLock(info, true); }

Napi::Value rawKill(const Napi::CallbackInfo& info) {
    int pid, sig;
    if (!rawInt32(info[0], pid) || !rawInt32(info[1], sig)) return info.Env().Undefined();
#ifdef _WIN32
    const int status = uv_kill(pid, sig);
    if (status == 0) return rawInteger(info.Env(), 0);
    switch (status) {
        case UV_ESRCH: errno = ESRCH; break;
        case UV_EINVAL: errno = EINVAL; break;
        case UV_EPERM: errno = EPERM; break;
        case UV_EACCES: errno = EACCES; break;
        case UV_ENOSYS: errno = ENOSYS; break;
        case UV_ENOTSUP: errno = ENOTSUP; break;
        default: errno = EIO; break;
    }
    return rawInteger(info.Env(), -1);
#else
    return rawInteger(info.Env(), ::kill(static_cast<pid_t>(pid), sig));
#endif
}

void RegisterRawBindings(Napi::Env env, Napi::Object exports) {
    exports.Set("rawKill", Napi::Function::New(env, rawKill));
    exports.Set("rawMlock", Napi::Function::New(env, rawMlock));
    exports.Set("rawMunlock", Napi::Function::New(env, rawMunlock));
    exports.Set("macroLayoutValue", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int index;
        if (!rawInt32(info[0], index)) return info.Env().Undefined();
        return Napi::String::New(info.Env(), std::to_string(libc_macro_layout_value(index)));
    }));
    exports.Set("rawAbiVersion", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return Napi::Number::New(info.Env(), 2);
    }));
    exports.Set("rawNumericNameinfoFlags", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return Napi::Number::New(info.Env(), NI_NUMERICHOST | NI_NUMERICSERV);
    }));
    exports.Set("rawOpenFlag", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int index;
        if (!rawInt32(info[0], index)) return info.Env().Undefined();
        const int values[] = { O_RDONLY, O_WRONLY, O_RDWR, O_CREAT, O_TRUNC, SEEK_SET,
#ifdef _WIN32
        _O_BINARY
#else
        0
#endif
    };
        if (index < 0 || index >= 7) { errno = EINVAL; return rawInteger(info.Env(), -1); }
        return Napi::Number::New(info.Env(), values[index]);
    }));
    exports.Set("rawDescriptorCommand", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int index;
        if (!rawInt32(info[0], index)) return info.Env().Undefined();
#ifdef _WIN32
        return Napi::Number::New(info.Env(), -1);
#else
        const int values[] = { F_GETFD, F_SETFD, FD_CLOEXEC, EBADF };
        if (index < 0 || index >= 4) { errno = EINVAL; return rawInteger(info.Env(), -1); }
        return Napi::Number::New(info.Env(), values[index]);
#endif
    }));
    exports.Set("rawAllocate", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        uint64_t size;
        if (!rawDecimal(info[0], size)) return info.Env().Undefined();
        return rawAddress(info.Env(), std::malloc(static_cast<size_t>(size)));
    }));
    exports.Set("rawAllocateZeroed", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        uint64_t count, size;
        if (!rawDecimal(info[0], count) || !rawDecimal(info[1], size)) return info.Env().Undefined();
        return rawAddress(info.Env(), std::calloc(static_cast<size_t>(count), static_cast<size_t>(size)));
    }));
    exports.Set("rawResize", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        uint64_t address, size;
        if (!rawDecimal(info[0], address) || !rawDecimal(info[1], size)) return info.Env().Undefined();
        return rawAddress(info.Env(), std::realloc(rawPointer(address), static_cast<size_t>(size)));
    }));
    exports.Set("rawRelease", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        uint64_t address;
        if (!rawDecimal(info[0], address)) return info.Env().Undefined();
        std::free(rawPointer(address)); rawLastError = errno; return info.Env().Undefined();
    }));
    exports.Set("rawFill", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        uint64_t address, size;
        int value;
        if (!rawDecimal(info[0], address) || !rawInt32(info[1], value) || !rawDecimal(info[2], size)) return info.Env().Undefined();
        return rawAddress(info.Env(), std::memset(rawPointer(address), value, static_cast<size_t>(size)));
    }));
    exports.Set("rawCopy", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        uint64_t destination, source, size;
        if (!rawDecimal(info[0], destination) || !rawDecimal(info[1], source) || !rawDecimal(info[2], size)) return info.Env().Undefined();
        return rawAddress(info.Env(), std::memcpy(rawPointer(destination), rawPointer(source), static_cast<size_t>(size)));
    }));
    exports.Set("rawCompare", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        uint64_t first, second, size;
        if (!rawDecimal(info[0], first) || !rawDecimal(info[1], second) || !rawDecimal(info[2], size)) return info.Env().Undefined();
        return rawInteger(info.Env(), std::memcmp(rawPointer(first), rawPointer(second), static_cast<size_t>(size)));
    }));
    exports.Set("rawOpen", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int flags, mode;
        if (!rawInt32(info[1], flags) || !rawInt32(info[2], mode)) return info.Env().Undefined();
        if (info[0].IsNull() || info[0].IsUndefined()) { errno = EFAULT; return rawInteger(info.Env(), -1); }
        if (!info[0].IsString()) {
            Napi::TypeError::New(info.Env(), "Raw libc path must be a string or null").ThrowAsJavaScriptException();
            return info.Env().Undefined();
        }
        std::string path = info[0].As<Napi::String>().Utf8Value();

#ifdef _WIN32
        return rawInteger(info.Env(), _open(path.c_str(), flags, mode));
#else
        return rawInteger(info.Env(), ::open(path.c_str(), flags, static_cast<mode_t>(mode)));
#endif
    }));
    exports.Set("rawClose", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int fd;
        if (!rawInt32(info[0], fd)) return info.Env().Undefined();
#ifdef _WIN32
        return rawInteger(info.Env(), _close(fd));
#else
        return rawInteger(info.Env(), ::close(fd));
#endif
    }));
    exports.Set("rawRead", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int fd;
        uint64_t address, size;
        if (!rawInt32(info[0], fd) || !rawDecimal(info[1], address) || !rawDecimal(info[2], size)) return info.Env().Undefined();

#ifdef _WIN32
        if (fd < 0) { errno = EBADF; return rawCount(info.Env(), -1); }
        if (size > INT_MAX || address == 0) { errno = EINVAL; return rawCount(info.Env(), -1); }
        return rawCount(info.Env(), _read(fd, rawPointer(address), static_cast<unsigned int>(size)));
#else
        return rawCount(info.Env(), ::read(fd, rawPointer(address), static_cast<size_t>(size)));
#endif
    }));
    exports.Set("rawWrite", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int fd;
        uint64_t address, size;
        if (!rawInt32(info[0], fd) || !rawDecimal(info[1], address) || !rawDecimal(info[2], size)) return info.Env().Undefined();

#ifdef _WIN32
        if (fd < 0) { errno = EBADF; return rawCount(info.Env(), -1); }
        if (size > INT_MAX || address == 0) { errno = EINVAL; return rawCount(info.Env(), -1); }
        return rawCount(info.Env(), _write(fd, rawPointer(address), static_cast<unsigned int>(size)));
#else
        return rawCount(info.Env(), ::write(fd, rawPointer(address), static_cast<size_t>(size)));
#endif
    }));
    exports.Set("rawSeek", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int fd, whence;
        int64_t offset;
        if (!rawInt32(info[0], fd) || !rawDecimal(info[1], offset) || !rawInt32(info[2], whence)) return info.Env().Undefined();

#ifdef _WIN32
        if (fd < 0) { errno = EBADF; return rawCount(info.Env(), -1); }
        if ((whence != SEEK_SET && whence != SEEK_CUR && whence != SEEK_END) || (whence == SEEK_SET && offset < 0)) {
            errno = EINVAL;
            return rawCount(info.Env(), -1);
        }
        return rawCount(info.Env(), _lseeki64(fd, offset, whence));
#else
        return rawCount(info.Env(), ::lseek(fd, static_cast<off_t>(offset), whence));
#endif
    }));
    exports.Set("rawErrno", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        return Napi::Number::New(info.Env(), rawLastError);
    }));
    exports.Set("rawOpenFlags", Napi::Function::New(env, [](const Napi::CallbackInfo& info) {
        int values[] = { O_RDONLY, O_WRONLY, O_RDWR, O_CREAT, O_TRUNC, SEEK_SET,
#ifdef _WIN32
        _O_BINARY
#else
        0
#endif
    };
        Napi::Array result = Napi::Array::New(info.Env(), 7);
        for (uint32_t i = 0; i < 7; ++i) result.Set(i, values[i]);
        return result;
    }));
    exports.Set("rawDescriptorCommands", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
#ifdef _WIN32
        return info.Env().Null();
#else
        int values[] = { F_GETFD, F_SETFD, FD_CLOEXEC, EBADF };
        Napi::Array result = Napi::Array::New(info.Env(), 4);
        for (uint32_t i = 0; i < 4; ++i) result.Set(i, values[i]);
        return result;
#endif
    }));
    exports.Set("rawFcntlNoArgument", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int fd, command;
        if (!rawInt32(info[0], fd) || !rawInt32(info[1], command)) return info.Env().Undefined();
#ifdef _WIN32
        errno = ENOSYS; return rawInteger(info.Env(), -1);
#else
        return rawInteger(info.Env(), ::fcntl(fd, command));
#endif
    }));
    exports.Set("rawFcntlInteger", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int fd, command;
        int argument;
        if (!rawInt32(info[0], fd) || !rawInt32(info[1], command) || !rawInt32(info[2], argument)) return info.Env().Undefined();
#ifdef _WIN32
        errno = ENOSYS; return rawInteger(info.Env(), -1);
#else
        return rawInteger(info.Env(), ::fcntl(fd, command, argument));
#endif
    }));
    exports.Set("rawFcntlPointer", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        int fd, command;
        uint64_t address;
        if (!rawInt32(info[0], fd) || !rawInt32(info[1], command) || !rawDecimal(info[2], address)) return info.Env().Undefined();
#ifdef _WIN32
        errno = ENOSYS; return rawInteger(info.Env(), -1);
#else
        return rawInteger(info.Env(), ::fcntl(fd, command, rawPointer(address)));
#endif
    }));
}
