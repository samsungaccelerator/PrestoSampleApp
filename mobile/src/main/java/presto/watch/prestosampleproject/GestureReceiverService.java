package presto.watch.prestosampleproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import watch.nudge.phonegesturelibrary.AppLaunchReceiverService;

public class GestureReceiverService extends AppLaunchReceiverService {
    public GestureReceiverService() {
    }

    @Override
    protected Class getPhoneActivityClass() {
        return MainActivity.class;
    }

}
