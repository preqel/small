package small.preqel.com.smallt;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by preqel on 2018/4/3.
 */

public class SmalApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Small.preSetUp(this);
    }
}
