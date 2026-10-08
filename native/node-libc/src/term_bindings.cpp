// term_bindings.cpp — N-API wrappers for terminal and ioctl functions
#include <napi.h>
#include <cerrno>
#include <cstring>

#ifndef _WIN32
#include <sys/ioctl.h>
#include <termios.h>
#include <unistd.h>
#endif

void RegisterTermBindings(Napi::Env env, Napi::Object exports) {
    // ioctl(fd, request, argBuffer)
    exports.Set("ioctl", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "ioctl requires at least 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        unsigned long request = static_cast<unsigned long>(info[1].As<Napi::Number>().Int64Value());
        void* argp = NULL;
        if (info.Length() >= 3 && info[2].IsTypedArray()) {
            auto arr = info[2].As<Napi::Uint8Array>();
            argp = arr.Data();
        }
        int res = ::ioctl(fd, request, argp);
        return Napi::Number::New(env, res);
#else
        (void)info;
        return Napi::Number::New(env, -1);
#endif
    }));

    // ioctlTiocgwinsz(fd) -> { rows: number, cols: number, xpixel: number, ypixel: number }
    exports.Set("ioctlTiocgwinsz", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#if !defined(_WIN32) && defined(TIOCGWINSZ)
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "ioctlTiocgwinsz requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        struct winsize ws;
        memset(&ws, 0, sizeof(ws));
        int res = ::ioctl(fd, TIOCGWINSZ, &ws);
        if (res == 0) {
            Napi::Object out = Napi::Object::New(env);
            out.Set("rows", Napi::Number::New(env, ws.ws_row));
            out.Set("cols", Napi::Number::New(env, ws.ws_col));
            out.Set("xpixel", Napi::Number::New(env, ws.ws_xpixel));
            out.Set("ypixel", Napi::Number::New(env, ws.ws_ypixel));
            return out;
        }
        return env.Null();
#else
        (void)info;
        return env.Null();
#endif
    }));

    // tcgetattr(fd) -> Uint8Array
    exports.Set("tcgetattr", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "tcgetattr requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        struct termios t;
        memset(&t, 0, sizeof(t));
        int res = ::tcgetattr(fd, &t);
        if (res == 0) {
            auto out = Napi::Uint8Array::New(env, sizeof(t));
            memcpy(out.Data(), &t, sizeof(t));
            return out;
        }
        return env.Null();
#else
        (void)info;
        return env.Null();
#endif
    }));

    // tcsetattr(fd, optional_actions, termiosBuffer)
    exports.Set("tcsetattr", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "tcsetattr requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        int optional_actions = info[1].As<Napi::Number>().Int32Value();
        auto arr = info[2].As<Napi::Uint8Array>();
        struct termios t;
        memset(&t, 0, sizeof(t));
        size_t copyLen = arr.ByteLength() < sizeof(t) ? arr.ByteLength() : sizeof(t);
        memcpy(&t, arr.Data(), copyLen);
        int res = ::tcsetattr(fd, optional_actions, &t);
        return Napi::Number::New(env, res);
#else
        (void)info;
        return Napi::Number::New(env, -1);
#endif
    }));

    // cfmakeraw(termiosBuffer) -> updates termiosBuffer in place
    exports.Set("cfmakeraw", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "cfmakeraw requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        auto arr = info[0].As<Napi::Uint8Array>();
        struct termios t;
        memset(&t, 0, sizeof(t));
        size_t copyLen = arr.ByteLength() < sizeof(t) ? arr.ByteLength() : sizeof(t);
        memcpy(&t, arr.Data(), copyLen);
        ::cfmakeraw(&t);
        memcpy(arr.Data(), &t, copyLen);
        return arr;
#else
        (void)info;
        return env.Null();
#endif
    }));
}
