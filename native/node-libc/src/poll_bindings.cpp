// poll_bindings.cpp — N-API wrappers for C poll and select functions
#include <napi.h>
#include <cerrno>
#include <cstring>
#include <vector>

#ifndef _WIN32
#include <poll.h>
#include <sys/select.h>
#include <sys/time.h>
#include <unistd.h>
#else
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <winsock2.h>
#endif

void RegisterPollBindings(Napi::Env env, Napi::Object exports) {
    // poll(fdsArray, timeout)
    // fdsArray: [{ fd: number, events: number }, ...]
    // updates revents in place and returns number of ready descriptors
    exports.Set("poll", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "poll requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        auto arr = info[0].As<Napi::Array>();
        int timeout = info[1].As<Napi::Number>().Int32Value();
        uint32_t len = arr.Length();
        if (len == 0) return Napi::Number::New(env, 0);

        std::vector<struct pollfd> pfds(len);
        for (uint32_t i = 0; i < len; i++) {
            Napi::Value item = arr.Get(i);
            if (item.IsObject()) {
                Napi::Object obj = item.As<Napi::Object>();
                pfds[i].fd = obj.Get("fd").As<Napi::Number>().Int32Value();
                pfds[i].events = static_cast<short>(obj.Get("events").As<Napi::Number>().Int32Value());
                pfds[i].revents = 0;
            }
        }

        int res = ::poll(pfds.data(), len, timeout);
        if (res >= 0) {
            for (uint32_t i = 0; i < len; i++) {
                Napi::Value item = arr.Get(i);
                if (item.IsObject()) {
                    item.As<Napi::Object>().Set("revents", Napi::Number::New(env, pfds[i].revents));
                }
            }
        }
        return Napi::Number::New(env, res);
#else
        (void)info;
        return Napi::Number::New(env, -1);
#endif
    }));

    // select(readFds, writeFds, exceptFds, timeoutMs)
    exports.Set("select", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        if (info.Length() < 4) {
            Napi::TypeError::New(env, "select requires 4 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        fd_set rfds, wfds, efds;
        FD_ZERO(&rfds);
        FD_ZERO(&wfds);
        FD_ZERO(&efds);

        int maxFd = -1;
        if (!info[0].IsNull() && !info[0].IsUndefined() && info[0].IsArray()) {
            auto arr = info[0].As<Napi::Array>();
            for (uint32_t i = 0; i < arr.Length(); i++) {
                int fd = arr.Get(i).As<Napi::Number>().Int32Value();
                FD_SET(fd, &rfds);
                if (fd > maxFd) maxFd = fd;
            }
        }
        if (!info[1].IsNull() && !info[1].IsUndefined() && info[1].IsArray()) {
            auto arr = info[1].As<Napi::Array>();
            for (uint32_t i = 0; i < arr.Length(); i++) {
                int fd = arr.Get(i).As<Napi::Number>().Int32Value();
                FD_SET(fd, &wfds);
                if (fd > maxFd) maxFd = fd;
            }
        }
        if (!info[2].IsNull() && !info[2].IsUndefined() && info[2].IsArray()) {
            auto arr = info[2].As<Napi::Array>();
            for (uint32_t i = 0; i < arr.Length(); i++) {
                int fd = arr.Get(i).As<Napi::Number>().Int32Value();
                FD_SET(fd, &efds);
                if (fd > maxFd) maxFd = fd;
            }
        }

        struct timeval tv;
        struct timeval* ptv = NULL;
        if (!info[3].IsNull() && !info[3].IsUndefined()) {
            double ms = info[3].As<Napi::Number>().DoubleValue();
            if (ms >= 0) {
                tv.tv_sec = static_cast<time_t>(ms / 1000.0);
                tv.tv_usec = static_cast<suseconds_t>((ms - (tv.tv_sec * 1000.0)) * 1000.0);
                ptv = &tv;
            }
        }

        int res = ::select(maxFd + 1,
                           info[0].IsArray() ? &rfds : NULL,
                           info[1].IsArray() ? &wfds : NULL,
                           info[2].IsArray() ? &efds : NULL,
                           ptv);
        return Napi::Number::New(env, res);
#else
        (void)info;
        return Napi::Number::New(env, -1);
#endif
    }));
}
