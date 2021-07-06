package com.reakabc.mvplogin.Presenter;

import com.reakabc.mvplogin.Model.User;
import com.reakabc.mvplogin.View.ILoginView;

public class LoginPresenter implements ILoginPresenter{

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {

        User user = new User(email, password);
        boolean isValid = user.isUserValid();

        if (isValid) loginView.onLoginResult("Login success");
        else loginView.onLoginResult("Error");

    }
}
