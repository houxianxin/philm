package app.philm.in.state;

import android.accounts.Account;

interface BaseState {

    public String getUsername();

    public String getHashedPassword();

    public Account getCurrentAccount();

    public void registerForEvents(Object receiver);

    public void unregisterForEvents(Object receiver);

}
