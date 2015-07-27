package bugs.as.linkedresourcesbug;

import android.content.Context;

public class StringProvider {

    public static CharSequence getWelcomeMessage(Context ctx) {
        return ctx.getString(R.string.hello_world);
    }
}
