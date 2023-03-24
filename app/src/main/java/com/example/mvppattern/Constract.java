package com.example.mvppattern;

public interface Constract {
    interface IView{
        void showLoginSuccess();
        void showLoginFailed();
    }
    interface IPresenter{
        void doLogin(String email, String password);
        void forgotPassword();
    }
}
