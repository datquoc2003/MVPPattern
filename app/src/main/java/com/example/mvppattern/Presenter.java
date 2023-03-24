package com.example.mvppattern;

public class Presenter implements Constract.IPresenter {
    private Constract.IView mView;

    public Presenter(MainActivity view) {
        mView = view;
    }

    @Override
    public void doLogin(String email, String password) {
        if (email.equals("admin") && password.equals("123")) {
            mView.showLoginSuccess();
        }else{
            mView.showLoginFailed();
        }
    }

    @Override
    public void forgotPassword() {

    }
}
